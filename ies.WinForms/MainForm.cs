using ies.WinForms.Models;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Runtime.InteropServices;
using ies.WinForms.Forms.Views;

namespace ies.WinForms
{
    public partial class MainForm : Form
    {
        private LoginResponse usuario;

        public MainForm(LoginResponse usuario)
        {
            InitializeComponent();
            this.usuario = usuario;
        }

        #region Ocultar y mostrar submenu
        private void OcultarSubmenu()
        {
            if (submenuAcademico.Visible) submenuAcademico.Visible = false;
            if (submenuPersonas.Visible) submenuPersonas.Visible = false;
            if (submenuInscripciones.Visible) submenuInscripciones.Visible = false;
            if (submenuExamenes.Visible) submenuExamenes.Visible = false;
            if (submenuAdministracion.Visible) submenuAdministracion.Visible = false;
        }

        private void mostrarSubmenu(Panel submenu)
        {
            if (!submenu.Visible)
            {
                OcultarSubmenu();
                submenu.Visible = true;
            }
            else
            {
                submenu.Visible = false;
            }
        }
        #endregion


        [DllImport("user32.DLL", EntryPoint = "ReleaseCapture")]
        private extern static void ReleaseCapture();
        [DllImport("user32.DLL", EntryPoint = "SendMessage")]

        private extern static void SendMessage(System.IntPtr hWnd, int wMsg, int wParam, int lParam);

        private void BarraTitulo_MouseDown(object sender, MouseEventArgs e)
        {
            ReleaseCapture();
            SendMessage(this.Handle, 0x112, 0xf012, 0);
        }

        // Función para abrir panles hijos
        private UserControl formActivo = null;
        private void AbrirVista(UserControl vista)
        {
            panelContenedor.Controls.Clear();
            vista.Dock = DockStyle.Fill;
            panelContenedor.Controls.Add(vista);
            //if (formActivo != null) formActivo.Close();

            //formActivo = formHijo;

            //formActivo.TopLevel = false;
            //formActivo.Dock = DockStyle.Fill;
            //this.panelContenedor.Controls.Add(formActivo);
            //this.panelContenedor.Tag = formActivo;
            //formActivo.BringToFront();
            //formActivo.Show();
        }

        private Form form_activo = null;
        private void AbrirVista(Form formHijo)
        {
            if (form_activo != null) form_activo.Close();

            form_activo = formHijo;

            formHijo.TopLevel = false;
            formHijo.Dock = DockStyle.Fill;
            this.panelContenedor.Controls.Add(form_activo);
            this.panelContenedor.Tag = form_activo;
            form_activo.BringToFront();
            form_activo.Show();
        }

        #region Academico
        // SUBMENU-ACADEMICO
        //
        private void btnAcademico_Click(object sender, EventArgs e)
        {
            //
            mostrarSubmenu(submenuAcademico);
        }

        private void btnCarreras_Click(object sender, EventArgs e)
        {
            AbrirVista(new CarrerasView());
            //
            // Mi código
            //
            lblTitulo.Text = "Gestión Carreras";
            OcultarSubmenu();
        }

        // Boton planes
        private void button1_Click(object sender, EventArgs e)
        {
            AbrirVista(new PlanesView());
            lblTitulo.Text = "Gestión Planes";
            OcultarSubmenu();
        }

        private void btnMaterias_Click(object sender, EventArgs e)
        {
            //
            // Mi código
            //
            AbrirVista(new MateriasView());
            lblTitulo.Text = "Gestión Materias";
            OcultarSubmenu();
        }

        private void btnCorrelatividades_Click(object sender, EventArgs e)
        {
            //
            // Mi código
            //
            
            lblTitulo.Text = "Gestión Correlatividades";
            OcultarSubmenu();
        }
        #endregion

        #region Personas
        //
        // SUBMENU-PERSONAS
        //
        private void btnPersonas_Click(object sender, EventArgs e)
        {
            //
            mostrarSubmenu(submenuPersonas);
        }

        private void btnPreinscripciones_Click(object sender, EventArgs e)
        {
            //
            // Mi código
            //
            lblTitulo.Text = "Gestión Preinscripciones";
            OcultarSubmenu();
        }

        private void btnEstudiantes_Click(object sender, EventArgs e)
        {
            //
            // Mi código
            //
            lblTitulo.Text = "Gestión Estudiantes";
            OcultarSubmenu();
        }

        private void btnUsuarios_Click(object sender, EventArgs e)
        {
            //
            // Mi código
            //
            lblTitulo.Text = "Gestión Usuarios";
            OcultarSubmenu();
        }
        #endregion

        #region Inscripciones
        //
        // SUBMENU - INSCRIPCIONES
        //
        private void btnInscripciones_Click(object sender, EventArgs e)
        {
            mostrarSubmenu(submenuInscripciones);
        }

        private void btnPeriodo_Click(object sender, EventArgs e)
        {
            //
            // Mi código
            //
            lblTitulo.Text = "Gestión Periodos Académicos";
            OcultarSubmenu();
        }

        private void btnInscrip_Click(object sender, EventArgs e)
        {
            //
            // Mi código
            //
            lblTitulo.Text = "Gestión Inscripciones";
            OcultarSubmenu();
        }

        private void btnDocumentacion_Click(object sender, EventArgs e)
        {
            //
            // Mi código
            //
            lblTitulo.Text = "Gestión Documentación";
            OcultarSubmenu();
        }
        #endregion

        #region Examenes
        //
        // SUBMENU-EXÁMENES
        //
        private void btnExamenes_Click(object sender, EventArgs e)
        {
            mostrarSubmenu(submenuExamenes);
        }

        private void btnMesas_Click(object sender, EventArgs e)
        {
            //
            // Mi código
            //
            lblTitulo.Text = "Gestión Mesas";
            OcultarSubmenu();
        }

        private void btnInscpExamenes_Click(object sender, EventArgs e)
        {
            //
            // Mi código
            //
            lblTitulo.Text = "Gestión Inscripción a Exámenes";
            OcultarSubmenu();
        }

        private void btnExamenesRendidos_Click(object sender, EventArgs e)
        {
            //
            // Mi código
            //
            lblTitulo.Text = "Gestión Exámenes Rendidos";
            OcultarSubmenu();
        }

        private void btnAutorizacionesLibre_Click(object sender, EventArgs e)
        {
            //
            // Mi código
            //
            lblTitulo.Text = "Gestión Autorización Exámenes Libres";
            OcultarSubmenu();
        }
        #endregion

        #region Administracion
        //
        // SUBMENU-ADMINISTRACIÓN
        private void btnAdministracion_Click(object sender, EventArgs e)
        {
            mostrarSubmenu(submenuAdministracion);
        }

        private void btnProfesores_Click(object sender, EventArgs e)
        {
            //
            // Mi código
            //
            lblTitulo.Text = "Gestión Profesores";
            OcultarSubmenu();
        }

        private void btnLog_Click(object sender, EventArgs e)
        {
            //
            // Mi código
            //
            lblTitulo.Text = "Gestión Logs";
            OcultarSubmenu();
        }
        #endregion

        #region Botones de control de ventana
        private void btnCerrar_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void btnMaximizar_Click(object sender, EventArgs e)
        {
            this.WindowState = FormWindowState.Maximized;
            btnMaximizar.Visible = false;
            btnRestaurar.Visible = true;
        }

        private void btnRestaurar_Click(object sender, EventArgs e)
        {
            this.WindowState = FormWindowState.Normal;
            btnRestaurar.Visible = false;
            btnMaximizar.Visible = true;
        }

        private void btnMinimizar_Click(object sender, EventArgs e)
        {
            this.WindowState = FormWindowState.Minimized;
        }
        #endregion
    }
}
