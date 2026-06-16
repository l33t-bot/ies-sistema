package ar.edu.ies.backend.application.preinscripcion;

import ar.edu.ies.backend.domain.preinscripcion.Preinscripcion;
import ar.edu.ies.backend.domain.preinscripcion.PreinscripcionRepository;

public class CompletarDatosPreinscripcionUseCase {

	private final PreinscripcionRepository preinscripcionRepository;
	
	public CompletarDatosPreinscripcionUseCase(PreinscripcionRepository preinscripcionRepository) {
		
		this.preinscripcionRepository = preinscripcionRepository;
	}
	
	public Preinscripcion ejecutar(
			Long id, String telefono,
			String domicilio, String localidad
	) {
		
		Preinscripcion pre = preinscripcionRepository.buscarPorId(id)
				.orElseThrow(() -> new RuntimeException("Preinscripción no encontrada"));
		
		//pre.actualizarContacto(telefono, domicilio);
		
		return preinscripcionRepository.guardar(pre);
	}
}
