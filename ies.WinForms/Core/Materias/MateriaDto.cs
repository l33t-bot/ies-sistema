using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ies.WinForms.Core.Materias
{
    public class MateriaDto
    {
        public long? idMateria { get; set; }
        public long? idPlan { get; set; }
        public string codigo { get; set; }
        public string nombre { get; set; }
        public int anioCarrera { get; set; }
        public bool esPromocional { get; set; }
        public bool activa { get; set; }


        public string nombrePlan { get; set; }
    }
}
