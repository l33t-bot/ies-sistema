namespace ies.WinForms
{
    partial class MainForm
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(MainForm));
            this.BarraTitulo = new System.Windows.Forms.Panel();
            this.lblTitulo = new System.Windows.Forms.Label();
            this.btnRestaurar = new System.Windows.Forms.PictureBox();
            this.btnMinimizar = new System.Windows.Forms.PictureBox();
            this.btnMaximizar = new System.Windows.Forms.PictureBox();
            this.btnCerrar = new System.Windows.Forms.PictureBox();
            this.MenuVertical = new System.Windows.Forms.Panel();
            this.submenuAdministracion = new System.Windows.Forms.Panel();
            this.btnLog = new System.Windows.Forms.Button();
            this.btnProfesores = new System.Windows.Forms.Button();
            this.btnAdministracion = new System.Windows.Forms.Button();
            this.submenuExamenes = new System.Windows.Forms.Panel();
            this.btnAutorizacionesLibre = new System.Windows.Forms.Button();
            this.btnExamenesRendidos = new System.Windows.Forms.Button();
            this.btnInscpExamenes = new System.Windows.Forms.Button();
            this.btnMesas = new System.Windows.Forms.Button();
            this.btnExamenes = new System.Windows.Forms.Button();
            this.submenuInscripciones = new System.Windows.Forms.Panel();
            this.btnDocumentacion = new System.Windows.Forms.Button();
            this.btnInscrip = new System.Windows.Forms.Button();
            this.btnPeriodo = new System.Windows.Forms.Button();
            this.btnInscripciones = new System.Windows.Forms.Button();
            this.submenuPersonas = new System.Windows.Forms.Panel();
            this.btnUsuarios = new System.Windows.Forms.Button();
            this.btnEstudiantes = new System.Windows.Forms.Button();
            this.btnPreinscripciones = new System.Windows.Forms.Button();
            this.btnPersonas = new System.Windows.Forms.Button();
            this.submenuAcademico = new System.Windows.Forms.Panel();
            this.btnCorrelatividades = new System.Windows.Forms.Button();
            this.btnMaterias = new System.Windows.Forms.Button();
            this.btnCarreras = new System.Windows.Forms.Button();
            this.btnAcademico = new System.Windows.Forms.Button();
            this.panelLogo = new System.Windows.Forms.Panel();
            this.label2 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.panelContenedor = new System.Windows.Forms.Panel();
            this.btnPlanes = new System.Windows.Forms.Button();
            this.BarraTitulo.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.btnRestaurar)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.btnMinimizar)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.btnMaximizar)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.btnCerrar)).BeginInit();
            this.MenuVertical.SuspendLayout();
            this.submenuAdministracion.SuspendLayout();
            this.submenuExamenes.SuspendLayout();
            this.submenuInscripciones.SuspendLayout();
            this.submenuPersonas.SuspendLayout();
            this.submenuAcademico.SuspendLayout();
            this.panelLogo.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // BarraTitulo
            // 
            this.BarraTitulo.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(0)))), ((int)(((byte)(80)))), ((int)(((byte)(200)))));
            this.BarraTitulo.Controls.Add(this.lblTitulo);
            this.BarraTitulo.Controls.Add(this.btnRestaurar);
            this.BarraTitulo.Controls.Add(this.btnMinimizar);
            this.BarraTitulo.Controls.Add(this.btnMaximizar);
            this.BarraTitulo.Controls.Add(this.btnCerrar);
            this.BarraTitulo.Dock = System.Windows.Forms.DockStyle.Top;
            this.BarraTitulo.Location = new System.Drawing.Point(0, 0);
            this.BarraTitulo.Name = "BarraTitulo";
            this.BarraTitulo.Size = new System.Drawing.Size(1300, 38);
            this.BarraTitulo.TabIndex = 0;
            this.BarraTitulo.MouseDown += new System.Windows.Forms.MouseEventHandler(this.BarraTitulo_MouseDown);
            // 
            // lblTitulo
            // 
            this.lblTitulo.AutoSize = true;
            this.lblTitulo.Font = new System.Drawing.Font("Century Gothic", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblTitulo.ForeColor = System.Drawing.Color.White;
            this.lblTitulo.Location = new System.Drawing.Point(12, 9);
            this.lblTitulo.Name = "lblTitulo";
            this.lblTitulo.Size = new System.Drawing.Size(649, 23);
            this.lblTitulo.TabIndex = 0;
            this.lblTitulo.Text = "Sistema de Inscripción y Gestión Académica del IES Alfredo Coviello ";
            // 
            // btnRestaurar
            // 
            this.btnRestaurar.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Right)));
            this.btnRestaurar.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btnRestaurar.Image = ((System.Drawing.Image)(resources.GetObject("btnRestaurar.Image")));
            this.btnRestaurar.Location = new System.Drawing.Point(1224, 6);
            this.btnRestaurar.Name = "btnRestaurar";
            this.btnRestaurar.Size = new System.Drawing.Size(25, 25);
            this.btnRestaurar.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.btnRestaurar.TabIndex = 3;
            this.btnRestaurar.TabStop = false;
            this.btnRestaurar.Visible = false;
            this.btnRestaurar.Click += new System.EventHandler(this.btnRestaurar_Click);
            // 
            // btnMinimizar
            // 
            this.btnMinimizar.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Right)));
            this.btnMinimizar.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btnMinimizar.Image = ((System.Drawing.Image)(resources.GetObject("btnMinimizar.Image")));
            this.btnMinimizar.Location = new System.Drawing.Point(1189, 6);
            this.btnMinimizar.Name = "btnMinimizar";
            this.btnMinimizar.Size = new System.Drawing.Size(25, 25);
            this.btnMinimizar.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.btnMinimizar.TabIndex = 2;
            this.btnMinimizar.TabStop = false;
            this.btnMinimizar.Click += new System.EventHandler(this.btnMinimizar_Click);
            // 
            // btnMaximizar
            // 
            this.btnMaximizar.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Right)));
            this.btnMaximizar.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btnMaximizar.Image = ((System.Drawing.Image)(resources.GetObject("btnMaximizar.Image")));
            this.btnMaximizar.Location = new System.Drawing.Point(1224, 6);
            this.btnMaximizar.Name = "btnMaximizar";
            this.btnMaximizar.Size = new System.Drawing.Size(25, 25);
            this.btnMaximizar.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.btnMaximizar.TabIndex = 1;
            this.btnMaximizar.TabStop = false;
            this.btnMaximizar.Click += new System.EventHandler(this.btnMaximizar_Click);
            // 
            // btnCerrar
            // 
            this.btnCerrar.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Right)));
            this.btnCerrar.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btnCerrar.Image = ((System.Drawing.Image)(resources.GetObject("btnCerrar.Image")));
            this.btnCerrar.Location = new System.Drawing.Point(1259, 6);
            this.btnCerrar.Name = "btnCerrar";
            this.btnCerrar.Size = new System.Drawing.Size(25, 25);
            this.btnCerrar.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.btnCerrar.TabIndex = 0;
            this.btnCerrar.TabStop = false;
            this.btnCerrar.Click += new System.EventHandler(this.btnCerrar_Click);
            // 
            // MenuVertical
            // 
            this.MenuVertical.AutoScroll = true;
            this.MenuVertical.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(26)))), ((int)(((byte)(32)))), ((int)(((byte)(40)))));
            this.MenuVertical.Controls.Add(this.submenuAdministracion);
            this.MenuVertical.Controls.Add(this.btnAdministracion);
            this.MenuVertical.Controls.Add(this.submenuExamenes);
            this.MenuVertical.Controls.Add(this.btnExamenes);
            this.MenuVertical.Controls.Add(this.submenuInscripciones);
            this.MenuVertical.Controls.Add(this.btnInscripciones);
            this.MenuVertical.Controls.Add(this.submenuPersonas);
            this.MenuVertical.Controls.Add(this.btnPersonas);
            this.MenuVertical.Controls.Add(this.submenuAcademico);
            this.MenuVertical.Controls.Add(this.btnAcademico);
            this.MenuVertical.Controls.Add(this.panelLogo);
            this.MenuVertical.Dock = System.Windows.Forms.DockStyle.Left;
            this.MenuVertical.Location = new System.Drawing.Point(0, 38);
            this.MenuVertical.Name = "MenuVertical";
            this.MenuVertical.Size = new System.Drawing.Size(220, 612);
            this.MenuVertical.TabIndex = 1;
            // 
            // submenuAdministracion
            // 
            this.submenuAdministracion.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(35)))), ((int)(((byte)(32)))), ((int)(((byte)(39)))));
            this.submenuAdministracion.Controls.Add(this.btnLog);
            this.submenuAdministracion.Controls.Add(this.btnProfesores);
            this.submenuAdministracion.Dock = System.Windows.Forms.DockStyle.Top;
            this.submenuAdministracion.Location = new System.Drawing.Point(0, 924);
            this.submenuAdministracion.Name = "submenuAdministracion";
            this.submenuAdministracion.Size = new System.Drawing.Size(203, 90);
            this.submenuAdministracion.TabIndex = 19;
            this.submenuAdministracion.Visible = false;
            // 
            // btnLog
            // 
            this.btnLog.Dock = System.Windows.Forms.DockStyle.Top;
            this.btnLog.FlatAppearance.BorderSize = 0;
            this.btnLog.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnLog.Font = new System.Drawing.Font("Century Gothic", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnLog.ForeColor = System.Drawing.Color.LightGray;
            this.btnLog.Location = new System.Drawing.Point(0, 40);
            this.btnLog.Name = "btnLog";
            this.btnLog.Padding = new System.Windows.Forms.Padding(32, 0, 0, 0);
            this.btnLog.Size = new System.Drawing.Size(203, 40);
            this.btnLog.TabIndex = 1;
            this.btnLog.Text = "Logs Administrativos";
            this.btnLog.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btnLog.UseVisualStyleBackColor = true;
            this.btnLog.Click += new System.EventHandler(this.btnLog_Click);
            // 
            // btnProfesores
            // 
            this.btnProfesores.Dock = System.Windows.Forms.DockStyle.Top;
            this.btnProfesores.FlatAppearance.BorderSize = 0;
            this.btnProfesores.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnProfesores.Font = new System.Drawing.Font("Century Gothic", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnProfesores.ForeColor = System.Drawing.Color.LightGray;
            this.btnProfesores.Location = new System.Drawing.Point(0, 0);
            this.btnProfesores.Name = "btnProfesores";
            this.btnProfesores.Padding = new System.Windows.Forms.Padding(32, 0, 0, 0);
            this.btnProfesores.Size = new System.Drawing.Size(203, 40);
            this.btnProfesores.TabIndex = 0;
            this.btnProfesores.Text = "Profesores";
            this.btnProfesores.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btnProfesores.UseVisualStyleBackColor = true;
            this.btnProfesores.Click += new System.EventHandler(this.btnProfesores_Click);
            // 
            // btnAdministracion
            // 
            this.btnAdministracion.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(26)))), ((int)(((byte)(32)))), ((int)(((byte)(40)))));
            this.btnAdministracion.Dock = System.Windows.Forms.DockStyle.Top;
            this.btnAdministracion.FlatAppearance.BorderSize = 0;
            this.btnAdministracion.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(0)))), ((int)(((byte)(80)))), ((int)(((byte)(200)))));
            this.btnAdministracion.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnAdministracion.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnAdministracion.ForeColor = System.Drawing.Color.White;
            this.btnAdministracion.Location = new System.Drawing.Point(0, 879);
            this.btnAdministracion.Name = "btnAdministracion";
            this.btnAdministracion.Padding = new System.Windows.Forms.Padding(10, 0, 0, 0);
            this.btnAdministracion.Size = new System.Drawing.Size(203, 45);
            this.btnAdministracion.TabIndex = 18;
            this.btnAdministracion.Text = "Administración";
            this.btnAdministracion.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btnAdministracion.UseVisualStyleBackColor = false;
            this.btnAdministracion.Click += new System.EventHandler(this.btnAdministracion_Click);
            // 
            // submenuExamenes
            // 
            this.submenuExamenes.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(35)))), ((int)(((byte)(32)))), ((int)(((byte)(39)))));
            this.submenuExamenes.Controls.Add(this.btnAutorizacionesLibre);
            this.submenuExamenes.Controls.Add(this.btnExamenesRendidos);
            this.submenuExamenes.Controls.Add(this.btnInscpExamenes);
            this.submenuExamenes.Controls.Add(this.btnMesas);
            this.submenuExamenes.Dock = System.Windows.Forms.DockStyle.Top;
            this.submenuExamenes.Location = new System.Drawing.Point(0, 709);
            this.submenuExamenes.Name = "submenuExamenes";
            this.submenuExamenes.Size = new System.Drawing.Size(203, 170);
            this.submenuExamenes.TabIndex = 17;
            this.submenuExamenes.Visible = false;
            // 
            // btnAutorizacionesLibre
            // 
            this.btnAutorizacionesLibre.Dock = System.Windows.Forms.DockStyle.Top;
            this.btnAutorizacionesLibre.FlatAppearance.BorderSize = 0;
            this.btnAutorizacionesLibre.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnAutorizacionesLibre.Font = new System.Drawing.Font("Century Gothic", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnAutorizacionesLibre.ForeColor = System.Drawing.Color.LightGray;
            this.btnAutorizacionesLibre.Location = new System.Drawing.Point(0, 120);
            this.btnAutorizacionesLibre.Name = "btnAutorizacionesLibre";
            this.btnAutorizacionesLibre.Padding = new System.Windows.Forms.Padding(32, 0, 0, 0);
            this.btnAutorizacionesLibre.Size = new System.Drawing.Size(203, 40);
            this.btnAutorizacionesLibre.TabIndex = 3;
            this.btnAutorizacionesLibre.Text = "Autorizaciones Libre";
            this.btnAutorizacionesLibre.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btnAutorizacionesLibre.UseVisualStyleBackColor = true;
            this.btnAutorizacionesLibre.Click += new System.EventHandler(this.btnAutorizacionesLibre_Click);
            // 
            // btnExamenesRendidos
            // 
            this.btnExamenesRendidos.Dock = System.Windows.Forms.DockStyle.Top;
            this.btnExamenesRendidos.FlatAppearance.BorderSize = 0;
            this.btnExamenesRendidos.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnExamenesRendidos.Font = new System.Drawing.Font("Century Gothic", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnExamenesRendidos.ForeColor = System.Drawing.Color.LightGray;
            this.btnExamenesRendidos.Location = new System.Drawing.Point(0, 80);
            this.btnExamenesRendidos.Name = "btnExamenesRendidos";
            this.btnExamenesRendidos.Padding = new System.Windows.Forms.Padding(32, 0, 0, 0);
            this.btnExamenesRendidos.Size = new System.Drawing.Size(203, 40);
            this.btnExamenesRendidos.TabIndex = 2;
            this.btnExamenesRendidos.Text = "Exámenes Rendidos";
            this.btnExamenesRendidos.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btnExamenesRendidos.UseVisualStyleBackColor = true;
            this.btnExamenesRendidos.Click += new System.EventHandler(this.btnExamenesRendidos_Click);
            // 
            // btnInscpExamenes
            // 
            this.btnInscpExamenes.Dock = System.Windows.Forms.DockStyle.Top;
            this.btnInscpExamenes.FlatAppearance.BorderSize = 0;
            this.btnInscpExamenes.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnInscpExamenes.Font = new System.Drawing.Font("Century Gothic", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnInscpExamenes.ForeColor = System.Drawing.Color.LightGray;
            this.btnInscpExamenes.Location = new System.Drawing.Point(0, 40);
            this.btnInscpExamenes.Name = "btnInscpExamenes";
            this.btnInscpExamenes.Padding = new System.Windows.Forms.Padding(32, 0, 0, 0);
            this.btnInscpExamenes.Size = new System.Drawing.Size(203, 40);
            this.btnInscpExamenes.TabIndex = 1;
            this.btnInscpExamenes.Text = "Inscrip.Exámenes";
            this.btnInscpExamenes.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btnInscpExamenes.UseVisualStyleBackColor = true;
            this.btnInscpExamenes.Click += new System.EventHandler(this.btnInscpExamenes_Click);
            // 
            // btnMesas
            // 
            this.btnMesas.Dock = System.Windows.Forms.DockStyle.Top;
            this.btnMesas.FlatAppearance.BorderSize = 0;
            this.btnMesas.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnMesas.Font = new System.Drawing.Font("Century Gothic", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnMesas.ForeColor = System.Drawing.Color.LightGray;
            this.btnMesas.Location = new System.Drawing.Point(0, 0);
            this.btnMesas.Name = "btnMesas";
            this.btnMesas.Padding = new System.Windows.Forms.Padding(32, 0, 0, 0);
            this.btnMesas.Size = new System.Drawing.Size(203, 40);
            this.btnMesas.TabIndex = 0;
            this.btnMesas.Text = "Mesas";
            this.btnMesas.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btnMesas.UseVisualStyleBackColor = true;
            this.btnMesas.Click += new System.EventHandler(this.btnMesas_Click);
            // 
            // btnExamenes
            // 
            this.btnExamenes.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(26)))), ((int)(((byte)(32)))), ((int)(((byte)(40)))));
            this.btnExamenes.Dock = System.Windows.Forms.DockStyle.Top;
            this.btnExamenes.FlatAppearance.BorderSize = 0;
            this.btnExamenes.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(0)))), ((int)(((byte)(80)))), ((int)(((byte)(200)))));
            this.btnExamenes.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnExamenes.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnExamenes.ForeColor = System.Drawing.Color.White;
            this.btnExamenes.Location = new System.Drawing.Point(0, 664);
            this.btnExamenes.Name = "btnExamenes";
            this.btnExamenes.Padding = new System.Windows.Forms.Padding(10, 0, 0, 0);
            this.btnExamenes.Size = new System.Drawing.Size(203, 45);
            this.btnExamenes.TabIndex = 16;
            this.btnExamenes.Text = "Exámenes";
            this.btnExamenes.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btnExamenes.UseVisualStyleBackColor = false;
            this.btnExamenes.Click += new System.EventHandler(this.btnExamenes_Click);
            // 
            // submenuInscripciones
            // 
            this.submenuInscripciones.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(35)))), ((int)(((byte)(32)))), ((int)(((byte)(39)))));
            this.submenuInscripciones.Controls.Add(this.btnDocumentacion);
            this.submenuInscripciones.Controls.Add(this.btnInscrip);
            this.submenuInscripciones.Controls.Add(this.btnPeriodo);
            this.submenuInscripciones.Dock = System.Windows.Forms.DockStyle.Top;
            this.submenuInscripciones.Location = new System.Drawing.Point(0, 534);
            this.submenuInscripciones.Name = "submenuInscripciones";
            this.submenuInscripciones.Size = new System.Drawing.Size(203, 130);
            this.submenuInscripciones.TabIndex = 15;
            this.submenuInscripciones.Visible = false;
            // 
            // btnDocumentacion
            // 
            this.btnDocumentacion.Dock = System.Windows.Forms.DockStyle.Top;
            this.btnDocumentacion.FlatAppearance.BorderSize = 0;
            this.btnDocumentacion.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnDocumentacion.Font = new System.Drawing.Font("Century Gothic", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnDocumentacion.ForeColor = System.Drawing.Color.LightGray;
            this.btnDocumentacion.Location = new System.Drawing.Point(0, 80);
            this.btnDocumentacion.Name = "btnDocumentacion";
            this.btnDocumentacion.Padding = new System.Windows.Forms.Padding(32, 0, 0, 0);
            this.btnDocumentacion.Size = new System.Drawing.Size(203, 40);
            this.btnDocumentacion.TabIndex = 2;
            this.btnDocumentacion.Text = "Documentación";
            this.btnDocumentacion.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btnDocumentacion.UseVisualStyleBackColor = true;
            this.btnDocumentacion.Click += new System.EventHandler(this.btnDocumentacion_Click);
            // 
            // btnInscrip
            // 
            this.btnInscrip.Dock = System.Windows.Forms.DockStyle.Top;
            this.btnInscrip.FlatAppearance.BorderSize = 0;
            this.btnInscrip.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnInscrip.Font = new System.Drawing.Font("Century Gothic", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnInscrip.ForeColor = System.Drawing.Color.LightGray;
            this.btnInscrip.Location = new System.Drawing.Point(0, 40);
            this.btnInscrip.Name = "btnInscrip";
            this.btnInscrip.Padding = new System.Windows.Forms.Padding(32, 0, 0, 0);
            this.btnInscrip.Size = new System.Drawing.Size(203, 40);
            this.btnInscrip.TabIndex = 1;
            this.btnInscrip.Text = "Inscripciones";
            this.btnInscrip.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btnInscrip.UseVisualStyleBackColor = true;
            this.btnInscrip.Click += new System.EventHandler(this.btnInscrip_Click);
            // 
            // btnPeriodo
            // 
            this.btnPeriodo.Dock = System.Windows.Forms.DockStyle.Top;
            this.btnPeriodo.FlatAppearance.BorderSize = 0;
            this.btnPeriodo.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnPeriodo.Font = new System.Drawing.Font("Century Gothic", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnPeriodo.ForeColor = System.Drawing.Color.LightGray;
            this.btnPeriodo.Location = new System.Drawing.Point(0, 0);
            this.btnPeriodo.Name = "btnPeriodo";
            this.btnPeriodo.Padding = new System.Windows.Forms.Padding(32, 0, 0, 0);
            this.btnPeriodo.Size = new System.Drawing.Size(203, 40);
            this.btnPeriodo.TabIndex = 0;
            this.btnPeriodo.Text = "Periodos Académicos";
            this.btnPeriodo.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btnPeriodo.UseVisualStyleBackColor = true;
            this.btnPeriodo.Click += new System.EventHandler(this.btnPeriodo_Click);
            // 
            // btnInscripciones
            // 
            this.btnInscripciones.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(26)))), ((int)(((byte)(32)))), ((int)(((byte)(40)))));
            this.btnInscripciones.Dock = System.Windows.Forms.DockStyle.Top;
            this.btnInscripciones.FlatAppearance.BorderSize = 0;
            this.btnInscripciones.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(0)))), ((int)(((byte)(80)))), ((int)(((byte)(200)))));
            this.btnInscripciones.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnInscripciones.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnInscripciones.ForeColor = System.Drawing.Color.White;
            this.btnInscripciones.Location = new System.Drawing.Point(0, 489);
            this.btnInscripciones.Name = "btnInscripciones";
            this.btnInscripciones.Padding = new System.Windows.Forms.Padding(10, 0, 0, 0);
            this.btnInscripciones.Size = new System.Drawing.Size(203, 45);
            this.btnInscripciones.TabIndex = 14;
            this.btnInscripciones.Text = "Inscripciones";
            this.btnInscripciones.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btnInscripciones.UseVisualStyleBackColor = false;
            this.btnInscripciones.Click += new System.EventHandler(this.btnInscripciones_Click);
            // 
            // submenuPersonas
            // 
            this.submenuPersonas.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(35)))), ((int)(((byte)(32)))), ((int)(((byte)(39)))));
            this.submenuPersonas.Controls.Add(this.btnUsuarios);
            this.submenuPersonas.Controls.Add(this.btnEstudiantes);
            this.submenuPersonas.Controls.Add(this.btnPreinscripciones);
            this.submenuPersonas.Dock = System.Windows.Forms.DockStyle.Top;
            this.submenuPersonas.Location = new System.Drawing.Point(0, 359);
            this.submenuPersonas.Name = "submenuPersonas";
            this.submenuPersonas.Size = new System.Drawing.Size(203, 130);
            this.submenuPersonas.TabIndex = 12;
            this.submenuPersonas.Visible = false;
            // 
            // btnUsuarios
            // 
            this.btnUsuarios.Dock = System.Windows.Forms.DockStyle.Top;
            this.btnUsuarios.FlatAppearance.BorderSize = 0;
            this.btnUsuarios.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnUsuarios.Font = new System.Drawing.Font("Century Gothic", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnUsuarios.ForeColor = System.Drawing.Color.LightGray;
            this.btnUsuarios.Location = new System.Drawing.Point(0, 80);
            this.btnUsuarios.Name = "btnUsuarios";
            this.btnUsuarios.Padding = new System.Windows.Forms.Padding(32, 0, 0, 0);
            this.btnUsuarios.Size = new System.Drawing.Size(203, 40);
            this.btnUsuarios.TabIndex = 2;
            this.btnUsuarios.Text = "Usuarios";
            this.btnUsuarios.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btnUsuarios.UseVisualStyleBackColor = true;
            this.btnUsuarios.Click += new System.EventHandler(this.btnUsuarios_Click);
            // 
            // btnEstudiantes
            // 
            this.btnEstudiantes.Dock = System.Windows.Forms.DockStyle.Top;
            this.btnEstudiantes.FlatAppearance.BorderSize = 0;
            this.btnEstudiantes.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnEstudiantes.Font = new System.Drawing.Font("Century Gothic", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnEstudiantes.ForeColor = System.Drawing.Color.LightGray;
            this.btnEstudiantes.Location = new System.Drawing.Point(0, 40);
            this.btnEstudiantes.Name = "btnEstudiantes";
            this.btnEstudiantes.Padding = new System.Windows.Forms.Padding(32, 0, 0, 0);
            this.btnEstudiantes.Size = new System.Drawing.Size(203, 40);
            this.btnEstudiantes.TabIndex = 1;
            this.btnEstudiantes.Text = "Estudiantes";
            this.btnEstudiantes.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btnEstudiantes.UseVisualStyleBackColor = true;
            this.btnEstudiantes.Click += new System.EventHandler(this.btnEstudiantes_Click);
            // 
            // btnPreinscripciones
            // 
            this.btnPreinscripciones.Dock = System.Windows.Forms.DockStyle.Top;
            this.btnPreinscripciones.FlatAppearance.BorderSize = 0;
            this.btnPreinscripciones.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnPreinscripciones.Font = new System.Drawing.Font("Century Gothic", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnPreinscripciones.ForeColor = System.Drawing.Color.LightGray;
            this.btnPreinscripciones.Location = new System.Drawing.Point(0, 0);
            this.btnPreinscripciones.Name = "btnPreinscripciones";
            this.btnPreinscripciones.Padding = new System.Windows.Forms.Padding(32, 0, 0, 0);
            this.btnPreinscripciones.Size = new System.Drawing.Size(203, 40);
            this.btnPreinscripciones.TabIndex = 0;
            this.btnPreinscripciones.Text = "Preinscripciones";
            this.btnPreinscripciones.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btnPreinscripciones.UseVisualStyleBackColor = true;
            this.btnPreinscripciones.Click += new System.EventHandler(this.btnPreinscripciones_Click);
            // 
            // btnPersonas
            // 
            this.btnPersonas.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(26)))), ((int)(((byte)(32)))), ((int)(((byte)(40)))));
            this.btnPersonas.Dock = System.Windows.Forms.DockStyle.Top;
            this.btnPersonas.FlatAppearance.BorderSize = 0;
            this.btnPersonas.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(0)))), ((int)(((byte)(80)))), ((int)(((byte)(200)))));
            this.btnPersonas.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnPersonas.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnPersonas.ForeColor = System.Drawing.Color.White;
            this.btnPersonas.Location = new System.Drawing.Point(0, 314);
            this.btnPersonas.Name = "btnPersonas";
            this.btnPersonas.Padding = new System.Windows.Forms.Padding(10, 0, 0, 0);
            this.btnPersonas.Size = new System.Drawing.Size(203, 45);
            this.btnPersonas.TabIndex = 11;
            this.btnPersonas.Text = "Personas";
            this.btnPersonas.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btnPersonas.UseVisualStyleBackColor = false;
            this.btnPersonas.Click += new System.EventHandler(this.btnPersonas_Click);
            // 
            // submenuAcademico
            // 
            this.submenuAcademico.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(35)))), ((int)(((byte)(32)))), ((int)(((byte)(39)))));
            this.submenuAcademico.Controls.Add(this.btnPlanes);
            this.submenuAcademico.Controls.Add(this.btnCorrelatividades);
            this.submenuAcademico.Controls.Add(this.btnMaterias);
            this.submenuAcademico.Controls.Add(this.btnCarreras);
            this.submenuAcademico.Dock = System.Windows.Forms.DockStyle.Top;
            this.submenuAcademico.Location = new System.Drawing.Point(0, 145);
            this.submenuAcademico.Name = "submenuAcademico";
            this.submenuAcademico.Size = new System.Drawing.Size(203, 169);
            this.submenuAcademico.TabIndex = 10;
            this.submenuAcademico.Visible = false;
            // 
            // btnCorrelatividades
            // 
            this.btnCorrelatividades.Dock = System.Windows.Forms.DockStyle.Top;
            this.btnCorrelatividades.FlatAppearance.BorderSize = 0;
            this.btnCorrelatividades.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnCorrelatividades.Font = new System.Drawing.Font("Century Gothic", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCorrelatividades.ForeColor = System.Drawing.Color.LightGray;
            this.btnCorrelatividades.Location = new System.Drawing.Point(0, 80);
            this.btnCorrelatividades.Name = "btnCorrelatividades";
            this.btnCorrelatividades.Padding = new System.Windows.Forms.Padding(32, 0, 0, 0);
            this.btnCorrelatividades.Size = new System.Drawing.Size(203, 40);
            this.btnCorrelatividades.TabIndex = 2;
            this.btnCorrelatividades.Text = "Correlatividades";
            this.btnCorrelatividades.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btnCorrelatividades.UseVisualStyleBackColor = true;
            this.btnCorrelatividades.Click += new System.EventHandler(this.btnCorrelatividades_Click);
            // 
            // btnMaterias
            // 
            this.btnMaterias.Dock = System.Windows.Forms.DockStyle.Top;
            this.btnMaterias.FlatAppearance.BorderSize = 0;
            this.btnMaterias.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnMaterias.Font = new System.Drawing.Font("Century Gothic", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnMaterias.ForeColor = System.Drawing.Color.LightGray;
            this.btnMaterias.Location = new System.Drawing.Point(0, 40);
            this.btnMaterias.Name = "btnMaterias";
            this.btnMaterias.Padding = new System.Windows.Forms.Padding(32, 0, 0, 0);
            this.btnMaterias.Size = new System.Drawing.Size(203, 40);
            this.btnMaterias.TabIndex = 1;
            this.btnMaterias.Text = "Materias";
            this.btnMaterias.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btnMaterias.UseVisualStyleBackColor = true;
            this.btnMaterias.Click += new System.EventHandler(this.btnMaterias_Click);
            // 
            // btnCarreras
            // 
            this.btnCarreras.Dock = System.Windows.Forms.DockStyle.Top;
            this.btnCarreras.FlatAppearance.BorderSize = 0;
            this.btnCarreras.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnCarreras.Font = new System.Drawing.Font("Century Gothic", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCarreras.ForeColor = System.Drawing.Color.LightGray;
            this.btnCarreras.Location = new System.Drawing.Point(0, 0);
            this.btnCarreras.Name = "btnCarreras";
            this.btnCarreras.Padding = new System.Windows.Forms.Padding(32, 0, 0, 0);
            this.btnCarreras.Size = new System.Drawing.Size(203, 40);
            this.btnCarreras.TabIndex = 0;
            this.btnCarreras.Text = "Carreras";
            this.btnCarreras.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btnCarreras.UseVisualStyleBackColor = true;
            this.btnCarreras.Click += new System.EventHandler(this.btnCarreras_Click);
            // 
            // btnAcademico
            // 
            this.btnAcademico.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(26)))), ((int)(((byte)(32)))), ((int)(((byte)(40)))));
            this.btnAcademico.Dock = System.Windows.Forms.DockStyle.Top;
            this.btnAcademico.FlatAppearance.BorderSize = 0;
            this.btnAcademico.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(0)))), ((int)(((byte)(80)))), ((int)(((byte)(200)))));
            this.btnAcademico.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnAcademico.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnAcademico.ForeColor = System.Drawing.Color.White;
            this.btnAcademico.Location = new System.Drawing.Point(0, 100);
            this.btnAcademico.Name = "btnAcademico";
            this.btnAcademico.Padding = new System.Windows.Forms.Padding(10, 20, 0, 0);
            this.btnAcademico.Size = new System.Drawing.Size(203, 45);
            this.btnAcademico.TabIndex = 1;
            this.btnAcademico.Text = "Académico";
            this.btnAcademico.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btnAcademico.UseVisualStyleBackColor = false;
            this.btnAcademico.Click += new System.EventHandler(this.btnAcademico_Click);
            // 
            // panelLogo
            // 
            this.panelLogo.Controls.Add(this.label2);
            this.panelLogo.Controls.Add(this.label1);
            this.panelLogo.Controls.Add(this.pictureBox1);
            this.panelLogo.Dock = System.Windows.Forms.DockStyle.Top;
            this.panelLogo.Location = new System.Drawing.Point(0, 0);
            this.panelLogo.Name = "panelLogo";
            this.panelLogo.Size = new System.Drawing.Size(203, 100);
            this.panelLogo.TabIndex = 13;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.ForeColor = System.Drawing.Color.White;
            this.label2.Location = new System.Drawing.Point(79, 49);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(134, 20);
            this.label2.TabIndex = 2;
            this.label2.Text = "Alfredo Coviello";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Century Gothic", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.ForeColor = System.Drawing.Color.White;
            this.label1.Location = new System.Drawing.Point(119, 19);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(41, 19);
            this.label1.TabIndex = 1;
            this.label1.Text = "I.E.S.";
            this.label1.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // pictureBox1
            // 
            this.pictureBox1.Cursor = System.Windows.Forms.Cursors.Hand;
            this.pictureBox1.Dock = System.Windows.Forms.DockStyle.Left;
            this.pictureBox1.Image = ((System.Drawing.Image)(resources.GetObject("pictureBox1.Image")));
            this.pictureBox1.Location = new System.Drawing.Point(0, 0);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(73, 100);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pictureBox1.TabIndex = 0;
            this.pictureBox1.TabStop = false;
            // 
            // panelContenedor
            // 
            this.panelContenedor.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.panelContenedor.BackColor = System.Drawing.Color.White;
            this.panelContenedor.Location = new System.Drawing.Point(220, 38);
            this.panelContenedor.Name = "panelContenedor";
            this.panelContenedor.Size = new System.Drawing.Size(1080, 612);
            this.panelContenedor.TabIndex = 2;
            // 
            // btnPlanes
            // 
            this.btnPlanes.Dock = System.Windows.Forms.DockStyle.Top;
            this.btnPlanes.FlatAppearance.BorderSize = 0;
            this.btnPlanes.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnPlanes.Font = new System.Drawing.Font("Century Gothic", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnPlanes.ForeColor = System.Drawing.Color.LightGray;
            this.btnPlanes.Location = new System.Drawing.Point(0, 120);
            this.btnPlanes.Name = "btnPlanes";
            this.btnPlanes.Padding = new System.Windows.Forms.Padding(32, 0, 0, 0);
            this.btnPlanes.Size = new System.Drawing.Size(203, 40);
            this.btnPlanes.TabIndex = 3;
            this.btnPlanes.Text = "Planes";
            this.btnPlanes.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.btnPlanes.UseVisualStyleBackColor = true;
            this.btnPlanes.Click += new System.EventHandler(this.button1_Click);
            // 
            // MainForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1300, 650);
            this.Controls.Add(this.panelContenedor);
            this.Controls.Add(this.MenuVertical);
            this.Controls.Add(this.BarraTitulo);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "MainForm";
            this.Text = "Form1";
            this.BarraTitulo.ResumeLayout(false);
            this.BarraTitulo.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.btnRestaurar)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.btnMinimizar)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.btnMaximizar)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.btnCerrar)).EndInit();
            this.MenuVertical.ResumeLayout(false);
            this.submenuAdministracion.ResumeLayout(false);
            this.submenuExamenes.ResumeLayout(false);
            this.submenuInscripciones.ResumeLayout(false);
            this.submenuPersonas.ResumeLayout(false);
            this.submenuAcademico.ResumeLayout(false);
            this.panelLogo.ResumeLayout(false);
            this.panelLogo.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel BarraTitulo;
        private System.Windows.Forms.Panel MenuVertical;
        private System.Windows.Forms.Panel panelContenedor;
        private System.Windows.Forms.PictureBox btnRestaurar;
        private System.Windows.Forms.PictureBox btnMinimizar;
        private System.Windows.Forms.PictureBox btnMaximizar;
        private System.Windows.Forms.PictureBox btnCerrar;
        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.Button btnAcademico;
        private System.Windows.Forms.Panel submenuAcademico;
        private System.Windows.Forms.Button btnCorrelatividades;
        private System.Windows.Forms.Button btnMaterias;
        private System.Windows.Forms.Button btnCarreras;
        private System.Windows.Forms.Button btnPersonas;
        private System.Windows.Forms.Panel submenuPersonas;
        private System.Windows.Forms.Button btnUsuarios;
        private System.Windows.Forms.Button btnEstudiantes;
        private System.Windows.Forms.Button btnPreinscripciones;
        private System.Windows.Forms.Panel panelLogo;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Panel submenuInscripciones;
        private System.Windows.Forms.Button btnDocumentacion;
        private System.Windows.Forms.Button btnInscrip;
        private System.Windows.Forms.Button btnPeriodo;
        private System.Windows.Forms.Button btnInscripciones;
        private System.Windows.Forms.Panel submenuExamenes;
        private System.Windows.Forms.Button btnExamenesRendidos;
        private System.Windows.Forms.Button btnInscpExamenes;
        private System.Windows.Forms.Button btnMesas;
        private System.Windows.Forms.Button btnExamenes;
        private System.Windows.Forms.Button btnAdministracion;
        private System.Windows.Forms.Button btnAutorizacionesLibre;
        private System.Windows.Forms.Panel submenuAdministracion;
        private System.Windows.Forms.Button btnLog;
        private System.Windows.Forms.Button btnProfesores;
        private System.Windows.Forms.Label lblTitulo;
        private System.Windows.Forms.Button btnPlanes;
    }
}

