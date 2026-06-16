package ar.edu.ies.backend.infrastructure.persistence.documentacionEntregada;

import ar.edu.ies.backend.domain.documentacionEntregada.DocumentacionEntregada;
import ar.edu.ies.backend.domain.inscripcion.Inscripcion;
import ar.edu.ies.backend.infrastructure.controller.dto.documentacionEntregada.*;

public class DocumentacionEntregadaMapper {

	// =========================
	// DOMAIN -> ENTITY
	// =========================

	public static DocumentacionEntregadaEntity toEntity(DocumentacionEntregada doc) {
		
		DocumentacionEntregadaEntity entity = new DocumentacionEntregadaEntity();
		
		entity.setIdEntrega(doc.getIdEntrega());
		
		Inscripcion inscripcion = new Inscripcion();
		inscripcion.setIdInscripcion(doc.getIdInscripcion());
		entity.setInscripcion(inscripcion);
		
		Documento documento = new Documento();
		documento.asignarId(doc.getIdDocumento());
		entity.setDocumento(documento);
		
		entity.setEntregado(doc.getEntregado());
		entity.setValido(doc.getValido());
		entity.setObservaciones(doc.getObservaciones());
		entity.setRutaArchivo(doc.getRutaArchivo());
		
		return entity;
	}
	
	// =========================
    // ENTITY → DOMAIN
    // =========================
	
	public static DocumentacionEntregada toDomain(DocumentacionEntregadaEntity entity) {
		
		DocumentacionEntregada doc = new DocumentacionEntregada(
				entity.getInscripcion().getIdInscripcion(),
				entity.getDocumento().getIdDocumento(),
				entity.getEntregado(),
				entity.getValido(),
				entity.getObservaciones(),
				entity.getRutaArchivo()
		);
		
		doc.setIdEntrega(entity.getIdEntrega());
		
		return doc;
	}
}
