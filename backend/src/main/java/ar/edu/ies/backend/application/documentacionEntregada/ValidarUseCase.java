package ar.edu.ies.backend.application.documentacionEntregada;

import ar.edu.ies.backend.domain.documentacionEntregada.DocumentacionEntregada;
import ar.edu.ies.backend.domain.documentacionEntregada.DocumentacionEntregadaRepository;
import ar.edu.ies.backend.exception.RecursoNoEncontradoException;

public class ValidarUseCase {

	private final DocumentacionEntregadaRepository docEntregadaRepository;
	
	public ValidarUseCase(DocumentacionEntregadaRepository docEntregadaRepository) {
		
		this.docEntregadaRepository = docEntregadaRepository;
	}
	
	public DocumentacionEntregada ejecutar(Long idEntrega) {
		
		DocumentacionEntregada doc = docEntregadaRepository.bucarPorId(idEntrega)
				.orElseThrow(() ->
				new RecursoNoEncontradoException(
						"Documentación no encontrada con ID: " + idEntrega
					)
				);
		
		doc.validarDocumento();
		
		return docEntregadaRepository.guardar(doc);
	}
}
