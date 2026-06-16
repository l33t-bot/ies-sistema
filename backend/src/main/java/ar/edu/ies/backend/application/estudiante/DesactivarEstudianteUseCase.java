package ar.edu.ies.backend.application.estudiante;

import ar.edu.ies.backend.domain.estudiante.Estudiante;
import ar.edu.ies.backend.domain.estudiante.EstudianteRepository;
import ar.edu.ies.backend.exception.RecursoNoEncontradoException;

public class DesactivarEstudianteUseCase {
	private final EstudianteRepository estudianteRepository;
	
	public DesactivarEstudianteUseCase(EstudianteRepository estudianteRepository) {
		
		this.estudianteRepository = estudianteRepository;
	}
	
	public void ejecutar(Long id) {
		
		if (id == null)
			throw new IllegalArgumentException("El ID es Obligatorio");
		
		Estudiante estudiante = estudianteRepository.buscarPorId(id)
				.orElseThrow(() -> new RecursoNoEncontradoException(
						"Estudiante no encontrado con ID: " + id)
						);
		
		if (!estudiante.getActivo()) return;
		
		estudiante.desactivar();
		
		estudianteRepository.guardar(estudiante);
	}
}
