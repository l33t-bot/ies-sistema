namespace ies.WinForms.Forms.Views
{
    partial class PlanesView
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
            this.lblCarrera = new System.Windows.Forms.Label();
            this.cmbCarreras = new System.Windows.Forms.ComboBox();
            this.gbCarrera = new System.Windows.Forms.GroupBox();
            this.gbPlanes = new System.Windows.Forms.GroupBox();
            this.dgvPlanes = new System.Windows.Forms.DataGridView();
            this.pnlBottom = new System.Windows.Forms.Panel();
            this.pnlAcciones = new System.Windows.Forms.Panel();
            this.btnLimpiar = new System.Windows.Forms.Button();
            this.btnEliminar = new System.Windows.Forms.Button();
            this.btnGuardar = new System.Windows.Forms.Button();
            this.gbDetalle = new System.Windows.Forms.GroupBox();
            this.chkActivo = new System.Windows.Forms.CheckBox();
            this.nudAnioInicio = new System.Windows.Forms.NumericUpDown();
            this.label2 = new System.Windows.Forms.Label();
            this.txtNombre = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.gbCarrera.SuspendLayout();
            this.gbPlanes.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dgvPlanes)).BeginInit();
            this.pnlBottom.SuspendLayout();
            this.pnlAcciones.SuspendLayout();
            this.gbDetalle.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.nudAnioInicio)).BeginInit();
            this.SuspendLayout();
            // 
            // lblCarrera
            // 
            this.lblCarrera.AutoSize = true;
            this.lblCarrera.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblCarrera.Location = new System.Drawing.Point(20, 30);
            this.lblCarrera.Name = "lblCarrera";
            this.lblCarrera.Size = new System.Drawing.Size(70, 20);
            this.lblCarrera.TabIndex = 0;
            this.lblCarrera.Text = "Carrera:";
            // 
            // cmbCarreras
            // 
            this.cmbCarreras.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cmbCarreras.FormattingEnabled = true;
            this.cmbCarreras.Location = new System.Drawing.Point(90, 30);
            this.cmbCarreras.Name = "cmbCarreras";
            this.cmbCarreras.Size = new System.Drawing.Size(300, 25);
            this.cmbCarreras.TabIndex = 1;
            this.cmbCarreras.SelectedIndexChanged += new System.EventHandler(this.cmbCarreras_SelectedIndexChanged);
            // 
            // gbCarrera
            // 
            this.gbCarrera.Controls.Add(this.cmbCarreras);
            this.gbCarrera.Controls.Add(this.lblCarrera);
            this.gbCarrera.Dock = System.Windows.Forms.DockStyle.Top;
            this.gbCarrera.Font = new System.Drawing.Font("Century Gothic", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.gbCarrera.Location = new System.Drawing.Point(0, 0);
            this.gbCarrera.Name = "gbCarrera";
            this.gbCarrera.Size = new System.Drawing.Size(1080, 80);
            this.gbCarrera.TabIndex = 2;
            this.gbCarrera.TabStop = false;
            this.gbCarrera.Text = "Carrera";
            // 
            // gbPlanes
            // 
            this.gbPlanes.Controls.Add(this.dgvPlanes);
            this.gbPlanes.Controls.Add(this.pnlBottom);
            this.gbPlanes.Dock = System.Windows.Forms.DockStyle.Fill;
            this.gbPlanes.Font = new System.Drawing.Font("Century Gothic", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.gbPlanes.Location = new System.Drawing.Point(0, 80);
            this.gbPlanes.Name = "gbPlanes";
            this.gbPlanes.Size = new System.Drawing.Size(1080, 532);
            this.gbPlanes.TabIndex = 3;
            this.gbPlanes.TabStop = false;
            this.gbPlanes.Text = "Planes de estudio";
            // 
            // dgvPlanes
            // 
            this.dgvPlanes.AllowUserToAddRows = false;
            this.dgvPlanes.AllowUserToDeleteRows = false;
            this.dgvPlanes.AutoSizeColumnsMode = System.Windows.Forms.DataGridViewAutoSizeColumnsMode.AllCells;
            this.dgvPlanes.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgvPlanes.Dock = System.Windows.Forms.DockStyle.Fill;
            this.dgvPlanes.Location = new System.Drawing.Point(3, 19);
            this.dgvPlanes.MultiSelect = false;
            this.dgvPlanes.Name = "dgvPlanes";
            this.dgvPlanes.ReadOnly = true;
            this.dgvPlanes.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.dgvPlanes.Size = new System.Drawing.Size(1074, 330);
            this.dgvPlanes.TabIndex = 1;
            this.dgvPlanes.CellClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dgvPlanes_CellClick);
            // 
            // pnlBottom
            // 
            this.pnlBottom.Controls.Add(this.pnlAcciones);
            this.pnlBottom.Controls.Add(this.gbDetalle);
            this.pnlBottom.Dock = System.Windows.Forms.DockStyle.Bottom;
            this.pnlBottom.Location = new System.Drawing.Point(3, 349);
            this.pnlBottom.Name = "pnlBottom";
            this.pnlBottom.Size = new System.Drawing.Size(1074, 180);
            this.pnlBottom.TabIndex = 0;
            // 
            // pnlAcciones
            // 
            this.pnlAcciones.Controls.Add(this.btnLimpiar);
            this.pnlAcciones.Controls.Add(this.btnEliminar);
            this.pnlAcciones.Controls.Add(this.btnGuardar);
            this.pnlAcciones.Dock = System.Windows.Forms.DockStyle.Fill;
            this.pnlAcciones.Location = new System.Drawing.Point(500, 0);
            this.pnlAcciones.Name = "pnlAcciones";
            this.pnlAcciones.Size = new System.Drawing.Size(574, 180);
            this.pnlAcciones.TabIndex = 1;
            // 
            // btnLimpiar
            // 
            this.btnLimpiar.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(118)))), ((int)(((byte)(144)))), ((int)(((byte)(189)))));
            this.btnLimpiar.FlatAppearance.BorderSize = 0;
            this.btnLimpiar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnLimpiar.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnLimpiar.ForeColor = System.Drawing.Color.White;
            this.btnLimpiar.Location = new System.Drawing.Point(30, 112);
            this.btnLimpiar.Name = "btnLimpiar";
            this.btnLimpiar.Size = new System.Drawing.Size(120, 32);
            this.btnLimpiar.TabIndex = 2;
            this.btnLimpiar.Text = "Limpiar";
            this.btnLimpiar.UseVisualStyleBackColor = false;
            this.btnLimpiar.Click += new System.EventHandler(this.btnLimpiar_Click);
            // 
            // btnEliminar
            // 
            this.btnEliminar.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(245)))), ((int)(((byte)(101)))), ((int)(((byte)(101)))));
            this.btnEliminar.FlatAppearance.BorderSize = 0;
            this.btnEliminar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnEliminar.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnEliminar.ForeColor = System.Drawing.Color.White;
            this.btnEliminar.Location = new System.Drawing.Point(30, 72);
            this.btnEliminar.Name = "btnEliminar";
            this.btnEliminar.Size = new System.Drawing.Size(120, 32);
            this.btnEliminar.TabIndex = 1;
            this.btnEliminar.Text = "Eliminar";
            this.btnEliminar.UseVisualStyleBackColor = false;
            this.btnEliminar.Click += new System.EventHandler(this.btnEliminar_Click);
            // 
            // btnGuardar
            // 
            this.btnGuardar.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(72)))), ((int)(((byte)(187)))), ((int)(((byte)(120)))));
            this.btnGuardar.FlatAppearance.BorderSize = 0;
            this.btnGuardar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnGuardar.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnGuardar.ForeColor = System.Drawing.Color.White;
            this.btnGuardar.Location = new System.Drawing.Point(30, 32);
            this.btnGuardar.Name = "btnGuardar";
            this.btnGuardar.Size = new System.Drawing.Size(120, 32);
            this.btnGuardar.TabIndex = 0;
            this.btnGuardar.Text = "Guardar";
            this.btnGuardar.UseVisualStyleBackColor = false;
            this.btnGuardar.Click += new System.EventHandler(this.btnGuardar_Click);
            // 
            // gbDetalle
            // 
            this.gbDetalle.Controls.Add(this.chkActivo);
            this.gbDetalle.Controls.Add(this.nudAnioInicio);
            this.gbDetalle.Controls.Add(this.label2);
            this.gbDetalle.Controls.Add(this.txtNombre);
            this.gbDetalle.Controls.Add(this.label1);
            this.gbDetalle.Dock = System.Windows.Forms.DockStyle.Left;
            this.gbDetalle.Location = new System.Drawing.Point(0, 0);
            this.gbDetalle.Name = "gbDetalle";
            this.gbDetalle.Size = new System.Drawing.Size(500, 180);
            this.gbDetalle.TabIndex = 0;
            this.gbDetalle.TabStop = false;
            this.gbDetalle.Text = "Detalle del Plan";
            // 
            // chkActivo
            // 
            this.chkActivo.AutoSize = true;
            this.chkActivo.Checked = true;
            this.chkActivo.CheckState = System.Windows.Forms.CheckState.Checked;
            this.chkActivo.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.chkActivo.Location = new System.Drawing.Point(110, 110);
            this.chkActivo.Name = "chkActivo";
            this.chkActivo.Size = new System.Drawing.Size(77, 24);
            this.chkActivo.TabIndex = 4;
            this.chkActivo.Text = "Activo";
            this.chkActivo.UseVisualStyleBackColor = true;
            // 
            // nudAnioInicio
            // 
            this.nudAnioInicio.Location = new System.Drawing.Point(110, 70);
            this.nudAnioInicio.Maximum = new decimal(new int[] {
            2100,
            0,
            0,
            0});
            this.nudAnioInicio.Minimum = new decimal(new int[] {
            1900,
            0,
            0,
            0});
            this.nudAnioInicio.Name = "nudAnioInicio";
            this.nudAnioInicio.Size = new System.Drawing.Size(120, 23);
            this.nudAnioInicio.TabIndex = 3;
            this.nudAnioInicio.Value = new decimal(new int[] {
            1900,
            0,
            0,
            0});
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(20, 75);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(85, 20);
            this.label2.TabIndex = 2;
            this.label2.Text = "Año inicio:";
            // 
            // txtNombre
            // 
            this.txtNombre.Location = new System.Drawing.Point(110, 30);
            this.txtNombre.Name = "txtNombre";
            this.txtNombre.Size = new System.Drawing.Size(300, 23);
            this.txtNombre.TabIndex = 1;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(20, 35);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(72, 20);
            this.label1.TabIndex = 0;
            this.label1.Text = "Nombre:";
            // 
            // PlanesView
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1080, 612);
            this.Controls.Add(this.gbPlanes);
            this.Controls.Add(this.gbCarrera);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "PlanesView";
            this.Text = "PlanesView";
            this.gbCarrera.ResumeLayout(false);
            this.gbCarrera.PerformLayout();
            this.gbPlanes.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.dgvPlanes)).EndInit();
            this.pnlBottom.ResumeLayout(false);
            this.pnlAcciones.ResumeLayout(false);
            this.gbDetalle.ResumeLayout(false);
            this.gbDetalle.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.nudAnioInicio)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion
        private System.Windows.Forms.ComboBox cmbCarreras;
        private System.Windows.Forms.Label lblCarrera;
        private System.Windows.Forms.GroupBox gbCarrera;
        private System.Windows.Forms.GroupBox gbPlanes;
        private System.Windows.Forms.Panel pnlBottom;
        private System.Windows.Forms.DataGridView dgvPlanes;
        private System.Windows.Forms.Panel pnlAcciones;
        private System.Windows.Forms.GroupBox gbDetalle;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox txtNombre;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button btnGuardar;
        private System.Windows.Forms.CheckBox chkActivo;
        private System.Windows.Forms.NumericUpDown nudAnioInicio;
        private System.Windows.Forms.Button btnEliminar;
        private System.Windows.Forms.Button btnLimpiar;
    }
}