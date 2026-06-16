package ar.edu.ies.backend.application.inscripcion;

import java.util.List;

import ar.edu.ies.backend.domain.inscripcion.Inscripcion;
import ar.edu.ies.backend.domain.inscripcion.InscripcionRepository;

public class ListarInscripcionesPorPeriodoUseCase {

	private final InscripcionRepository inscripcionRepository;
	
	public ListarInscripcionesPorPeriodoUseCase(InscripcionRepository inscripcionRepository) {
		
		this.inscripcionRepository = inscripcionRepository;
	}
	
	public List<Inscripcion> ejecutar(Long idPeriodo) {
		
		return inscripcionRepository.buscarPorPeriodo(idPeriodo);
	}
}
