using ies.WinForms.Api;
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
    public partial class PlanesView : Form
    {
        private readonly PlanService _planService = new PlanService();
        private long? _idPlanSerleccionado = null;
        private long? _idCarreraSeleccionada = null;

        public PlanesView()
        {
            InitializeComponent();
            CargarCarreras();
            this.Load += PlanesView_Load;
        }

        private async void PlanesView_Load(Object sender, EventArgs e)
        {
            ApiClient.SetToken();
            ConfiguracionGrid();
            await CargarPlanes();
        }

        //
        // Configuración del dgv
        //
        private void ConfiguracionGrid()
        {
            dgvPlanes.AutoGenerateColumns = false;
            dgvPlanes.Columns.Clear();

            #region Columnas
            // Los nombres tienen que conincidir con el DTO
            // es quien hace la transacción
            dgvPlanes.Columns.Add(new DataGridViewTextBoxColumn
            {
                DataPropertyName = "idPlan",
                HeaderText = "ID"
            });

            dgvPlanes.Columns.Add(new DataGridViewTextBoxColumn
            {
                DataPropertyName = "nombreCarrera",
                HeaderText = "Carrera"
            });

            dgvPlanes.Columns.Add(new DataGridViewTextBoxColumn
            {
                DataPropertyName = "nombrePlan",
                HeaderText = "Plan"
            });

            dgvPlanes.Columns.Add(new DataGridViewTextBoxColumn
            {
                DataPropertyName = "anioInicio",
                HeaderText = "Año de Inicio"
            });

            dgvPlanes.Columns.Add(new DataGridViewCheckBoxColumn
            {
                DataPropertyName = "activo",
                HeaderText = "Activo"
            });
            #endregion
        }

        // Cargar Tabla
        private async Task CargarPlanes()
        {
            if (cmbCarreras.SelectedValue == null) return;

            long idCarrera = (long)cmbCarreras.SelectedValue;

            var planes = await _planService.ObtenerPorCarrera(idCarrera);
            dgvPlanes.DataSource = planes;
        }

        // Cargar carreras
        private async Task CargarCarreras()
        {
            var carreras = await new CarreraService().ObtenerTodas();

            cmbCarreras.DisplayMember = "nombre";
            cmbCarreras.ValueMember = "id_carrera";
            cmbCarreras.SelectedIndex = -1;
            cmbCarreras.DataSource = carreras;
        }

        public void LimpiarFormulario()
        {
            _idPlanSerleccionado = null;

            txtNombre.Clear();
            nudAnioInicio.Value = nudAnioInicio.Minimum;
            chkActivo.Checked = true;

            btnGuardar.Text = "Guardar";
            btnGuardar.BackColor = System.Drawing.Color.FromArgb(72, 187, 120);
            dgvPlanes.ClearSelection();
        }

        // Selección de una carrera
        private async void cmbCarreras_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (cmbCarreras.SelectedItem == null) return;

            if (cmbCarreras.SelectedValue == null) return;

            if (cmbCarreras.SelectedIndex == -1) return;

            await CargarPlanes();
            LimpiarFormulario();
        }

        private void dgvPlanes_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            if (e.RowIndex < 0) return;

            var plan = (PlanDto)dgvPlanes.Rows[e.RowIndex].DataBoundItem;

            _idPlanSerleccionado = plan.idPlan;

            txtNombre.Text = plan.nombrePlan;
            nudAnioInicio.Value = plan.anioInicio;
            chkActivo.Checked = plan.activo;

            btnGuardar.Text = "Editar";
            btnGuardar.BackColor = System.Drawing.Color.FromArgb(240, 191, 87);
        }

        private void btnLimpiar_Click(object sender, EventArgs e)
        {
            LimpiarFormulario();
        }

        private async void btnGuardar_Click(object sender, EventArgs e)
        {
            if (cmbCarreras.SelectedIndex == -1)
            {
                MessageHelper.Info("Seleccione una carrea");
                return;
            }

            var plan = new PlanDto
            {
                idPlan = _idPlanSerleccionado,
                idCarrera = (long)cmbCarreras.SelectedValue,
                nombrePlan = txtNombre.Text.Trim(),
                anioInicio = (int)nudAnioInicio.Value,
                activo = chkActivo.Checked
            };

            try
            {
                await _planService.Guardar(plan);

                MessageHelper.Info(
                    _idPlanSerleccionado == null
                        ? "Plan agregado correctamente"
                        : "plan actualizado correctamente"
                );

                await CargarPlanes();
                LimpiarFormulario();
            }
            catch (Exception ex)
            {
                MessageHelper.Error(ex.Message);
            }
        }

        private async void btnEliminar_Click(object sender, EventArgs e)
        {
            if (_idPlanSerleccionado == null)
            {
                MessageHelper.Info("Seleecione un plan");
                return;

                if (!MessageHelper.Confirm("¿Eliminar el plan seleccionado?"))
                    return;

                try
                {
                    await _planService.Eliminar(_idPlanSerleccionado.Value);
                    MessageHelper.Info("Plan eliminado");
                }
                catch
                {
                    MessageHelper.Error("No se puede eliminar el plan");
                }
            }
        }
    }
}
