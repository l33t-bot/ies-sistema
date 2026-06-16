package ar.edu.ies.backend.infrastructure.controller.mapper;

import ar.edu.ies.backend.domain.inscripcion.Inscripcion;
import ar.edu.ies.backend.infrastructure.controller.dto.inscripcion.InscripcionResponseDto;

public class InscripcionControllerMapper {

	public static InscripcionResponseDto toDto(Inscripcion domain) {
		
		InscripcionResponseDto dto = new InscripcionResponseDto();
		
		dto.setIdInscripcion(domain.getIdInscripcion());
		dto.setIdEstudiante(domain.getIdEstudiante());
		dto.setIdPeriodo(domain.getIdPeriodo());
		dto.setTipoInscripcion(domain.getTipoInscripcion());
		dto.setFechaInscripcionOnline(domain.getFechaInscripcionOnline());
		dto.setFechaEntregaDocumentos(domain.getFechaEntregaDocumentos());
		dto.setEstadoInscripcion(domain.getEstadoInscripcion());
		dto.setAnioQueCursa(domain.getAnioQueCursa());
		dto.setNumeroInscripcion(domain.getNumeroInscripcion());
		dto.setObservaciones(domain.getObservaciones());
				
		return dto;
	}
}
