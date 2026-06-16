package ar.edu.ies.backend.application.preinscripcion;

import ar.edu.ies.backend.domain.preinscripcion.*;

public class CompletarDatosSaludUseCase {

	private final PreinscripcionRepository preinscripcionRepository;
	
	public CompletarDatosSaludUseCase(PreinscripcionRepository preinscripcionRepository) {
		
		this.preinscripcionRepository = preinscripcionRepository;
	}
	
	public Preinscripcion ejecutar(
			Long id, String afeccion, String grupoSanguineo
	) {
		
		Preinscripcion pre = preinscripcionRepository.buscarPorId(id)
				.orElseThrow(() -> new IllegalArgumentException("Preinscripción no encontrada"));
		
		pre.completarDatosSalud(afeccion, grupoSanguineo);
		
		return preinscripcionRepository.guardar(pre);
	}
}
