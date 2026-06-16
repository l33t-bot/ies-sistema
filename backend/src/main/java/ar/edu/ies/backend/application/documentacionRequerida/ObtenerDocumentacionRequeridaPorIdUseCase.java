package ar.edu.ies.backend.application.documentacionRequerida;

import ar.edu.ies.backend.domain.documentacionRequerida.DocumentacionRequerida;
import ar.edu.ies.backend.domain.documentacionRequerida.DocumentacionRequeridaRepository;
import ar.edu.ies.backend.exception.RecursoNoEncontradoException;

public class ObtenerDocumentacionRequeridaPorIdUseCase {

	private final DocumentacionRequeridaRepository requeridaRepository;
	private final DocumentacionRequeridaValidator validator;
	
	public ObtenerDocumentacionRequeridaPorIdUseCase(
			DocumentacionRequeridaRepository requeridaRepository,
			DocumentacionRequeridaValidator validator
	) {
		
		this.requeridaRepository = requeridaRepository;
		this.validator = validator;
	}
	
	public DocumentacionRequerida ejecutar(Long id) {
		
		validator.validarId(id);
		
		DocumentacionRequerida doc = requeridaRepository.buscarPorId(id)
				.orElseThrow(() -> new RecursoNoEncontradoException(
						"Documento no encontrado con ID: " + id
									)
				);
		
		return doc;
	}
}
