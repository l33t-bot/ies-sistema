using ies.WinForms.Api;
using ies.WinForms.Models;
using ies.WinForms.Services;
using ies.WinForms.Utils;
using System;
using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Drawing.Text;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ies.WinForms.Forms.Views
{
    public partial class CarrerasView : UserControl
    {
        private readonly CarreraService service = new CarreraService();
        public CarrerasView()
        {
            InitializeComponent();
            this.Load += CarrerasView_Load;
        }

        private async void CarrerasView_Load(object sender, EventArgs e)
        {
            ApiClient.SetToken();
            ConfiguracionGrid();
            await CargarCarreras();
        }

        //
        // Configuración del dgv
        //
        private void ConfiguracionGrid()
        {
            dgvCarreras.AutoGenerateColumns = false;
            dgvCarreras.Columns.Clear();
            dgvCarreras.AutoSizeColumnsMode = DataGridViewAutoSizeColumnsMode.AllCells;

            #region Columnas
            // COLUMNAS
            dgvCarreras.Columns.Add(new DataGridViewTextBoxColumn
            {
                DataPropertyName = "id_carrera",
                HeaderText = "ID",
                //Visible = false
            });

            dgvCarreras.Columns.Add(new DataGridViewTextBoxColumn
            {
                DataPropertyName = "nombre",
                HeaderText = "Nombre",
            });

            dgvCarreras.Columns.Add(new DataGridViewTextBoxColumn
            {
                DataPropertyName = "codigo",
                HeaderText = "Código",
            });

            dgvCarreras.Columns.Add(new DataGridViewTextBoxColumn
            {
                DataPropertyName = "descripcion",
                HeaderText = "Descripción",
            });

            dgvCarreras.Columns.Add(new DataGridViewTextBoxColumn
            {
                DataPropertyName = "colorCarpeta",
                HeaderText = "Color de Carpeta",
            });

            dgvCarreras.Columns.Add(new DataGridViewCheckBoxColumn

            {
                DataPropertyName = "promocionales",
                HeaderText = "Promocionales",
            });

            dgvCarreras.Columns.Add(new DataGridViewCheckBoxColumn

            {
                DataPropertyName = "activa",
                HeaderText = "Activa"
            });
            #endregion
        }

        // Cargar tabla
        private async Task CargarCarreras()
        {
            dgvCarreras.DataSource = await service.ObtenerTodas();
        }

        // Obtener Carrera desde el formulario
        private CarreraDto ObtenerCarreraDesdeFromulario()
        {
            long? id = null;

            if (!string.IsNullOrWhiteSpace(txtId.Text))
                id = long.Parse(txtId.Text);

            return new CarreraDto
            {
                id_carrera = id,
                nombre = txtNombreCarrera.Text.Trim(),
                codigo = txtCodigo.Text.Trim(),
                descripcion = txtDescripcion.Text.Trim(),
                colorCarpeta = txtColorCarpeta.Text.Trim(),
                promocionales = ckTienePromocionales.Checked,
                activa = ckActiva.Checked,
            };
        }

        // Eventos para click en filas
        private void dgvCarreras_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            if (e.RowIndex < 0) return;

            var carrera = (CarreraDto) dgvCarreras.Rows[e.RowIndex].DataBoundItem;

            txtId.Text = carrera.id_carrera.HasValue
                ? carrera.id_carrera.Value.ToString()
                : "";
            txtNombreCarrera.Text = carrera.nombre;
            txtCodigo.Text = carrera.codigo;
            txtDescripcion.Text = carrera.descripcion;
            txtColorCarpeta.Text = carrera.colorCarpeta;
            ckTienePromocionales.Checked = carrera.promocionales;
            ckActiva.Checked = carrera.activa;

            btnGuardar.Text = "Editar";
            btnGuardar.BackColor = System.Drawing.Color.FromArgb(240, 191, 87);
        }

        public void limpiarFormulario()
        {
            txtId.Clear();
            txtNombreCarrera.Clear();
            txtDescripcion.Clear();
            txtCodigo.Clear();
            txtColorCarpeta.Clear();
            ckTienePromocionales.Checked = false;
            ckActiva.Checked = true;

            btnGuardar.Text = "Guardar";
            btnGuardar.BackColor = System.Drawing.Color.FromArgb(72, 187, 120);
        }

        #region Botones CRUD
        private void btnLimpiar_Click(object sender, EventArgs e)
        {
            limpiarFormulario();
        }

        private async void btnGuardar_Click(object sender, EventArgs e)
        {
            try
            {
                var carrera = ObtenerCarreraDesdeFromulario();

                await service.Guardar(carrera);

                MessageHelper.Info("Carrera guardada correctamente");

                await CargarCarreras();
                limpiarFormulario();
            }
            catch (Exception ex)
            {
                MessageHelper.Error(ex.Message);
            }
        }

        private async void btnEliminar_Click(object sender, EventArgs e)
        {
            if (string.IsNullOrEmpty(txtId.Text)) return;

            if (!MessageHelper.Confirm("¿Eliminar carrera seleccionada?")) return;

            await service.Eliminar(long.Parse(txtId.Text));
            await CargarCarreras();
            limpiarFormulario();
        }
        #endregion
    }
}
