using ies.WinForms.Api;
using ies.WinForms.Core.Materias;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ies.WinForms.Infrastructure
{
    public class MateriaService : IMateriaService
    {
        public async Task<List<MateriaDto>> ObtenerTodasAsync()
            => await ApiClient.GetAsync<List<MateriaDto>>("/api/materias");

        public async Task CrearAsync(MateriaDto materia)
            => await ApiClient.PostAsync("/api/materias", materia);

        public async Task ActualizarAsync(long? id, MateriaDto materia)
            => await ApiClient.PutAsync($"/api/materias/{id}", materia);

        public async Task EliminarAsync(long? id)
            => await ApiClient.DeleteAsync($"/api/materias/{id}");
    }
}
