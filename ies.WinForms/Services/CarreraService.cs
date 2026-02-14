using ies.WinForms.Api;
using ies.WinForms.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ies.WinForms.Services
{
    public class CarreraService
    {
        private readonly ApiCarrera api = new ApiCarrera();

        public async Task<List<CarreraDto>> ObtenerTodas()
        {
            return await api.GetAll();
        }

        public async Task Guardar(CarreraDto carrera)
        {
            if (string.IsNullOrWhiteSpace(carrera.nombre))
                throw new Exception("El nombre de la carrera es obligatorio");

            await api.Save(carrera);
        }

        public async Task Eliminar(long id)
        {
            await api.Delete(id);
        }
    }
}
