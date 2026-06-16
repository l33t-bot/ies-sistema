package ar.edu.ies.backend.application.preinscripcion;

import ar.edu.ies.backend.domain.preinscripcion.*;

public class CompletarDatosPersonalesUseCase {

	private final PreinscripcionRepository preinscripcionRepository;

	public CompletarDatosPersonalesUseCase(PreinscripcionRepository preinscripcionRepository) {
		this.preinscripcionRepository = preinscripcionRepository;
	}
	
	public Preinscripcion ejecutar(
			Long id, String lugarNacimiento, String nacionalidad
	) {

		Preinscripcion pre = preinscripcionRepository.buscarPorId(id)
				.orElseThrow(() -> new RuntimeException("Preinscripción no encontrada"));

		pre.completarDatosPersonales(lugarNacimiento, nacionalidad);

		return preinscripcionRepository.guardar(pre);
	}
}
