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
        public static void Info(string msg) =>
            MessageBox.Show(
                msg,
                "Información",
                MessageBoxButtons.OK, MessageBoxIcon.Information
            );

        public static void Error(string msg) =>
            MessageBox.Show(
                msg,
                "Error",
                MessageBoxButtons.OK, MessageBoxIcon.Error
            );

        public static bool Confirm(string msg) =>
            MessageBox.Show(
                msg,
                "Confirmar",
                MessageBoxButtons.YesNo,
                MessageBoxIcon.Question
            )
                == DialogResult.Yes;
    }
}
