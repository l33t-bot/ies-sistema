package ar.edu.ies.backend.application.preinscripcion;

import ar.edu.ies.backend.domain.preinscripcion.Preinscripcion;
import ar.edu.ies.backend.domain.preinscripcion.PreinscripcionRepository;

public class RechazarPreinscripcionUseCase {

	private final PreinscripcionRepository preinscripcionRepository;
	
	public RechazarPreinscripcionUseCase(PreinscripcionRepository preinscripcionRepository) {
		
		this.preinscripcionRepository = preinscripcionRepository;
	}
	
	public Preinscripcion ejecutar(Long id) {
		
		Preinscripcion pre = preinscripcionRepository.buscarPorId(id)
				.orElseThrow(() -> new RuntimeException("Preinscripción no encontrada"));
		
		pre.rechazar();
		
		return preinscripcionRepository.guardar(pre);
	}
}
