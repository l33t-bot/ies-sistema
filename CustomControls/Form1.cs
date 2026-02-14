using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CustomControls
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        public void Form1_Load(Object sender, EventArgs e)
        {
            submenu.IsMainMenu = true;
        }
        private void btn_Click(object sender, EventArgs e)
        {
            submenu.Show(btn, btn.Width, 0);
        }
    }
}
