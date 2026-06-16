package ar.edu.ies.backend.application.documentacionRequerida;

import ar.edu.ies.backend.domain.documentacionRequerida.DocumentacionRequerida;
import ar.edu.ies.backend.domain.documentacionRequerida.DocumentacionRequeridaRepository;
import ar.edu.ies.backend.exception.RecursoDuplicadoException;
import ar.edu.ies.backend.exception.RecursoNoEncontradoException;

public class ActualizarDocumentacionRequeridaUseCase {
	
	private final DocumentacionRequeridaRepository requeridaRepository;
	private final DocumentacionRequeridaValidator validator;
	
	public ActualizarDocumentacionRequeridaUseCase(
			DocumentacionRequeridaRepository requeridaRepository,
			DocumentacionRequeridaValidator validator
	) {
		
		this.requeridaRepository = requeridaRepository;
		this.validator = validator;
	}
	
	public DocumentacionRequerida ejecutar (
			Long idDocumento, String nombre, Boolean obligatorio,
			Boolean aplicaInicial, Boolean aplicaReinscripcion
	) {
		// VALIDACIONES
		validator.validarId(idDocumento);
		validator.validarNombre(nombre);
		validator.validarObligatorio(obligatorio);
		validator.validarAplicarInscripcionInicial(aplicaInicial);
		validator.validarAplicaReinscripcion(aplicaReinscripcion);
		
		
		// OBTENER ENTIDAD EXISTENTE
		DocumentacionRequerida existente = requeridaRepository.buscarPorId(idDocumento)
				.orElseThrow(() -> new RecursoNoEncontradoException(
						"Documento no encontrado con ID: " + idDocumento
				)
		);
		
		// VALIDAR NOMBRE ÚNICO
		requeridaRepository.buscarPorNombre(nombre)
				.ifPresent(doc -> {
					if (!doc.getIdDocumento().equals(idDocumento))
						throw new RecursoDuplicadoException("Ya existe un documento con ese nombre");
				});
		
		// APLICAR CAMBIOS DEL COMPORTAMIENTO DEL DOMINIO
		existente.cambiarNombreDocumento(nombre);
		existente.cambiarObligatorio(obligatorio);
		existente.cambiarAplicaInscripcion(aplicaInicial);
		existente.cambiarAplicaReinscripcion(aplicaReinscripcion);
		
		return requeridaRepository.guardar(existente);
	}
}
