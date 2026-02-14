using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ies.WinForms.Models
{
    public class LoginResponse
    {
        public int id { get; set; }
        public string usuario { get; set; }
        public string rol { get; set; }
        public string token { get; set; }
    }
}
