package ar.edu.ies.backend.application.preinscripcion;

import java.time.LocalDate;

import ar.edu.ies.backend.domain.preinscripcion.*;

public class ActualizarFechaNacimientoUseCase {

	private final PreinscripcionRepository preinscripcionRepository;
	
	public ActualizarFechaNacimientoUseCase(PreinscripcionRepository preinscripcionRepository) {
		this.preinscripcionRepository = preinscripcionRepository;
	}
	
	public Preinscripcion ejecutar(Long id, LocalDate fechaNacimiento) {
		
		Preinscripcion pre = preinscripcionRepository.buscarPorId(id)
				.orElseThrow(() -> new IllegalArgumentException("Preinscripción no encontrada"));
		
		pre.actualizarFechaNacimiento(fechaNacimiento);
		
		return preinscripcionRepository.guardar(pre);
	}
}
