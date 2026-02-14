using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ies.WinForms.Models
{
    public class PlanDto
    {
        public long? idPlan { get; set; }
        public long? idCarrera { get; set; }
        public string nombrePlan { get; set; }
        public int anioInicio { get; set; }
        public bool activo { get; set; }


        public string nombreCarrera { get; set; }
    }
}
