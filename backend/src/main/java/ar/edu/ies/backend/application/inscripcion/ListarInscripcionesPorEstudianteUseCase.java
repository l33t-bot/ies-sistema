package ar.edu.ies.backend.application.inscripcion;

import java.util.List;

import ar.edu.ies.backend.domain.inscripcion.Inscripcion;
import ar.edu.ies.backend.domain.inscripcion.InscripcionRepository;

public class ListarInscripcionesPorEstudianteUseCase {

	private final InscripcionRepository inscripcionRepository;
	
	public ListarInscripcionesPorEstudianteUseCase(InscripcionRepository inscripcionRepository) {
		
		this.inscripcionRepository = inscripcionRepository;
	}
	
	public List<Inscripcion> ejecutar(Long idEstudiante) {
		
		return inscripcionRepository.buscarPorEstudiante(idEstudiante);
	}
}
