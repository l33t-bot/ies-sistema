package ar.edu.ies.backend.mapper;

import ar.edu.ies.backend.dto.PlanDto;
import ar.edu.ies.backend.model.Carrera;
import ar.edu.ies.backend.model.Plan;

public class PlanMapper {

	public static PlanDto toDto(Plan entity) {
		if (entity == null) return null;
		
		PlanDto dto = new PlanDto();
		dto.setIdPlan(entity.getIdPlan());
		
		dto.setNombrePlan(entity.getNombrePlan());
		dto.setAnioInicio(entity.getAnioInicio());
		dto.setActivo(entity.getActiva());
		
		if (entity.getCarrera() != null) {
			dto.setIdCarrera(entity.getCarrera().getIdCarrera());
			dto.setNombreCarrera(entity.getCarrera().getNombre());
		}
		
		return dto;
	}
	
	public static Plan toEntity(PlanDto dto, Carrera carrera) {
		if (dto == null) return null;
		
		Plan entity = new Plan();
		entity.setIdPlan(dto.getIdPlan());
		entity.setCarrera(carrera);
		entity.setNombrePlan(dto.getNombrePlan());
		entity.setAnioInicio(dto.getAnioInicio());
		entity.setActivo(dto.getActivo());
		
		return entity;
	}
	
	public static void updateEntity(Plan entity, PlanDto dto, Carrera carrera) {
		
		entity.setCarrera(carrera); // objeto completo
		entity.setNombrePlan(dto.getNombrePlan());
		entity.setAnioInicio(dto.getAnioInicio());
		entity.setActivo(dto.getActivo());
	}
}
