package ar.edu.ies.backend.infrastructure.persistence.estudiante;

import java.time.LocalDate;

import ar.edu.ies.backend.domain.estudiante.Estudiante;
import ar.edu.ies.backend.infrastructure.controller.dto.estudianteDto.*;

public class EstudianteMapper {
	
	// =========================
	// REQUEST -> DOMAIN
	// =========================
	
	public static Estudiante toDomain(EstudianteRequestDto dto) {
		
		return new Estudiante(
				dto.getIdUsuario(),
				dto.getApellido(),
				dto.getNombres(),
				dto.getDni(),
				LocalDate.parse(dto.getFechaNacimiento()),
				dto.getEmail()
		);
	}
	
	// =========================
	// DOMAIN -> RESPONSE
	// =========================
	
	public static EstudianteResponseDto toResponse(Estudiante estudiante) {
		
		EstudianteResponseDto dto = new EstudianteResponseDto();
		
		dto.setIdEstudiante(estudiante.getIdEstudiante());
		dto.setApellido(estudiante.getApellido());
		dto.setNombres(estudiante.getNombres());
		dto.setDni(estudiante.getDni());
		dto.setEmail(estudiante.getEmail());
		dto.setFechaNacimiento(estudiante.getFechaNacimiento().toString());
		dto.setActivo(estudiante.getActivo());
		
		dto.setIdCarrera(estudiante.getIdCarrera());
		dto.setIdPlan(estudiante.getIdPlan());
		
		return dto;
	}
	
	// =========================
	// ENTITY → RESPONSE
	// =========================
	
	public static EstudianteResponseDto toResponse(EstudianteEntity entity) {
		
		EstudianteResponseDto dto = new EstudianteResponseDto();
				
		dto.setIdEstudiante(entity.getIdEstudiante());
		dto.setApellido(entity.getApellido());
		dto.setNombres(entity.getNombres());
		dto.setDni(entity.getDni());
		dto.setEmail(entity.getEmail());
		dto.setFechaNacimiento(entity.getFechaNacimiento().toString());
				
		if(entity.getCarrera() != null) {
			
			dto.setIdCarrera(entity.getCarrera().getIdCarrera());
			dto.setNombreCarrera(entity.getCarrera().getNombre());
		}
		
		if(entity.getPlan() != null) {
			
			dto.setIdPlan(entity.getPlan().getIdPlan());
			dto.setNombrePlan(entity.getPlan().getNombrePlan());
		}
		
		dto.setActivo(entity.getActivo());
		
		return dto;
	}
	
	// =========================
	// ENTITY → DOMAIN
	// =========================
	
	public static Estudiante toDomain(EstudianteEntity entity) {
		
		Estudiante estudiante = new Estudiante(
				entity.getUsuario().getIdUsuario(),
				entity.getApellido(),
				entity.getNombres(),
				entity.getDni(),
				entity.getFechaNacimiento(),
				entity.getEmail()
		);
		
		if (entity.getCarrera() != null)
			estudiante.setIdCarrera(entity.getCarrera().getIdCarrera());
		
		if (entity.getPlan() != null)
			estudiante.setIdPlan(entity.getPlan().getIdPlan());
		
		// campos adicionales
		
		return estudiante;
	}
	
	// =========================
	// DOMAIN -> ENTITY
	// =========================
	
	public static EstudianteEntity toEntity(Estudiante estudiante) {
		
		EstudianteEntity entity = new EstudianteEntity();
		
		entity.setIdEstudiante(estudiante.getIdEstudiante());
		entity.setApellido(estudiante.getApellido());
		entity.setNombres(estudiante.getNombres());
		entity.setDni(estudiante.getDni());
		entity.setFechaNacimiento(estudiante.getFechaNacimiento());
		entity.setEmail(estudiante.getEmail());
		entity.setActivo(estudiante.getActivo());
		
		return entity;
	}
}
