package ar.edu.ies.backend.infrastructure.controller.mapper;

import ar.edu.ies.backend.domain.documentacionRequerida.DocumentacionRequerida;
import ar.edu.ies.backend.infrastructure.controller.dto.documentacionRequerida.DocumentacionRequeridaResponseDto;

public class DocumentacionRequeridaControllerMapper {

	public static DocumentacionRequeridaResponseDto toDto(DocumentacionRequerida domain) {
		
		return new DocumentacionRequeridaResponseDto(
				domain.getIdDocumento(),
				domain.getNombreDocumento(),
				domain.getObligatorio(),
				domain.getAplicaInscripcion(),
				domain.getAplicaReinscripcion(),
				domain.getDescripcion()
		);
	}
}
