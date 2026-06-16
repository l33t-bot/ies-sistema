package ar.edu.ies.backend.infrastructure.controller.mapper;

import java.util.List;

import ar.edu.ies.backend.domain.documentacionEntregada.DocumentacionEntregada;
import ar.edu.ies.backend.infrastructure.controller.dto.documentacionEntregada.DocumentacionEntregadaResponseDto;

public class DocumentacionEntregadaControllerMapper {

	// =========================
    // DOMAIN → RESPONSE
    // =========================
	
	public static DocumentacionEntregadaResponseDto toResponse(DocumentacionEntregada doc) {
		
		return new DocumentacionEntregadaResponseDto(
				doc.getIdEntrega(),
				doc.getIdInscripcion(),
				doc.getIdDocumento(),
				doc.getEntregado(),
				doc.getFechaEntrega(),
				doc.getValido(),
				doc.getObservaciones(),
				doc.getRutaArchivo()
		);
	}
	
	// =========================
    // LIST → RESPONSE LIST
    // =========================
	
	public static List<DocumentacionEntregadaResponseDto> toResponseList(
			List<DocumentacionEntregada> lista
	) {
		return lista.stream()
				.map(DocumentacionEntregadaControllerMapper::toResponse)
				.toList();
	}
}
