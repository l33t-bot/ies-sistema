package ar.edu.ies.backend.application.preinscripcion;

import java.util.List;

import ar.edu.ies.backend.domain.preinscripcion.Preinscripcion;
import ar.edu.ies.backend.domain.preinscripcion.PreinscripcionRepository;

public class ListarPreinscripcionesUseCase {

	PreinscripcionRepository preinscripcionRepository;
	
	public ListarPreinscripcionesUseCase(PreinscripcionRepository preinscripcionRepository) {
		
		this.preinscripcionRepository = preinscripcionRepository;
	}
	
	public List<Preinscripcion> ejecutar() {
		
		return preinscripcionRepository.listarTodas();
	}
}
