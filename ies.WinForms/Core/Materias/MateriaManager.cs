using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ies.WinForms.Core.Materias
{
    public class MateriaManager
    {
        private readonly IMateriaService _service;

        public MateriaManager(IMateriaService service)
        {
            _service = service;
        }

        public async Task<List<MateriaDto>> ObtenerTodas()
        {
            var lista = await _service.ObtenerTodasAsync();
            return lista;
        }

        public async Task<List<MateriaDto>> ObtenerPorPlan(long? idPlan)
        {
            var lista = await _service.ObtenerTodasAsync();
            return lista.Where(x => x.idPlan == idPlan).ToList();
        }

        //public async Task<List<MateriaDto>> ObtenerPorCarrera(long? idCarrera)
        //{
        //    var lista = await _service.ObtenerTodasAsync();
        //    return lista.Where(x => x.idCarrera == idCarrera).Tolist();
        //}

        public async Task Guardar(MateriaDto materia, bool esEdicion)
        {
            Validar(materia);

            await _service.CrearAsync(materia);
            //if (esEdicion) await _service.ActualizarAsync(materia.idMateria, materia);
        }

        public async Task Actualizar(long? idMateria, MateriaDto materia)
        {
            await _service.ActualizarAsync(materia.idMateria, materia);
        }

        private void Validar(MateriaDto materia)
        {
            if (string.IsNullOrWhiteSpace(materia.nombre))
                throw new Exception("El nombre es obligatorio");
        }

        public async Task Desactivar(long? id)
        {
            var materia = (await _service.ObtenerTodasAsync())
                            .First(x => x.idMateria == id);
            materia.activa = false;

            await _service.ActualizarAsync(id, materia);
        }
    }
}
