using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ies.WinForms.Utils
{
    public static class ComboHelper
    {
        public static void CargarCombo<T>(
            ComboBox combo,
            List<T> datos,
            string display,
            string value)
        {
            combo.DataSource = null;

            if (datos == null || datos.Count == 0)
                return;

            combo.DataSource = null;
            combo.DisplayMember = display;
            combo.ValueMember = value;
            combo.DataSource = datos;
            combo.SelectedIndex = -1;
        }
    }
}
