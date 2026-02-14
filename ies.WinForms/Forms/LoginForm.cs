using ies.WinForms.Api;
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

namespace ies.WinForms.Forms
{
    public partial class LoginForm : Form
    {
        public LoginForm()
        {
            InitializeComponent();
        }

        private async void btnLogin_Click_1(object sender, EventArgs e)
        {
            try
            {
                var request = new LoginRequest
                {
                    usuario = txtUsuario.Text,
                    password = txtPassword.Text
                };

                var response = await ApiClient.LoginAsync(request);

                // Abrir MainForm
                MessageBox.Show($"Bienvenido {response.usuario} ({response.rol})");
                var main = new MainForm(response);
                main.Show();
                this.Hide();
                
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message, "Error",
                    MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }
    }
}
