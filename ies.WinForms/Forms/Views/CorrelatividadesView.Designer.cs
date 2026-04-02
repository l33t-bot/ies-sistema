namespace ies.WinForms.Forms.Views
{
    partial class CorrelatividadesView
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(CorrelatividadesView));
            this.BarraTitulo = new System.Windows.Forms.Panel();
            this.btnCerrarBarraTitulo = new System.Windows.Forms.PictureBox();
            this.lblTitulo = new System.Windows.Forms.Label();
            this.gbMateriaSeleccionada = new System.Windows.Forms.GroupBox();
            this.txtMateria = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.gbCorrelativasActuales = new System.Windows.Forms.GroupBox();
            this.dgvCorrelativas = new System.Windows.Forms.DataGridView();
            this.gbAgregarCorrelativa = new System.Windows.Forms.GroupBox();
            this.panel1 = new System.Windows.Forms.Panel();
            this.btnEliminar = new System.Windows.Forms.Button();
            this.btnCerrar = new System.Windows.Forms.Button();
            this.btnAgregar = new System.Windows.Forms.Button();
            this.cmbTipo = new System.Windows.Forms.ComboBox();
            this.cmbMaterias = new System.Windows.Forms.ComboBox();
            this.BarraTitulo.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.btnCerrarBarraTitulo)).BeginInit();
            this.gbMateriaSeleccionada.SuspendLayout();
            this.gbCorrelativasActuales.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dgvCorrelativas)).BeginInit();
            this.gbAgregarCorrelativa.SuspendLayout();
            this.panel1.SuspendLayout();
            this.SuspendLayout();
            // 
            // BarraTitulo
            // 
            this.BarraTitulo.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(0)))), ((int)(((byte)(80)))), ((int)(((byte)(200)))));
            this.BarraTitulo.Controls.Add(this.btnCerrarBarraTitulo);
            this.BarraTitulo.Controls.Add(this.lblTitulo);
            this.BarraTitulo.Dock = System.Windows.Forms.DockStyle.Top;
            this.BarraTitulo.Location = new System.Drawing.Point(0, 0);
            this.BarraTitulo.Name = "BarraTitulo";
            this.BarraTitulo.Size = new System.Drawing.Size(584, 38);
            this.BarraTitulo.TabIndex = 0;
            // 
            // btnCerrarBarraTitulo
            // 
            this.btnCerrarBarraTitulo.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Right)));
            this.btnCerrarBarraTitulo.Cursor = System.Windows.Forms.Cursors.Hand;
            this.btnCerrarBarraTitulo.Image = ((System.Drawing.Image)(resources.GetObject("btnCerrarBarraTitulo.Image")));
            this.btnCerrarBarraTitulo.Location = new System.Drawing.Point(547, 7);
            this.btnCerrarBarraTitulo.Name = "btnCerrarBarraTitulo";
            this.btnCerrarBarraTitulo.Size = new System.Drawing.Size(25, 25);
            this.btnCerrarBarraTitulo.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.btnCerrarBarraTitulo.TabIndex = 1;
            this.btnCerrarBarraTitulo.TabStop = false;
            this.btnCerrarBarraTitulo.Click += new System.EventHandler(this.btnCerrarBarraTitulo_Click);
            // 
            // lblTitulo
            // 
            this.lblTitulo.AutoSize = true;
            this.lblTitulo.Font = new System.Drawing.Font("Century Gothic", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblTitulo.ForeColor = System.Drawing.Color.White;
            this.lblTitulo.Location = new System.Drawing.Point(12, 9);
            this.lblTitulo.Name = "lblTitulo";
            this.lblTitulo.Size = new System.Drawing.Size(165, 23);
            this.lblTitulo.TabIndex = 1;
            this.lblTitulo.Text = "Correlatividades";
            // 
            // gbMateriaSeleccionada
            // 
            this.gbMateriaSeleccionada.Controls.Add(this.txtMateria);
            this.gbMateriaSeleccionada.Controls.Add(this.label1);
            this.gbMateriaSeleccionada.Dock = System.Windows.Forms.DockStyle.Top;
            this.gbMateriaSeleccionada.Location = new System.Drawing.Point(0, 38);
            this.gbMateriaSeleccionada.Name = "gbMateriaSeleccionada";
            this.gbMateriaSeleccionada.Size = new System.Drawing.Size(584, 70);
            this.gbMateriaSeleccionada.TabIndex = 1;
            this.gbMateriaSeleccionada.TabStop = false;
            this.gbMateriaSeleccionada.Text = "Materia Seleccionada";
            // 
            // txtMateria
            // 
            this.txtMateria.Location = new System.Drawing.Point(98, 30);
            this.txtMateria.Name = "txtMateria";
            this.txtMateria.ReadOnly = true;
            this.txtMateria.Size = new System.Drawing.Size(255, 22);
            this.txtMateria.TabIndex = 1;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(20, 30);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(71, 20);
            this.label1.TabIndex = 0;
            this.label1.Text = "Materia:";
            // 
            // gbCorrelativasActuales
            // 
            this.gbCorrelativasActuales.Controls.Add(this.dgvCorrelativas);
            this.gbCorrelativasActuales.Dock = System.Windows.Forms.DockStyle.Fill;
            this.gbCorrelativasActuales.Location = new System.Drawing.Point(0, 108);
            this.gbCorrelativasActuales.Name = "gbCorrelativasActuales";
            this.gbCorrelativasActuales.Size = new System.Drawing.Size(584, 353);
            this.gbCorrelativasActuales.TabIndex = 2;
            this.gbCorrelativasActuales.TabStop = false;
            this.gbCorrelativasActuales.Text = "Correlativas actuales";
            // 
            // dgvCorrelativas
            // 
            this.dgvCorrelativas.AutoSizeColumnsMode = System.Windows.Forms.DataGridViewAutoSizeColumnsMode.DisplayedCells;
            this.dgvCorrelativas.BorderStyle = System.Windows.Forms.BorderStyle.None;
            this.dgvCorrelativas.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgvCorrelativas.Dock = System.Windows.Forms.DockStyle.Fill;
            this.dgvCorrelativas.Location = new System.Drawing.Point(3, 18);
            this.dgvCorrelativas.MultiSelect = false;
            this.dgvCorrelativas.Name = "dgvCorrelativas";
            this.dgvCorrelativas.ReadOnly = true;
            this.dgvCorrelativas.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.dgvCorrelativas.Size = new System.Drawing.Size(578, 332);
            this.dgvCorrelativas.TabIndex = 0;
            // 
            // gbAgregarCorrelativa
            // 
            this.gbAgregarCorrelativa.Controls.Add(this.panel1);
            this.gbAgregarCorrelativa.Controls.Add(this.btnAgregar);
            this.gbAgregarCorrelativa.Controls.Add(this.cmbTipo);
            this.gbAgregarCorrelativa.Controls.Add(this.cmbMaterias);
            this.gbAgregarCorrelativa.Dock = System.Windows.Forms.DockStyle.Bottom;
            this.gbAgregarCorrelativa.Location = new System.Drawing.Point(0, 330);
            this.gbAgregarCorrelativa.Name = "gbAgregarCorrelativa";
            this.gbAgregarCorrelativa.Size = new System.Drawing.Size(584, 131);
            this.gbAgregarCorrelativa.TabIndex = 3;
            this.gbAgregarCorrelativa.TabStop = false;
            this.gbAgregarCorrelativa.Text = "Agregar correlativa";
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.btnEliminar);
            this.panel1.Controls.Add(this.btnCerrar);
            this.panel1.Dock = System.Windows.Forms.DockStyle.Bottom;
            this.panel1.Location = new System.Drawing.Point(3, 62);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(578, 66);
            this.panel1.TabIndex = 7;
            // 
            // btnEliminar
            // 
            this.btnEliminar.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(245)))), ((int)(((byte)(101)))), ((int)(((byte)(101)))));
            this.btnEliminar.FlatAppearance.BorderSize = 0;
            this.btnEliminar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnEliminar.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnEliminar.ForeColor = System.Drawing.Color.White;
            this.btnEliminar.Location = new System.Drawing.Point(9, 16);
            this.btnEliminar.Name = "btnEliminar";
            this.btnEliminar.Size = new System.Drawing.Size(120, 32);
            this.btnEliminar.TabIndex = 6;
            this.btnEliminar.Text = "Eliminar";
            this.btnEliminar.UseVisualStyleBackColor = false;
            this.btnEliminar.Click += new System.EventHandler(this.btnEliminar_Click);
            // 
            // btnCerrar
            // 
            this.btnCerrar.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(108)))), ((int)(((byte)(117)))), ((int)(((byte)(125)))));
            this.btnCerrar.FlatAppearance.BorderSize = 0;
            this.btnCerrar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnCerrar.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnCerrar.ForeColor = System.Drawing.Color.White;
            this.btnCerrar.Location = new System.Drawing.Point(449, 16);
            this.btnCerrar.Name = "btnCerrar";
            this.btnCerrar.Size = new System.Drawing.Size(120, 32);
            this.btnCerrar.TabIndex = 5;
            this.btnCerrar.Text = "Cerrar";
            this.btnCerrar.UseVisualStyleBackColor = false;
            this.btnCerrar.Click += new System.EventHandler(this.btnCerrar_Click);
            // 
            // btnAgregar
            // 
            this.btnAgregar.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(8)))), ((int)(((byte)(75)))), ((int)(((byte)(162)))));
            this.btnAgregar.FlatAppearance.BorderSize = 0;
            this.btnAgregar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnAgregar.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnAgregar.ForeColor = System.Drawing.Color.White;
            this.btnAgregar.Location = new System.Drawing.Point(452, 24);
            this.btnAgregar.Name = "btnAgregar";
            this.btnAgregar.Size = new System.Drawing.Size(120, 32);
            this.btnAgregar.TabIndex = 6;
            this.btnAgregar.Text = "Agregar";
            this.btnAgregar.UseVisualStyleBackColor = false;
            this.btnAgregar.Click += new System.EventHandler(this.btnAgregar_Click);
            // 
            // cmbTipo
            // 
            this.cmbTipo.FormattingEnabled = true;
            this.cmbTipo.Location = new System.Drawing.Point(269, 30);
            this.cmbTipo.Name = "cmbTipo";
            this.cmbTipo.Size = new System.Drawing.Size(146, 25);
            this.cmbTipo.TabIndex = 1;
            // 
            // cmbMaterias
            // 
            this.cmbMaterias.FormattingEnabled = true;
            this.cmbMaterias.Location = new System.Drawing.Point(20, 30);
            this.cmbMaterias.Name = "cmbMaterias";
            this.cmbMaterias.Size = new System.Drawing.Size(226, 25);
            this.cmbMaterias.TabIndex = 0;
            // 
            // CorrelatividadesView
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 17F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(584, 461);
            this.Controls.Add(this.gbAgregarCorrelativa);
            this.Controls.Add(this.gbCorrelativasActuales);
            this.Controls.Add(this.gbMateriaSeleccionada);
            this.Controls.Add(this.BarraTitulo);
            this.Font = new System.Drawing.Font("Century Gothic", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Margin = new System.Windows.Forms.Padding(4);
            this.Name = "CorrelatividadesView";
            this.Text = "CorrelatividadesView";
            this.BarraTitulo.ResumeLayout(false);
            this.BarraTitulo.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.btnCerrarBarraTitulo)).EndInit();
            this.gbMateriaSeleccionada.ResumeLayout(false);
            this.gbMateriaSeleccionada.PerformLayout();
            this.gbCorrelativasActuales.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.dgvCorrelativas)).EndInit();
            this.gbAgregarCorrelativa.ResumeLayout(false);
            this.panel1.ResumeLayout(false);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel BarraTitulo;
        private System.Windows.Forms.Label lblTitulo;
        private System.Windows.Forms.PictureBox btnCerrarBarraTitulo;
        private System.Windows.Forms.GroupBox gbMateriaSeleccionada;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox txtMateria;
        private System.Windows.Forms.GroupBox gbCorrelativasActuales;
        private System.Windows.Forms.GroupBox gbAgregarCorrelativa;
        private System.Windows.Forms.ComboBox cmbMaterias;
        private System.Windows.Forms.ComboBox cmbTipo;
        private System.Windows.Forms.Button btnAgregar;
        private System.Windows.Forms.DataGridView dgvCorrelativas;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Button btnCerrar;
        private System.Windows.Forms.Button btnEliminar;
    }
}