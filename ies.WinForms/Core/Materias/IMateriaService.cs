using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ies.WinForms.Core.Materias
{
    public interface IMateriaService
    {
        Task<List<MateriaDto>> ObtenerTodasAsync();
        Task CrearAsync(MateriaDto materia);
        Task ActualizarAsync(long? id, MateriaDto materia);
        Task EliminarAsync(long? id);
    }
}
