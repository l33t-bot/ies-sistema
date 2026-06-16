package ar.edu.ies.backend.application.estudiante;

import ar.edu.ies.backend.domain.estudiante.Estudiante;
import ar.edu.ies.backend.domain.estudiante.EstudianteRepository;
import ar.edu.ies.backend.exception.RecursoDuplicadoException;
import ar.edu.ies.backend.exception.RecursoNoEncontradoException;

public class ActualizarEstudianteUseCase {

	private final EstudianteRepository estudianteRepository;
	
	public ActualizarEstudianteUseCase(EstudianteRepository estudianteRepository) {
		
		this.estudianteRepository = estudianteRepository;
	}
	
	public Estudiante ejecutar(Long id, Estudiante datos) {
		
		Estudiante existente = estudianteRepository.buscarPorId(id)
				.orElseThrow(() -> new RecursoNoEncontradoException(
								   			"Estudiante no encontrado con ID: " + id
								   )
		);
		
		validarDniUnico(existente, datos);
		
		existente.cambiarApellido(datos.getApellido());
		existente.cambiarNombres(datos.getNombres());
		existente.cambiarDni(datos.getDni());
		existente.cambiarFechaNacimiento(datos.getFechaNacimiento());
		
		return estudianteRepository.guardar(existente);
	}
	
	private void validarDniUnico(Estudiante existente, Estudiante datos) {
		
		if (!existente.getDni().equals(datos.getDni()) && estudianteRepository.existePorDni(datos.getDni()))
			throw new RecursoDuplicadoException("Ya existe otro estudiante con DNI: " + datos.getDni());
	}
}
