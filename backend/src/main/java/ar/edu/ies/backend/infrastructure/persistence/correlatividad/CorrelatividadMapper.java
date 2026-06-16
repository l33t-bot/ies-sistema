package ar.edu.ies.backend.infrastructure.persistence.correlatividad;

import ar.edu.ies.backend.domain.correlatividad.Correlatividad;

public class CorrelatividadMapper {
	
	private CorrelatividadMapper() {
	
	}

	public static Correlatividad toDomain(CorrelatividadEntity entity) {
		
		if (entity == null) return null;
		
		return new Correlatividad(
				entity.getIdCorrelatividad(),
				entity.getIdMateriaPrincipal(),
				entity.getIdMateriaRequisito(),
				entity.getTipoCorrelativa(),
				entity.getActivo()
		);
	}
	
	public static CorrelatividadEntity toEntity(Correlatividad domain) {
		
		if (domain == null) return null;
		
		CorrelatividadEntity entity = new CorrelatividadEntity();
		
		entity.setIdCorrelatividad(domain.getIdCorrelatividad());
		entity.setIdMateriaPrincipal(domain.getIdMateriaPrincipal());
		entity.setIdMateriaRequisito(domain.getIdMateriaRequisito());
		entity.setTipoCorrelativa(domain.getTipoCorrelativa());
		entity.setActivo(domain.getActiva());
		
		return entity;
	}
}
