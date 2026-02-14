using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ies.WinForms.Models
{
    public class CarreraDto
    {
        public long? id_carrera {  get; set; }
        public string nombre { get; set; }
        public string codigo { get; set; }
        public string descripcion {  get; set; }
        public string colorCarpeta { get; set; }
        public bool promocionales {  get; set; }
        public bool activa {  get; set; }

    }
}