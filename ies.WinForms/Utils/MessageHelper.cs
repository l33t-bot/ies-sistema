using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ies.WinForms.Utils
{
    public class MessageHelper
    {
        // Información general
        public static void Info(string msg)
        {
            MessageBox.Show(
                msg,
                "Información",
                MessageBoxButtons.OK,
                MessageBoxIcon.Information
            );
        }


        // Operaciones exitosas
        public static void Success(string msg)
        {
            MessageBox.Show(
                msg,
                "Éxito",
                MessageBoxButtons.OK,
                MessageBoxIcon.Information
            );
        }

        // Errores
        public static void Error(string msg, bool mostrarDetalle = false)
        {
            MessageBox.Show(
                msg,
                "Error",
                MessageBoxButtons.OK,
                MessageBoxIcon.Error
            );
        }
            
        // Confirmación (Si / No)
        public static bool Confirm(string msg)
        {
            return MessageBox.Show(
                msg,
                "Confirmación",
                MessageBoxButtons.YesNo,
                MessageBoxIcon.Question,
                MessageBoxDefaultButton.Button2 // default "no"
            ) == DialogResult.Yes;
        }
            
    }
}
