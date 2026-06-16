package ar.edu.ies.backend.application.documentacionEntregada;

import java.util.List;

import ar.edu.ies.backend.domain.documentacionEntregada.DocumentacionEntregada;
import ar.edu.ies.backend.domain.documentacionEntregada.DocumentacionEntregadaRepository;
import ar.edu.ies.backend.exception.ValidacionException;

public class ListarPorInscripcionUseCase {

	private final DocumentacionEntregadaRepository docEntregadaRepository;
	
	public ListarPorInscripcionUseCase(DocumentacionEntregadaRepository docEntregadaRepository) {
		
		this.docEntregadaRepository = docEntregadaRepository;
	}
	
	public List<DocumentacionEntregada> ejecutar(Long idInscripcion) {
		
		if (idInscripcion == null)
			throw new ValidacionException("El ID de inscripción es obligatorio");
		
		return docEntregadaRepository.buscarPorInscripcion(idInscripcion);
	}
}
