using ies.WinForms.Core.Materias;
using ies.WinForms.Infrastructure;
using ies.WinForms.Models;
using ies.WinForms.Services;
using ies.WinForms.Utils;
using System;
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
    public partial class MateriasView : Form
    {
        private readonly MateriaManager _manager;
        private readonly PlanService _planService;
        private readonly CarreraService _carreraService;

        private bool _modoEdicion = false;
        private MateriaDto _materiaSeleccionada;

        public MateriasView()
        {
            InitializeComponent();

            IMateriaService materiaService = new MateriaService();

            _manager = new MateriaManager(materiaService);
            _planService = new PlanService();
            _carreraService = new CarreraService();

            this.Load += MateriasView_Load;
        }

        private async void MateriasView_Load(object sender, EventArgs e)
        {
            ConfigurarFormularioInicial();
            ConfiguracionGrid();
            await CargarCarreras();
            await CargarMaterias();
        }

        private void ConfigurarFormularioInicial()
        {
            gbDetalles.Enabled = false;

            cmbCarreras.SelectedIndex = -1;
            cmbPlanes.SelectedIndex = -1;

            dgvMaterias.DataSource = null;
        }

        #region Configuración de la TABLA
        private void ConfiguracionGrid()
        {
            dgvMaterias.AutoGenerateColumns = false;
            dgvMaterias.Columns.Clear();

            dgvMaterias.Columns.Add(new DataGridViewTextBoxColumn
            {
                DataPropertyName = "idMateria",
                HeaderText = "ID"
            });

            dgvMaterias.Columns.Add(new DataGridViewTextBoxColumn
            {
                DataPropertyName = "idPlan",
                HeaderText = "Plan"
            });

            dgvMaterias.Columns.Add(new DataGridViewTextBoxColumn
            {
                DataPropertyName = "codigo",
                HeaderText = "Código"
            });

            dgvMaterias.Columns.Add(new DataGridViewTextBoxColumn
            {
                DataPropertyName = "nombre",
                HeaderText = "Materia"
            });

            dgvMaterias.Columns.Add(new DataGridViewTextBoxColumn
            {
                DataPropertyName = "anioCarrera",
                HeaderText = "Año"
            });

            dgvMaterias.Columns.Add(new DataGridViewCheckBoxColumn
            {
                DataPropertyName = "esPromocional",
                HeaderText = "Promocional"
            });

            dgvMaterias.Columns.Add(new DataGridViewCheckBoxColumn
            {
                DataPropertyName = "activa",
                HeaderText = "Activa"
            });
        }
        #endregion

        #region EVENTOS COMBOBOX
        
        private async void cmbCarreras_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (cmbCarreras.SelectedValue == null)
                return;

            long idPlan = Convert.ToInt64(cmbCarreras.SelectedValue);

            await CargarMateriasPorPlan(idPlan);
        }

        #endregion

        #region Tareas CARGAR: MATERIAS, CARRERAS, PLANES

        private async Task CargarMaterias()
        {
            var lista = await _manager.ObtenerTodas();

            dgvMaterias.DataSource = lista;
        }

        private async Task CargarCarreras()
        {
            //var carreras = await _carreraService.ObtenerTodas();
            var planes = await _planService.ObtenerActivos();
            ComboHelper.CargarCombo(
                cmbCarreras,
                planes,
                "nombreCarrera",
                "idPlan"
            );
        }

        private async Task CargarMateriasPorPlan(long idPlan)
        {
            var lista = await _manager.ObtenerPorPlan(idPlan);

            dgvMaterias.DataSource = lista;
        }
        #endregion

        private void CargarFormulario(MateriaDto materia)
        {
            txtCodigo.Text = materia.codigo;
            if (cmbCarreras.DataSource != null)
                cmbCarreras.SelectedValue = materia.idPlan;
            txtNombre.Text = materia.nombre;
            numAnio.Value = materia.anioCarrera;
            chkPromocional.Checked = materia.esPromocional;
            chkActivo.Checked = materia.activa;
        }

        private MateriaDto ConstruirDesdeFormulario()
        {
            return new MateriaDto
            {
                idMateria = _modoEdicion
                    ? _materiaSeleccionada.idMateria
                    : 0,
                codigo = txtCodigo.Text,
                nombre = txtNombre.Text,
                anioCarrera = (int)numAnio.Value,
                esPromocional = chkPromocional.Checked,
                activa = chkActivo.Checked,
                idPlan = ((PlanDto)cmbPlanes.SelectedItem).idPlan
            };
        }

        private void LimpiarFormulario()
        {
            txtCodigo.Clear();
            txtNombre.Clear();
            numAnio.Value = 1;
            chkPromocional.Checked = false;
            chkActivo.Checked = true;
        }

        #region LOGICA BOTONES

        private void btnCorrelatividades_Click(object sender, EventArgs e)
        {
            if (dgvMaterias.CurrentRow == null)
            {
                MessageHelper.Info("Seleccione una materia");
                return;
            }

            var materiaSeleccionada = dgvMaterias.CurrentRow?.DataBoundItem as MateriaDto;

            if (materiaSeleccionada.anioCarrera == 1)
            {
                MessageHelper.Info("Las materias de primer año no tienen correlativas");
                return;
            }

            try
            {
                this.Enabled = false;

                var form = new CorrelatividadesView(materiaSeleccionada);
                form.ShowDialog();
            }
            catch (Exception ex)
            {
                MessageHelper.Error(ex.Message, true);
            }
            finally
            {
                this.Enabled = true;
            }
        }

        private async void btnDesactivar_Click(object sender, EventArgs e)
        {
            if (dgvMaterias.CurrentRow == null)
            {
                MessageHelper.Info("Seleccione una materia");
                return;
            }

            if (!MessageHelper.Confirm("¿Desactivar materia seleccionada?"))
                return;

            var materia = (MateriaDto)dgvMaterias.CurrentRow.DataBoundItem;

            try
            {
                await _manager.Desactivar(materia.idMateria);

                long idPlan = Convert.ToInt64(cmbCarreras.SelectedValue);

                await CargarMateriasPorPlan(idPlan);

                MessageHelper.Info("Materia desactivada");
            }
            catch
            {
                MessageHelper.Error("No se puede eliminar la materia");
            }
        }

        private void btnNueva_Click(object sender, EventArgs e)
        {
            _modoEdicion = false;
            _materiaSeleccionada = null;

            HabilitarEdicion(true);
            LimpiarFormulario();
        }

        private void btnEditar_Click(object sender, EventArgs e)
        {
            if (dgvMaterias.CurrentRow == null)
            {
                MessageHelper.Info("Seleccione una materia");
                return;
            }

            _materiaSeleccionada = (MateriaDto)dgvMaterias.CurrentRow.DataBoundItem;

            _modoEdicion = true;

            CargarFormulario(_materiaSeleccionada);
            HabilitarEdicion(true);
        }

        private async void btnGuardar_Click(object sender, EventArgs e)
        {
            try
            {
                var materia = MapearFormulario();

                if (_modoEdicion)
                {
                    await _manager.Actualizar(materia.idMateria, materia);
                    MessageHelper.Info("Materia actualizada");
                }

                if (!_modoEdicion)
                {
                    await _manager.Guardar(materia, _modoEdicion);
                    MessageHelper.Info("Materia creada");
                }

                long idPlan = Convert.ToInt64(cmbCarreras.SelectedValue);

                await CargarMateriasPorPlan(idPlan);
                
                LimpiarFormulario();
                HabilitarEdicion(false);
            }
            catch (Exception ex)
            {
                // MessageHelper.Error(ex.Message);
                MessageBox.Show(
                    ex.ToString(),
                    "ERROR",
                    MessageBoxButtons.OK,
                    MessageBoxIcon.Error);
            }
        }

        private void btnCancelar_Click(object sender, EventArgs e)
        {
            LimpiarFormulario();
            HabilitarEdicion(false);
        }
        #endregion

        private void HabilitarEdicion(bool modoEdicion)
        {
            if (modoEdicion)
                gbDetalles.Enabled = true;
            else gbDetalles.Enabled = false;
        }

        private MateriaDto MapearFormulario()
        {
            if (cmbCarreras.SelectedValue == null)
                throw new Exception("Debe seleccionar una carrera");

            return new MateriaDto
            {
                idMateria = _modoEdicion
                    ? _materiaSeleccionada.idMateria
                    : 0,
                idPlan = Convert.ToInt64(cmbCarreras.SelectedValue),
                codigo = txtCodigo.Text,
                nombre = txtNombre.Text,
                anioCarrera = Convert.ToInt32(numAnio.Value),
                esPromocional = chkPromocional.Checked,
                activa = chkActivo.Checked
            };
        }
    }
}
