package ar.edu.ies.backend.application.inscripcion;

import ar.edu.ies.backend.domain.inscripcion.Inscripcion;
import ar.edu.ies.backend.domain.inscripcion.InscripcionRepository;
import ar.edu.ies.backend.exception.RecursoNoEncontradoException;
import ar.edu.ies.backend.exception.ValidacionException;

public class ActualizarObservacionInscripcionUseCase {
	
	private final InscripcionRepository inscripcionRepository;

    public ActualizarObservacionInscripcionUseCase(InscripcionRepository inscripcionRepository) {
        this.inscripcionRepository = inscripcionRepository;
    }

    public Inscripcion ejecutar(Long idInscripcion, String observacion) {
    	
    	if(observacion == null || observacion.trim().isEmpty())
    		throw new ValidacionException("La observación es obligatoria");
    	
    	Inscripcion inscripcion = inscripcionRepository
    			.buscarPorId(idInscripcion)
    			.orElseThrow(() ->
    					new RecursoNoEncontradoException(
    							"Inscripción no encontrada"
    						)
    			);
    	
    	inscripcion.cambiarObservaciones(observacion);
    	
    	return inscripcionRepository.guardar(inscripcion);
    }
}
