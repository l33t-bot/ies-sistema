package ar.edu.ies.backend.application.estudiante;

import ar.edu.ies.backend.domain.estudiante.Estudiante;
import ar.edu.ies.backend.domain.estudiante.EstudianteRepository;
import ar.edu.ies.backend.exception.RecursoNoEncontradoException;

public class BuscarEstudianteUseCase {

	private final EstudianteRepository estudianteRepository;
	
	public BuscarEstudianteUseCase(EstudianteRepository estudianteRepository) {
		
		this.estudianteRepository = estudianteRepository;
	}
	
	public Estudiante ejecutar(Long id) {
		
		if (id == null)
			throw new IllegalArgumentException("El ID es obligatorio");
		
		return estudianteRepository.buscarPorId(id)
									.orElseThrow(() ->
									new RecursoNoEncontradoException(
											"Estudiante no encontrado con ID: " + id)
									);
	}
}
