package ar.edu.ies.backend.mapper;

import ar.edu.ies.backend.dto.CarreraDto;
import ar.edu.ies.backend.model.Carrera;

public class CarreraMapper {
	
	public static CarreraDto toDto(Carrera entity) {
		CarreraDto dto = new CarreraDto();
		dto.setId_carrera(entity.getIdCarrera());
		dto.setNombre(entity.getNombre());
		dto.setCodigo(entity.getCodigo());
		dto.setDescripcion(entity.getDescripcion());
		dto.setColorCarpeta(entity.getColorCarpeta());
		dto.setPromocionales(entity.getPromocionales());
		dto.setActiva(entity.getActiva());
		
		return dto;
	}
	
	public static Carrera toEntity(CarreraDto dto) {
		Carrera entity = new Carrera();
		entity.setIdCarrera(dto.getId_carrera());
		entity.setNombre(dto.getNombre());
		entity.setCodigo(dto.getCodigo());
		entity.setDescripcion(dto.getDescripcion());
		entity.setColorCarpeta(dto.getColorCarpeta());
		entity.setPromocionales(dto.getPromocionales());
		entity.setActiva(dto.getActiva());
		
		return entity;
	}
}
