package ar.edu.ies.backend.application.documentacionRequerida;

import ar.edu.ies.backend.domain.documentacionRequerida.DocumentacionRequerida;
import ar.edu.ies.backend.domain.documentacionRequerida.DocumentacionRequeridaRepository;
import ar.edu.ies.backend.exception.RecursoNoEncontradoException;

public class EliminarDocumentacionRequeridaUseCase {

private final DocumentacionRequeridaRepository requeridaRepository;
private final DocumentacionRequeridaValidator validator;
	
	public EliminarDocumentacionRequeridaUseCase(
			DocumentacionRequeridaRepository requeridaRepository,
			DocumentacionRequeridaValidator validator
	) {
		
		this.requeridaRepository = requeridaRepository;
		this.validator = validator;
	}
	
	public void ejecutar(Long id) {
		
		// VALIDACIÓN DE FORMATO
		validator.validarId(id);
					
		// VALIDACIÓN DE EXISTENCIA
		DocumentacionRequerida doc = requeridaRepository.buscarPorId(id)
			.orElseThrow(() -> new RecursoNoEncontradoException("Documento no encontrado con ID: " + id)
		);
		
		requeridaRepository.eliminar(doc.getIdDocumento());
	}
}
