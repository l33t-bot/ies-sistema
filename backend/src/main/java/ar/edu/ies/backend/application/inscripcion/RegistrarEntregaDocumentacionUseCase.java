package ar.edu.ies.backend.application.inscripcion;

import ar.edu.ies.backend.domain.inscripcion.Inscripcion;
import ar.edu.ies.backend.domain.inscripcion.InscripcionRepository;
import ar.edu.ies.backend.exception.RecursoNoEncontradoException;

public class RegistrarEntregaDocumentacionUseCase {

	private final InscripcionRepository inscripcionRepository;
	
	public RegistrarEntregaDocumentacionUseCase(InscripcionRepository inscripcionRepository) {
		
		this.inscripcionRepository = inscripcionRepository;
	}
	
	public Inscripcion ejecutar(Long idInscripcion) {
		
		Inscripcion inscripcion = inscripcionRepository
				.buscarPorId(idInscripcion)
				.orElseThrow(() ->
					new RecursoNoEncontradoException(
							"Inscripción no encontrada"
						)
				);
		
		inscripcion.registrarEntregaDocumentos(null);
		
		return inscripcionRepository.guardar(inscripcion);
	}
}
