package ar.edu.ies.backend.infrastructure.persistence.converter;

import ar.edu.ies.backend.domain.preinscripcion.EstadoPreinscripcion;
import jakarta.persistence.AttributeConverter;

public class EstadoPreinscripcionConverter implements AttributeConverter<EstadoPreinscripcion, String>{

	@Override
	public String convertToDatabaseColumn(EstadoPreinscripcion estado) {
		return estado != null
				? estado.name().toLowerCase()
				: null;
	}
	
	@Override
	public EstadoPreinscripcion convertToEntityAttribute(String dbData) {
		return dbData != null
				? EstadoPreinscripcion.valueOf(dbData.toUpperCase())
				: null;
	}
}
