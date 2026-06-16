package ar.edu.ies.backend.application.inscripcion;

import java.util.List;

import ar.edu.ies.backend.domain.inscripcion.EstadoInscripcion;
import ar.edu.ies.backend.domain.inscripcion.Inscripcion;
import ar.edu.ies.backend.domain.inscripcion.InscripcionRepository;

public class ListarInscripcionesPorEstadoUseCase {

	private final InscripcionRepository inscripcionRepository;
	
	public ListarInscripcionesPorEstadoUseCase(InscripcionRepository inscripcionRepository) {
		
		this.inscripcionRepository = inscripcionRepository;
	}
	
	public List<Inscripcion> ejecutar(EstadoInscripcion estado) {
		
		return inscripcionRepository.buscarPorEstado(estado);
	}
}
