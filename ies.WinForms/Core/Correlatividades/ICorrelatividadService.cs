using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ies.WinForms.Core.Correlatividades
{
    public interface ICorrelatividadService
    {
        Task<List<CorrelatividadDto>> ObtenerTodasAsync();
        Task<List<CorrelatividadDto>> ObtenerPorMateriaAsync(long? idMateria);
        Task CrearAsync(CorrelatividadDto correlatividad);
        Task ActualizarAsync(long? id, CorrelatividadDto correlatividad);
        Task EliminarAsync(long? id);
    }
}
