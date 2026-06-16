package ar.edu.ies.backend.application.documentacionEntregada;

import ar.edu.ies.backend.domain.documentacionEntregada.DocumentacionEntregada;
import ar.edu.ies.backend.domain.documentacionEntregada.DocumentacionEntregadaRepository;
import ar.edu.ies.backend.exception.RecursoNoEncontradoException;
import ar.edu.ies.backend.exception.ValidacionException;

public class RechazarUseCase {

	private final DocumentacionEntregadaRepository docEntregadaRepository;
	
	public RechazarUseCase(DocumentacionEntregadaRepository docEntregadaRepository) {
		
		this.docEntregadaRepository = docEntregadaRepository;
	}
	
	public DocumentacionEntregada ejecutar(Long idEntrega, String observaciones) {
		
		// VALIDACIÓN DE OBSERVACIÓN
		if (observaciones == null)
			throw new ValidacionException("Debe ingresar una observación para rechazar");
		
		DocumentacionEntregada doc = docEntregadaRepository.bucarPorId(idEntrega)
				.orElseThrow(() -> new RecursoNoEncontradoException(
						"Documentación no encontrada con ID: " + idEntrega
						)
				);
		
		// LÓGICA DE DOMINIO
		doc.rechazarDocumento(observaciones);
		
		return docEntregadaRepository.guardar(doc);
	}
}
