using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ies.WinForms.Core.Correlatividades
{
    public class CorrelatividadDto
    {
        public long? idCorrelatividad { set; get; }
        public long? idMateriaPrincipal { set; get; }
        public long? idMateriaRequisito { set; get; }
        public string tipoCorrelativa { set; get; }
        public bool activo {  set; get; }

        public string nombreMateriaPrincipal { set; get; }
        public string nombreMateriaRequisito { set; get; }
    }
}
