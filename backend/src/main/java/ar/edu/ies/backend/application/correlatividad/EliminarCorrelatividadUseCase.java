package ar.edu.ies.backend.application.correlatividad;

import ar.edu.ies.backend.domain.correlatividad.CorrelatividadRepository;
import ar.edu.ies.backend.exception.RecursoNoEncontradoException;

public class EliminarCorrelatividadUseCase {

	private final CorrelatividadRepository correlatividadRepository;
	
	public EliminarCorrelatividadUseCase(CorrelatividadRepository correlatividadRepository) {
		
		this.correlatividadRepository = correlatividadRepository;
	}
	
	public void ejecutar(Long id) {
	
		if (correlatividadRepository.buscarPorId(id).isEmpty())
			throw new RecursoNoEncontradoException("La correlatividad no existe");
		
		correlatividadRepository.eliminar(id);
	}
}
