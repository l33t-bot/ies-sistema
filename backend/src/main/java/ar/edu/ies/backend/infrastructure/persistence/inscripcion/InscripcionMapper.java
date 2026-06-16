package ar.edu.ies.backend.infrastructure.persistence.inscripcion;

import ar.edu.ies.backend.domain.estudiante.Estudiante;
import ar.edu.ies.backend.domain.inscripcion.Inscripcion;
import ar.edu.ies.backend.infrastructure.persistence.estudiante.EstudianteEntity;

public class InscripcionMapper {

	// =========================
	// DOMAIN -> ENTITY
	// =========================
	
	public static InscripcionEntity toEntity(Inscripcion domain) {
		
		InscripcionEntity entity = new InscripcionEntity();
		
		entity.setIdInscripcion(domain.getIdInscripcion());
		
		EstudianteEntity estudiante = new EstudianteEntity();
		estudiante.setIdEstudiante(domain.getIdEstudiante());
		entity.setEstudiante(estudiante);
		
		PeriodoEntity periodo = new PeriodoEntity();
		periodo.setPeriodo(domain.getIdPeriodo());
		entity.setPeriodo(periodo);
		
		entity.setTipoInscripcion(domain.getTipoInscripcion());
		entity.setFechaInscripcionOnline(domain.getFechaInscripcionOnline());
		entity.setFechaEntregaDocumentos(domain.getFechaEntregaDocumentos());
		entity.setEstadoInscripcion(domain.getEstadoInscripcion());
		entity.setAnioQueCursa(domain.getAnioQueCursa());
		entity.setNumeroInscripcion(domain.getNumeroInscripcion());
		entity.setObservaciones(domain.getObservaciones());
	}
	
	// =========================
    // ENTITY → DOMAIN
    // =========================
	
	public static Inscripcion toDomain(InscripcionEntity entity) {
		
		
		
		Inscripcion domain = new Inscripcion(
				entity.getIdInscripcion(),
				entity.getEstudiante().getIdEstudiante(),
				entity.getPeriodo().getIdPeriodo(),
				entity.getTipoInscripcion(),
				entity.getFechaInscripcionOnline(),
				entity.getFechaEntregaDocumentos(),
				entity.getEstadoInscripcion(),
				entity.getAnioQueCursa(),
				entity.getNumeroInscripcion(),
				entity.getObservaciones()
		);
		
		return domain;
	}
}
