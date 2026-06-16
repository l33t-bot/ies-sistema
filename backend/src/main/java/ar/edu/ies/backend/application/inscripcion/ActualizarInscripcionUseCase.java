package ar.edu.ies.backend.application.inscripcion;

import ar.edu.ies.backend.domain.inscripcion.Inscripcion;
import ar.edu.ies.backend.domain.inscripcion.InscripcionRepository;
import ar.edu.ies.backend.domain.inscripcion.TipoInscripcion;
import ar.edu.ies.backend.exception.RecursoNoEncontradoException;

public class ActualizarInscripcionUseCase {

	private final InscripcionRepository inscripcionRepository;
	
	public ActualizarInscripcionUseCase(InscripcionRepository inscripcionRepository) {
		
		this.inscripcionRepository = inscripcionRepository;
	}
	
	public Inscripcion ejecutar(
			Long idInscripcion,
			TipoInscripcion tipoInscripcion,
			Integer anioQueCursa,
			String observacion
	) {
		Inscripcion inscripcion = inscripcionRepository
				.buscarPorId(idInscripcion)
				.orElseThrow(() ->
						new RecursoNoEncontradoException("Inscripción no encontrada")
				);
		
		inscripcion.cambiarTipoInscripcion(tipoInscripcion);
		inscripcion.cambiarAnioQueCursa(anioQueCursa);
		inscripcion.cambiarObservaciones(observacion);
		
		return inscripcionRepository.guardar(inscripcion);
	}
}
