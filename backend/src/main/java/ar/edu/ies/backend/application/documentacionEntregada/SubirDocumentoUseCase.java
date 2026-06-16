package ar.edu.ies.backend.application.documentacionEntregada;

import ar.edu.ies.backend.domain.documentacionEntregada.DocumentacionEntregada;
import ar.edu.ies.backend.domain.documentacionEntregada.DocumentacionEntregadaRepository;
import ar.edu.ies.backend.exception.RecursoDuplicadoException;

public class SubirDocumentoUseCase {
	
	private final DocumentacionEntregadaRepository docEntregadaRepository;
	
	public SubirDocumentoUseCase(DocumentacionEntregadaRepository docEntregadaRepository) {
		
		this.docEntregadaRepository = docEntregadaRepository;
	}
	
	public DocumentacionEntregada ejecutar(
			Long idInscripcion, Long idDocumento, String rutaArchivo
	) {
		
		// VALIDACIONES
		
		if(docEntregadaRepository.existe(idInscripcion, idDocumento))
			throw new RecursoDuplicadoException("El documento ya fue cargado");
		
		// CREACIÓN DEL DOMINIO
		
		DocumentacionEntregada doc = new DocumentacionEntregada(
				idInscripcion,
				idDocumento,
				false, // inicial
				false, // inicial
				null,
				rutaArchivo
		);
		
		// LÓGICA DE NEGOCIO
		
		doc.marcarComoEntregado();
		
		// GUARDAR
		
		return docEntregadaRepository.guardar(doc);
	}
}
