package ar.edu.ies.backend.infrastructure.persistence.materia;

import ar.edu.ies.backend.domain.materia.Materia;

public class MateriaMapper {

	private MateriaMapper() {
		
	}
	
	public static Materia toDomain(MateriaEntity entity) {
		
		if (entity == null) return null;
		
		return new Materia(
				entity.getIdMateria(),
				entity.getIdPlan(),
				entity.getCodigo(),
				entity.getNombre(),
				entity.getAnioCarrera(),
				entity.getEsPromocional(),
				entity.getActiva()
		);
	}
	
	public static MateriaEntity toEntity(Materia domain) {
		
		if (domain == null) return null;
		
		MateriaEntity entity = new MateriaEntity();
		
		entity.setIdMateria(domain.getIdMateria());
		entity.setIdPlan(domain.getIdPlan());
		entity.setCodigo(domain.getCodigo());
		entity.setNombre(domain.getNombre());
		entity.setAnioCarrera(domain.getAnioCarrera());
		entity.setEsPromocional(domain.getEsPromocional());
		entity.setActiva(domain.getActiva());
		
		return entity;
	}
}
