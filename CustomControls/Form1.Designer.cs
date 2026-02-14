namespace CustomControls
{
    partial class Form1
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
            this.components = new System.ComponentModel.Container();
            this.btn = new System.Windows.Forms.Button();
            this.submenu = new CustomControls.DropdownMenu(this.components);
            this.opcion1ToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.opcion2ToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.submenu.SuspendLayout();
            this.SuspendLayout();
            // 
            // btn
            // 
            this.btn.Location = new System.Drawing.Point(125, 123);
            this.btn.Name = "btn";
            this.btn.Size = new System.Drawing.Size(75, 23);
            this.btn.TabIndex = 0;
            this.btn.Text = "button1";
            this.btn.UseVisualStyleBackColor = true;
            this.btn.Click += new System.EventHandler(this.btn_Click);
            // 
            // submenu
            // 
            this.submenu.IsMainMenu = false;
            this.submenu.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.opcion1ToolStripMenuItem,
            this.opcion2ToolStripMenuItem});
            this.submenu.MenuItemHeight = 25;
            this.submenu.MenuItemTextColor = System.Drawing.Color.Empty;
            this.submenu.Name = "submenu";
            this.submenu.PrimaryColor = System.Drawing.Color.Empty;
            this.submenu.Size = new System.Drawing.Size(121, 48);
            // 
            // opcion1ToolStripMenuItem
            // 
            this.opcion1ToolStripMenuItem.Name = "opcion1ToolStripMenuItem";
            this.opcion1ToolStripMenuItem.Size = new System.Drawing.Size(120, 22);
            this.opcion1ToolStripMenuItem.Text = "opcion 1";
            // 
            // opcion2ToolStripMenuItem
            // 
            this.opcion2ToolStripMenuItem.Name = "opcion2ToolStripMenuItem";
            this.opcion2ToolStripMenuItem.Size = new System.Drawing.Size(120, 22);
            this.opcion2ToolStripMenuItem.Text = "opcion 2";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.btn);
            this.Name = "Form1";
            this.Text = "Form1";
            this.submenu.ResumeLayout(false);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button btn;
        private DropdownMenu submenu;
        private System.Windows.Forms.ToolStripMenuItem opcion1ToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem opcion2ToolStripMenuItem;
    }
}

