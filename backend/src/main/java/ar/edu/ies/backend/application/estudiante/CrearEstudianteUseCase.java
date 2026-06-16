package ar.edu.ies.backend.application.estudiante;

import ar.edu.ies.backend.domain.estudiante.Estudiante;
import ar.edu.ies.backend.domain.estudiante.EstudianteRepository;
import ar.edu.ies.backend.exception.RecursoDuplicadoException;

public class CrearEstudianteUseCase {

	private final EstudianteRepository estudianteRepository;
	
	public CrearEstudianteUseCase(EstudianteRepository estudianteRepository) {
		
		this.estudianteRepository = estudianteRepository;
	}
	
	public Estudiante ejecutar(Estudiante estudiante) {
		
		if (estudianteRepository.existePorDni(estudiante.getDni()))
			throw new RecursoDuplicadoException("Ya existe un estudiante con DNI: " + estudiante.getDni());
		
		return estudianteRepository.guardar(estudiante);
	}
}
