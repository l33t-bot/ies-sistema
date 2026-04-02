using ies.WinForms.Core.Correlatividades;
using ies.WinForms.Core.Materias;
using ies.WinForms.Infrastructure;
using ies.WinForms.Utils;
using System;
using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ies.WinForms.Forms.Views
{
    public partial class CorrelatividadesView : Form
    {
        private readonly CorrelatividadManager _manager;
        private readonly MateriaService _materiaService;

        private CorrelatividadDto _correlatividadSeleccionada;
        private readonly MateriaDto _materiaSeleccionada;

        public CorrelatividadesView(MateriaDto materiaSeleccionada)
        {
            this.StartPosition = FormStartPosition.CenterParent;
            InitializeComponent();

            _materiaSeleccionada = materiaSeleccionada;

            ICorrelatividadService correlatividadService = new CorrelatividadService();
            _manager = new CorrelatividadManager(correlatividadService);
            _materiaService = new MateriaService();

            this.Load += CorrelatividadView_Load;
        }

        private async void CorrelatividadView_Load(object sender, EventArgs e)
        {
            try
            {
                ConfigurarFormualiroInicial(); // Estado inicial del formulario
                ConfiguracionGrid(); // Configuración de columnas
                CargarTipos(); // cargar del cmb sin consultas
                await CargarMaterias(); // carga del cmb filtrando las materias
                // carga de correlatividades en el grid
                await CargarCorrelatividadesEnGrid(_materiaSeleccionada.idMateria);
            }
            catch (Exception ex)
            {
                MessageHelper.Error(ex.Message, true);
            }
        }

        private void ConfigurarFormualiroInicial()
        {
            dgvCorrelativas.DataSource = null;
            txtMateria.Text = _materiaSeleccionada.nombre;
        }

        private CorrelatividadDto MapearFormulario()
        {
            if (cmbMaterias.SelectedValue == null)
                throw new Exception("Debe seleccionar una materia");

            if (cmbTipo.SelectedValue == null)
                throw new Exception("Debe seleccionar el tipo de correlativida");

            return new CorrelatividadDto
            {
                idCorrelatividad = 0,
                idMateriaPrincipal = _materiaSeleccionada.idMateria,
                idMateriaRequisito = Convert.ToInt64(cmbMaterias.SelectedValue),
                tipoCorrelativa = cmbTipo.SelectedValue.ToString(),
                activo = true
            };
        }

        #region CONFIGURACION DE LA TABLA
        private void ConfiguracionGrid()
        {
            dgvCorrelativas.AutoGenerateColumns = false;
            dgvCorrelativas.Columns.Clear();

            dgvCorrelativas.Columns.Add(new DataGridViewTextBoxColumn
            {
                DataPropertyName = "idCorrelatividad",
                HeaderText = "ID"
            });

            dgvCorrelativas.Columns.Add(new DataGridViewTextBoxColumn
            {
                DataPropertyName = "nombreMateriaRequisito",
                HeaderText = "Nombre"
            });

            dgvCorrelativas.Columns.Add(new DataGridViewTextBoxColumn
            {
                DataPropertyName = "tipoCorrelativa",
                HeaderText = "Tipo"
            });

            dgvCorrelativas.Columns.Add(new DataGridViewCheckBoxColumn
            {

                DataPropertyName = "activo",
                HeaderText = "Activa"
            });
        }


        #endregion

        #region EVENTOS COMBOBOX
        
        #endregion

        #region CARGA DE MATERIAS, TIPO CORRELATIVIDAD, RECARGA DEL GRID
        // tendría que crear un CargasHeplper para este tipo de funciones?
        private async Task CargarCorrelatividadesEnGrid(long? idMateriaPrincipal)
        {
            var lista = await _manager.ObtenerPorMateriaPrincipal(idMateriaPrincipal);
            dgvCorrelativas.DataSource = lista;
        }

        private async Task CargarMaterias()
        {
            var materias = await _materiaService.ObtenerTodasAsync();

            var filtradas = materias.Where(
                m =>
                m.idPlan == _materiaSeleccionada.idPlan &&
                m.anioCarrera < _materiaSeleccionada.anioCarrera &&
                m.idMateria != _materiaSeleccionada.idMateria
            ).ToList();

            cmbMaterias.DataSource = filtradas;
            cmbMaterias.DisplayMember = "nombre";
            cmbMaterias.ValueMember = "idMateria";

            cmbMaterias.SelectedIndex = -1;
        }

        private void CargarTipos()
            // mejorar la carga de tipos usando la clase TipoCorrelatividad
            // del backend para evitar cargas manuales para posibles futuras
            // actualizaciones
        {
            cmbTipo.Items.Clear();

            cmbTipo.Items.Add("REGULAR");
            cmbTipo.Items.Add("APROBADA");

            cmbTipo.SelectedIndex = -1;
        }

        private async Task RecargarCorrelatividades()
        {
            var lista = await _manager.ObtenerPorMateriaPrincipal(_materiaSeleccionada.idMateria);

            dgvCorrelativas.DataSource = null;
            dgvCorrelativas.DataSource = lista;
        }
        #endregion

        #region LOGICA DE BOTONES
        private void btnCerrarBarraTitulo_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void btnCerrar_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private async void btnAgregar_Click(object sender, EventArgs e)
        {
            try
            {
                if (cmbMaterias.SelectedValue == null)
                {
                    MessageHelper.Info("Seleccione una Materia requisito");
                    return;
                }

                if (cmbTipo.SelectedItem == null)
                {
                    MessageHelper.Info("Seleccione el tipo de correlativa");
                    return;
                }

                var dto = new CorrelatividadDto
                {
                    idMateriaPrincipal = _materiaSeleccionada.idMateria,
                    idMateriaRequisito = (long)cmbMaterias.SelectedValue,
                    tipoCorrelativa = cmbTipo.SelectedItem.ToString(),
                    activo = true
                };

                await _manager.Guardar(dto);

                MessageHelper.Success("Correlatividad agregada correctamente");

                await RecargarCorrelatividades();
                await CargarMaterias(); // para regrescar combo

                cmbTipo.SelectedIndex = -1;
            }
            catch(Exception ex)
            {
                MessageHelper.Error(ex.Message, true);
            }
            
        }

        private async void btnEliminar_Click(object sender, EventArgs e)
        {
            if (dgvCorrelativas.CurrentRow == null)
            {
                MessageHelper.Info("Seleccione una correlatividad");
                return;
            }

            var correlatividad = dgvCorrelativas.CurrentRow.DataBoundItem as CorrelatividadDto;

            if (correlatividad == null)
            {
                MessageHelper.Error("No se puede obtener la correlatividad");
                return;
            }

            if (!MessageHelper.Confirm("¿Eliminar correlatividad?")) return;

            try
            {
                await _manager.Eliminar(correlatividad.idCorrelatividad.Value);

                MessageHelper.Success("Correlatividad eliminada");

                await RecargarCorrelatividades();
                await CargarMaterias();
            }
            catch (Exception ex)
            {
                MessageHelper.Error(ex.Message, true);
            }
        }
        #endregion
    }
}