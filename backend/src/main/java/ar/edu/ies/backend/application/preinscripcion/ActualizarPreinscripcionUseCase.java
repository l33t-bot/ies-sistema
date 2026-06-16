package ar.edu.ies.backend.application.preinscripcion;

import ar.edu.ies.backend.domain.preinscripcion.Preinscripcion;
import ar.edu.ies.backend.domain.preinscripcion.PreinscripcionRepository;

public class ActualizarPreinscripcionUseCase {

	private final PreinscripcionRepository preinscripcionRepository;
	
	public ActualizarPreinscripcionUseCase(PreinscripcionRepository preinscripcionRepository) {
		
		this.preinscripcionRepository = preinscripcionRepository;
	}
	
	public Preinscripcion ejecutar(Long idPreinscripcion, Long idCarrera,
			String apellido, String nombres, String dni, Integer edad, String email) {
		
		if (idPreinscripcion == null) {
			throw new IllegalArgumentException("El ID de la preinscripción es obligatorio");
		}
		
		Preinscripcion existente = preinscripcionRepository.buscarPorId(idPreinscripcion)
				.orElseThrow(() -> new RuntimeException("Preinscripción no encontrada"));
		
		existente.actualizarDatos(idCarrera, apellido, nombres, dni, edad, email);
		
		return preinscripcionRepository.actualizar(existente);
	}
}
