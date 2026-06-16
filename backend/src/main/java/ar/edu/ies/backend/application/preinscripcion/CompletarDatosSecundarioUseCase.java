package ar.edu.ies.backend.application.preinscripcion;

import ar.edu.ies.backend.domain.preinscripcion.*;

public class CompletarDatosSecundarioUseCase {

	private final PreinscripcionRepository preinscripcionRepository;
	
	public CompletarDatosSecundarioUseCase(PreinscripcionRepository preinscripcionRepository) {
		this.preinscripcionRepository = preinscripcionRepository;
	}
	
	public Preinscripcion ejecutar(
			Long id, String egresadoDe,
			String titulo, Boolean debeMaterias,
			String materiasAdeudadas
	) {
		
		Preinscripcion pre = preinscripcionRepository.buscarPorId(id)
				.orElseThrow(() -> new IllegalArgumentException("Preinscripcion no encontrada"));
		
		pre.completarDatosSecundario(
				egresadoDe, titulo,
				debeMaterias, materiasAdeudadas
		);
		
		return preinscripcionRepository.guardar(pre);
	}
}
