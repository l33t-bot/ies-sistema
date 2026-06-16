package ar.edu.ies.backend.application.documentacionRequerida;

import ar.edu.ies.backend.domain.documentacionRequerida.DocumentacionRequerida;
import ar.edu.ies.backend.domain.documentacionRequerida.DocumentacionRequeridaRepository;
import ar.edu.ies.backend.exception.RecursoNoEncontradoException;

public class BuscarDocumentacionPorNombreUseCase {

	private final DocumentacionRequeridaRepository requeridaRepository;
	private final DocumentacionRequeridaValidator validator;
	
	public BuscarDocumentacionPorNombreUseCase(
			DocumentacionRequeridaRepository requeridaRepository,
			DocumentacionRequeridaValidator validator
	) {
		
		this.requeridaRepository = requeridaRepository;
		this.validator = validator;
	}
	
	public DocumentacionRequerida ejecutar(String nombre) {
		
		validator.validarNombre(nombre);
		
		return requeridaRepository.buscarPorNombre(nombre)
				.orElseThrow(() -> new RecursoNoEncontradoException(
						"Documento no encontrado con nombre: " + nombre
				)
		);
	}
}
