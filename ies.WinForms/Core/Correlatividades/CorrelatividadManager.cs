using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ies.WinForms.Core.Correlatividades
{
    public class CorrelatividadManager
    {
        private readonly ICorrelatividadService _service;

        public CorrelatividadManager(ICorrelatividadService service)
        {
            _service = service;
        }

        public async Task<List<CorrelatividadDto>> ObtenerPorMateriaPrincipal(long? idMateriaPrincipal)
        {
            return await _service.ObtenerPorMateriaAsync(idMateriaPrincipal);
        }

        public async Task<List<CorrelatividadDto>> ObtenerPorMateriaRequisito(long? idMateriaRequisito)
        {
            var lista = await _service.ObtenerTodasAsync();
            return lista.Where(x => x.idMateriaRequisito == idMateriaRequisito).ToList();
        }

        public async Task Guardar(CorrelatividadDto correlatividad)
        {
            // AQUÍ TINE QUE IR LA VALIDACIÓN, AÚN NO SE COMO ES POR LO QUE TODO ES
            // FK

            // revisar el booleano esEdicion, separe responsabilidad y no me hace falta
            // no quiero cambiar nada aún por lo que funciona tal como está
            await Validar(correlatividad);
            await _service.CrearAsync(correlatividad);
        }

        public async Task Actualizar(long? idCorrelatividad, CorrelatividadDto correlatividad)
        {
            if (idCorrelatividad == null) throw new Exception("ID inválido");

            await Validar(correlatividad);
            await _service.ActualizarAsync(correlatividad.idCorrelatividad, correlatividad);
        }

        public async Task Eliminar(long? id)
        {
            await _service.EliminarAsync(id);
        }

        private async Task Validar(CorrelatividadDto c)
        {
            // materia principal
            if (c.idMateriaPrincipal == null)
                throw new Exception("Debe seleccionar una materia principal");

            // materia requisito
            if (c.idMateriaRequisito == null)
                throw new Exception("Debe seleccionar una materia requisito");

            // no puede ser la misma
            if (c.idMateriaPrincipal == c.idMateriaRequisito)
                throw new Exception("Una materia no puede ser correlativa de si misma");

            // tipo correlativa obligatorio
            if (string.IsNullOrWhiteSpace(c.tipoCorrelativa))
                throw new Exception("Debe seleccionar el tipo de correlativa");

            // controlar duplicados
            var existentes = await _service.ObtenerPorMateriaAsync(c.idMateriaPrincipal.Value);

            bool existe = existentes.Any(x =>
                x.idMateriaRequisito == c.idMateriaRequisito &&
                x.tipoCorrelativa == c.tipoCorrelativa &&
                x.idCorrelatividad != c.idCorrelatividad
            );

            if (existe)
                throw new Exception("La correlatividad ya existe");
        }
    }
}
