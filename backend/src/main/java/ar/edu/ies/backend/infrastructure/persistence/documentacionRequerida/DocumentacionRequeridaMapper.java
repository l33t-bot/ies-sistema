package ar.edu.ies.backend.infrastructure.persistence.documentacionRequerida;

import ar.edu.ies.backend.domain.documentacionRequerida.DocumentacionRequerida;

public class DocumentacionRequeridaMapper {

	// =========================
	// DOMAIN -> ENTITY
	// =========================
	
	public static DocumentacionRequeridaEntity toEntity(DocumentacionRequerida domain) {
		
		DocumentacionRequeridaEntity entity = new DocumentacionRequeridaEntity();
				
		entity.setIdDocumento(domain.getIdDocumento());
		entity.setNombreDocumento(domain.getNombreDocumento());
		entity.setObligatorio(domain.getObligatorio());
		entity.setAplicaInscripcion(domain.getAplicaInscripcion());
		entity.setAplicaReinscripcion(domain.getAplicaReinscripcion());
		entity.setDescripcion(domain.getDescripcion());
		
		return entity;
	}
	
	// =========================
    // ENTITY → DOMAIN
    // =========================
	
	public static DocumentacionRequerida toDomain(DocumentacionRequeridaEntity entity) {
		
		DocumentacionRequerida domain = new DocumentacionRequerida(
				
				entity.getIdDocumento(),
				entity.getNombreDocumento(),
				entity.getObligatorio(),
				entity.getAplicaInscripcion(),
				entity.getAplicaReinscripcion()
		);
		
		if (entity.getDescripcion() != null)
			domain.cambiarDescripcion(entity.getDescripcion());
		
		return domain;
	}
}
