package ar.edu.ies.backend.infrastructure.controller.dto.documentacionRequerida;

public class DocumentacionRequeridaRequestDto {

	private String nombreDocumento;
	private Boolean obligatorio;
	private Boolean aplicaInscripcionInicial;
	private Boolean aplicaReinscripcion;
	private String descripcion;
	
	// =========================
	// GETTERS
	// =========================
	
	public String getNombreDocumento() { return nombreDocumento; }
	
	public Boolean getObligatorio() { return obligatorio; }
	
	public Boolean getAplicaInscripcionInicial() { return aplicaInscripcionInicial; }
	
	public Boolean getAplicaReinscripcion() { return aplicaReinscripcion; }
	
	public String getDescripcion() { return descripcion; }

	
	// =========================
	// SETTERS
	// =========================
	
	public void setNombreDocumento(String nombreDocumento) { this.nombreDocumento = nombreDocumento; }

	public void setObligatorio(Boolean obligatorio) { this.obligatorio = obligatorio; }

	public void setAplicaInscripcionInicial(Boolean aplicaInscripcionInicial) {
		this.aplicaInscripcionInicial = aplicaInscripcionInicial;
	}

	public void setAplicaReinscripcion(Boolean aplicaReinscripcion) { this.aplicaReinscripcion = aplicaReinscripcion; }

	public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}
