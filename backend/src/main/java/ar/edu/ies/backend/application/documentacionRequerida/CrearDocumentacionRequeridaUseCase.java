package ar.edu.ies.backend.application.documentacionRequerida;

import ar.edu.ies.backend.domain.documentacionRequerida.DocumentacionRequerida;
import ar.edu.ies.backend.domain.documentacionRequerida.DocumentacionRequeridaRepository;
import ar.edu.ies.backend.exception.RecursoDuplicadoException;

// hasta el momento creo que hasta aquí estoy creando uno de los mejores use case
// usar de ejemplo en los próximos use case
public class CrearDocumentacionRequeridaUseCase {

	private final DocumentacionRequeridaRepository requeridaRepository;
	private final DocumentacionRequeridaValidator validator;
	
	public CrearDocumentacionRequeridaUseCase(
			DocumentacionRequeridaRepository requeridaRepository,
			DocumentacionRequeridaValidator validator
	) {
		
		this.requeridaRepository = requeridaRepository;
		this.validator = validator;
	}
	
	public DocumentacionRequerida ejecutar(
			String nombre, Boolean obligatorio,
			Boolean aplicaInicial, Boolean aplicaReinscripcion
	) {
		
		// VALIDACIONES
		validator.validarNombre(nombre);
		
		// VALIDAR NOMBRE ÚNICO
		if (requeridaRepository.buscarPorNombre(nombre).isPresent())
			throw new RecursoDuplicadoException(
					"Ya existe un documento con ese nombre: " + nombre
			);
		
		// CREAR DOMINIO
		DocumentacionRequerida doc = new DocumentacionRequerida(
				nombre, obligatorio, aplicaInicial, aplicaReinscripcion
		);
		
		return requeridaRepository.guardar(doc);
	}
}
