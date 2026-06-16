package ar.edu.ies.backend.application.estudiante;

import java.util.List;

import ar.edu.ies.backend.domain.estudiante.Estudiante;
import ar.edu.ies.backend.domain.estudiante.EstudianteRepository;

public class ListarEstudiantesUseCase {

	private final EstudianteRepository estudianteRepository;
	
	public ListarEstudiantesUseCase(EstudianteRepository estudianteRepository) {
		
		this.estudianteRepository = estudianteRepository;
	}
	
	public List<Estudiante> ejecutar(){
		
		return estudianteRepository.listarActivos();
	}
}
