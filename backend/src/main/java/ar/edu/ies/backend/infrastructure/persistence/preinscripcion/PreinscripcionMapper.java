package ar.edu.ies.backend.infrastructure.persistence.preinscripcion;

import ar.edu.ies.backend.domain.preinscripcion.Preinscripcion;
import ar.edu.ies.backend.model.Carrera;

public class PreinscripcionMapper {

	// =========================
	// ENTITY -> DOMAIN
	// =========================
	
	private PreinscripcionMapper() {
		
	}
	
	public static Preinscripcion toDomain(PreinscripcionEntity entity) {
		
		if (entity == null) return null;
		
		if (entity.getCarrera() == null)
			throw new IllegalStateException("La preinscrición no tiene carrera asociada");
		
		return new Preinscripcion(
				entity.getIdPreinscripcion(),
				entity.getCarrera().getIdCarrera(),
				entity.getApellido(),
				entity.getNombres(),
				entity.getDni(),
				entity.getFechaNacimiento(),
				entity.getEdad(),
				entity.getEmail(),
				entity.getEstado(),
				entity.getFechaRegistro()
		);
	}
	
	// =========================
	// DOMAIN -> ENTITY
	// =========================
	
	public static PreinscripcionEntity toEntity(Preinscripcion domain) {
		
		if (domain == null) return null;
		
		PreinscripcionEntity entity = new PreinscripcionEntity();
		
		entity.setIdPreinscripcion(domain.getIdPreinscripcion());
		
		// seteo solo el id de carrera
		if (domain.getIdCarrera() != null) {
			Carrera carrera = new Carrera();
			carrera.setIdCarrera(domain.getIdCarrera());
			entity.setCarrera(carrera);
		}
		
		entity.setApellido(domain.getApellido());
		entity.setNombres(domain.getNombres());
		entity.setDni(domain.getDni());
		
		entity.setFechaNacimiento(domain.getFechaNacimiento());
		
		entity.setEdad(domain.getEdad());
		entity.setEmail(domain.getEmail());
		
		entity.setEstado(domain.getEstado());
		
		// fechaRegistro
		// si llega null la maneja @PrePersist
		if (domain.getFechaRegistro() != null)
			entity.setFechaRegistro(domain.getFechaRegistro());
		
		return entity;
	}
	
	
	public static void updateEntity(Preinscripcion domain, PreinscripcionEntity entity) {
		
		entity.setApellido(domain.getApellido());
		entity.setNombres(domain.getNombres());
		entity.setDni(domain.getDni());
		entity.setEdad(domain.getEdad());
		entity.setEmail(domain.getEmail());
		
		entity.setFechaNacimiento(domain.getFechaNacimiento());
		
		entity.setEstado(domain.getEstado());
		
		if (domain.getIdCarrera() != null) {
			Carrera carrera = new Carrera();
			carrera.setIdCarrera(domain.getIdCarrera());
			entity.setCarrera(carrera);
		}
	}
}
