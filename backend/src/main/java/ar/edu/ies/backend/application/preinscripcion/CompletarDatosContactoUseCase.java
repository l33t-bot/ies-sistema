package ar.edu.ies.backend.application.preinscripcion;

import ar.edu.ies.backend.domain.preinscripcion.Preinscripcion;
import ar.edu.ies.backend.domain.preinscripcion.PreinscripcionRepository;

public class CompletarDatosContactoUseCase {

	private final PreinscripcionRepository preinscripcionRepository;
	
	public CompletarDatosContactoUseCase(PreinscripcionRepository preinscripcionRepository) {
		
		this.preinscripcionRepository = preinscripcionRepository;
	}
	
	public Preinscripcion ejecutar(
			Long id, String telefono,
			String domicilio, String localidad
	) {
		Preinscripcion pre = preinscripcionRepository.buscarPorId(id)
				.orElseThrow(() -> new RuntimeException("Preinscrión no encontrada"));
		
		pre.actualizarContacto(telefono, domicilio, localidad);
		
		return preinscripcionRepository.guardar(pre);
	}
}
