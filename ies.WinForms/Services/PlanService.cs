using ies.WinForms.Api;
using ies.WinForms.Models;
using ies.WinForms.Utils;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ies.WinForms.Services
{
    public class PlanService
    {
        private readonly ApiPlan api = new ApiPlan();

        public async Task<List<PlanDto>> ObtenerTodos()
        {
            return await api.GetAll();
        }

        public async Task<List<PlanDto>> ObtenerActivos()
        {
            var list = await api.GetAll();
            return list.Where(x => x.activo == true).ToList();
        }

        public async Task<List<PlanDto>> ObtenerPorCarrera(long idCarrera)
        {
            return await api.GetByCarrera(idCarrera);
        }

        public async Task Guardar(PlanDto plan)
        {
            if (string.IsNullOrWhiteSpace(plan.nombrePlan))
                throw new Exception("El nombre del plan es obligatorio.");

            if (plan.idCarrera == null)
                throw new Exception("Debe seleccionar una carrera");

            await api.Save(plan);
        }

        public async Task Eliminar(long idPlan)
        {
            await api.Delete(idPlan);
        }
    }
}
