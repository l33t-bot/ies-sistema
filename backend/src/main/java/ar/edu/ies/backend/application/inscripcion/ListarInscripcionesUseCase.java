package ar.edu.ies.backend.application.inscripcion;

import java.util.List;

import ar.edu.ies.backend.domain.inscripcion.Inscripcion;
import ar.edu.ies.backend.domain.inscripcion.InscripcionRepository;

public class ListarInscripcionesUseCase {

	private final InscripcionRepository inscripcionRepository;
	
	public ListarInscripcionesUseCase(InscripcionRepository inscripcionRepository) {
		
		this.inscripcionRepository = inscripcionRepository;
	}
	
	public List<Inscripcion> ejecutar(){
		
		return inscripcionRepository.listarTodo();
	}
}
