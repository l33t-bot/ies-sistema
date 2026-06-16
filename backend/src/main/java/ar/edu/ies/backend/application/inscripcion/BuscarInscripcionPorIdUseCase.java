package ar.edu.ies.backend.application.inscripcion;

import ar.edu.ies.backend.domain.inscripcion.Inscripcion;
import ar.edu.ies.backend.domain.inscripcion.InscripcionRepository;
import ar.edu.ies.backend.exception.RecursoNoEncontradoException;

public class BuscarInscripcionPorIdUseCase {

	private final InscripcionRepository inscripcionRepository;
	
	public BuscarInscripcionPorIdUseCase(InscripcionRepository inscripcionRepository) {
		
		this.inscripcionRepository = inscripcionRepository;
	}
	
	public Inscripcion ejecutar(Long idInscripcion) {
		
		return inscripcionRepository.buscarPorId(idInscripcion)
				.orElseThrow(() -> new RecursoNoEncontradoException(
							"Inscripción no encontrada"
						)
				);
	}
}
