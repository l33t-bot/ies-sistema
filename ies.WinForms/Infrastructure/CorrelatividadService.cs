using ies.WinForms.Api;
using ies.WinForms.Core.Correlatividades;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ies.WinForms.Infrastructure
{
    public class CorrelatividadService : ICorrelatividadService
    {
        public async Task<List<CorrelatividadDto>> ObtenerTodasAsync()
            => await ApiClient.GetAsync<List<CorrelatividadDto>>("/api/correlatividades");

        public async Task<List<CorrelatividadDto>> ObtenerPorMateriaAsync(long? idMateria)
            => await ApiClient.GetAsync<List<CorrelatividadDto>>($"/api/correlatividades/materia/{idMateria}");

        public async Task CrearAsync(CorrelatividadDto correlatividad)
            =>await ApiClient.PostAsync("/api/correlatividades", correlatividad);

        public async Task ActualizarAsync(long? id, CorrelatividadDto correlatividad)
            => await ApiClient.PutAsync($"/api/correlatividades/{id}", correlatividad);

        public async Task EliminarAsync(long? id)
            => await ApiClient.DeleteAsync($"/api/correlatividades/{id}");
    }
}
