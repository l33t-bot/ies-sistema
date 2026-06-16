package ar.edu.ies.backend.application.inscripcion;

import ar.edu.ies.backend.domain.inscripcion.Inscripcion;
import ar.edu.ies.backend.domain.inscripcion.InscripcionRepository;
import ar.edu.ies.backend.exception.RecursoNoEncontradoException;
import ar.edu.ies.backend.exception.ValidacionException;

public class RechazarInscripcionUseCase {

	private final InscripcionRepository inscripcionRepository;
	
	public RechazarInscripcionUseCase(InscripcionRepository inscripcionRepository) {
		
		this.inscripcionRepository = inscripcionRepository;
	}
	
	public Inscripcion ejecutar(Long idInscripcion, String motivo) {
		
		// VALIDO EL MOTIVO DE RECHAZO
		if(motivo == null || motivo.trim().isEmpty())
			throw new ValidacionException(
					"El motivo de rechazo es obligatorio"
			);
		
		Inscripcion inscripcion = inscripcionRepository
				.buscarPorId(idInscripcion)
				.orElseThrow(() ->
						new RecursoNoEncontradoException("Inscripción no encontrada")
				);
		
		inscripcion.rechazar(motivo);
		
		return inscripcionRepository.guardar(inscripcion);
	}
}
