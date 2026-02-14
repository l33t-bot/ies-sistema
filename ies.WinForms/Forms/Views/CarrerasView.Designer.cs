namespace ies.WinForms.Forms.Views
{
    partial class CarrerasView
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
            this.formCarreras = new System.Windows.Forms.Panel();
            this.btnEliminar = new System.Windows.Forms.Button();
            this.btnLimpiar = new System.Windows.Forms.Button();
            this.btnGuardar = new System.Windows.Forms.Button();
            this.txtColorCarpeta = new System.Windows.Forms.TextBox();
            this.ckActiva = new System.Windows.Forms.CheckBox();
            this.ckTienePromocionales = new System.Windows.Forms.CheckBox();
            this.label5 = new System.Windows.Forms.Label();
            this.txtDescripcion = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.txtCodigo = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.txtNombreCarrera = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.txtId = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.dgvCarreras = new System.Windows.Forms.DataGridView();
            this.formCarreras.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dgvCarreras)).BeginInit();
            this.SuspendLayout();
            // 
            // formCarreras
            // 
            this.formCarreras.Controls.Add(this.btnEliminar);
            this.formCarreras.Controls.Add(this.btnLimpiar);
            this.formCarreras.Controls.Add(this.btnGuardar);
            this.formCarreras.Controls.Add(this.txtColorCarpeta);
            this.formCarreras.Controls.Add(this.ckActiva);
            this.formCarreras.Controls.Add(this.ckTienePromocionales);
            this.formCarreras.Controls.Add(this.label5);
            this.formCarreras.Controls.Add(this.txtDescripcion);
            this.formCarreras.Controls.Add(this.label4);
            this.formCarreras.Controls.Add(this.txtCodigo);
            this.formCarreras.Controls.Add(this.label3);
            this.formCarreras.Controls.Add(this.txtNombreCarrera);
            this.formCarreras.Controls.Add(this.label2);
            this.formCarreras.Controls.Add(this.txtId);
            this.formCarreras.Controls.Add(this.label1);
            this.formCarreras.Dock = System.Windows.Forms.DockStyle.Left;
            this.formCarreras.Location = new System.Drawing.Point(0, 0);
            this.formCarreras.Name = "formCarreras";
            this.formCarreras.Size = new System.Drawing.Size(340, 665);
            this.formCarreras.TabIndex = 0;
            // 
            // btnEliminar
            // 
            this.btnEliminar.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(245)))), ((int)(((byte)(101)))), ((int)(((byte)(101)))));
            this.btnEliminar.FlatAppearance.BorderSize = 0;
            this.btnEliminar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnEliminar.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnEliminar.ForeColor = System.Drawing.Color.White;
            this.btnEliminar.Location = new System.Drawing.Point(166, 492);
            this.btnEliminar.Name = "btnEliminar";
            this.btnEliminar.Size = new System.Drawing.Size(126, 32);
            this.btnEliminar.TabIndex = 14;
            this.btnEliminar.Text = "Eliminar";
            this.btnEliminar.UseVisualStyleBackColor = false;
            this.btnEliminar.Click += new System.EventHandler(this.btnEliminar_Click);
            // 
            // btnLimpiar
            // 
            this.btnLimpiar.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(118)))), ((int)(((byte)(144)))), ((int)(((byte)(189)))));
            this.btnLimpiar.FlatAppearance.BorderSize = 0;
            this.btnLimpiar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnLimpiar.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnLimpiar.ForeColor = System.Drawing.Color.White;
            this.btnLimpiar.Location = new System.Drawing.Point(34, 492);
            this.btnLimpiar.Name = "btnLimpiar";
            this.btnLimpiar.Size = new System.Drawing.Size(126, 32);
            this.btnLimpiar.TabIndex = 13;
            this.btnLimpiar.Text = "Limpiar";
            this.btnLimpiar.UseVisualStyleBackColor = false;
            this.btnLimpiar.Click += new System.EventHandler(this.btnLimpiar_Click);
            // 
            // btnGuardar
            // 
            this.btnGuardar.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(72)))), ((int)(((byte)(187)))), ((int)(((byte)(120)))));
            this.btnGuardar.FlatAppearance.BorderSize = 0;
            this.btnGuardar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnGuardar.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnGuardar.ForeColor = System.Drawing.Color.White;
            this.btnGuardar.Location = new System.Drawing.Point(34, 454);
            this.btnGuardar.Name = "btnGuardar";
            this.btnGuardar.Size = new System.Drawing.Size(258, 32);
            this.btnGuardar.TabIndex = 12;
            this.btnGuardar.Text = "Guardar";
            this.btnGuardar.UseVisualStyleBackColor = false;
            this.btnGuardar.Click += new System.EventHandler(this.btnGuardar_Click);
            // 
            // txtColorCarpeta
            // 
            this.txtColorCarpeta.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtColorCarpeta.Location = new System.Drawing.Point(12, 358);
            this.txtColorCarpeta.Name = "txtColorCarpeta";
            this.txtColorCarpeta.Size = new System.Drawing.Size(318, 26);
            this.txtColorCarpeta.TabIndex = 11;
            // 
            // ckActiva
            // 
            this.ckActiva.AutoSize = true;
            this.ckActiva.Checked = true;
            this.ckActiva.CheckState = System.Windows.Forms.CheckState.Checked;
            this.ckActiva.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.ckActiva.Location = new System.Drawing.Point(196, 413);
            this.ckActiva.Name = "ckActiva";
            this.ckActiva.Size = new System.Drawing.Size(138, 24);
            this.ckActiva.TabIndex = 10;
            this.ckActiva.Text = "Carrera Activa";
            this.ckActiva.UseVisualStyleBackColor = true;
            // 
            // ckTienePromocionales
            // 
            this.ckTienePromocionales.AutoSize = true;
            this.ckTienePromocionales.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.ckTienePromocionales.Location = new System.Drawing.Point(4, 413);
            this.ckTienePromocionales.Name = "ckTienePromocionales";
            this.ckTienePromocionales.Size = new System.Drawing.Size(177, 24);
            this.ckTienePromocionales.TabIndex = 9;
            this.ckTienePromocionales.Text = "Tiene Promocionales";
            this.ckTienePromocionales.UseVisualStyleBackColor = true;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label5.Location = new System.Drawing.Point(13, 338);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(139, 20);
            this.label5.TabIndex = 8;
            this.label5.Text = "Color de Carpeta";
            // 
            // txtDescripcion
            // 
            this.txtDescripcion.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtDescripcion.Location = new System.Drawing.Point(11, 232);
            this.txtDescripcion.Multiline = true;
            this.txtDescripcion.Name = "txtDescripcion";
            this.txtDescripcion.Size = new System.Drawing.Size(318, 81);
            this.txtDescripcion.TabIndex = 7;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(13, 212);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(96, 20);
            this.label4.TabIndex = 6;
            this.label4.Text = "Descripción";
            // 
            // txtCodigo
            // 
            this.txtCodigo.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtCodigo.Location = new System.Drawing.Point(11, 163);
            this.txtCodigo.Name = "txtCodigo";
            this.txtCodigo.Size = new System.Drawing.Size(318, 26);
            this.txtCodigo.TabIndex = 5;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(12, 143);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(64, 20);
            this.label3.TabIndex = 4;
            this.label3.Text = "Código";
            // 
            // txtNombreCarrera
            // 
            this.txtNombreCarrera.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtNombreCarrera.Location = new System.Drawing.Point(12, 99);
            this.txtNombreCarrera.Name = "txtNombreCarrera";
            this.txtNombreCarrera.Size = new System.Drawing.Size(318, 26);
            this.txtNombreCarrera.TabIndex = 3;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(13, 79);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(170, 20);
            this.label2.TabIndex = 2;
            this.label2.Text = "Nombre de la Carrera";
            // 
            // txtId
            // 
            this.txtId.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtId.Location = new System.Drawing.Point(12, 38);
            this.txtId.Name = "txtId";
            this.txtId.ReadOnly = true;
            this.txtId.Size = new System.Drawing.Size(318, 26);
            this.txtId.TabIndex = 1;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(13, 18);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(25, 20);
            this.label1.TabIndex = 0;
            this.label1.Text = "ID";
            // 
            // dgvCarreras
            // 
            this.dgvCarreras.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgvCarreras.Dock = System.Windows.Forms.DockStyle.Fill;
            this.dgvCarreras.Location = new System.Drawing.Point(340, 0);
            this.dgvCarreras.Name = "dgvCarreras";
            this.dgvCarreras.Size = new System.Drawing.Size(559, 665);
            this.dgvCarreras.TabIndex = 1;
            this.dgvCarreras.CellClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dgvCarreras_CellClick);
            // 
            // CarrerasView
            // 
            this.Controls.Add(this.dgvCarreras);
            this.Controls.Add(this.formCarreras);
            this.Name = "CarrerasView";
            this.Size = new System.Drawing.Size(899, 665);
            this.formCarreras.ResumeLayout(false);
            this.formCarreras.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dgvCarreras)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel formCarreras;
        private System.Windows.Forms.TextBox txtId;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.DataGridView dgvCarreras;
        private System.Windows.Forms.TextBox txtDescripcion;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox txtCodigo;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox txtNombreCarrera;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.CheckBox ckTienePromocionales;
        private System.Windows.Forms.CheckBox ckActiva;
        private System.Windows.Forms.TextBox txtColorCarpeta;
        private System.Windows.Forms.Button btnGuardar;
        private System.Windows.Forms.Button btnLimpiar;
        private System.Windows.Forms.Button btnEliminar;
    }
}