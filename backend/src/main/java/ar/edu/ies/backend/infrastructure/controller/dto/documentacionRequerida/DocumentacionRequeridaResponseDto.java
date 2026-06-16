package ar.edu.ies.backend.infrastructure.controller.dto.documentacionRequerida;

public class DocumentacionRequeridaResponseDto {

	private Long idDocumento;
	private String nombreDocumento;
	private Boolean obligatorio;
	private Boolean aplicaInscripcionInicial;
	private Boolean aplicaReinscripcion;
	private String descripcion;
		
	// =========================
	// CONSTRUCTOR
	// =========================
	
	public DocumentacionRequeridaResponseDto(
			Long idDocumento, String nombreDocumento, Boolean obligatorio,
			Boolean aplicaInscripcionInicial, Boolean aplicaReinscripcion,
			String descripcion
	){
		this.idDocumento = idDocumento;
		this.nombreDocumento = nombreDocumento;
		this.obligatorio = obligatorio;
		this.aplicaInscripcionInicial = aplicaInscripcionInicial;
		this.aplicaReinscripcion = aplicaReinscripcion;
		this.descripcion = descripcion;
	}
	
	// =========================
	// GETTERS
	// =========================
	
	public Long getIdDocumento() {
		return idDocumento;
	}

	public String getNombreDocumento() {
		return nombreDocumento;
	}

	public Boolean getObligatorio() {
		return obligatorio;
	}

	public Boolean getAplicaInscripcionInicial() {
		return aplicaInscripcionInicial;
	}

	public Boolean getAplicaReinscripcion() {
		return aplicaReinscripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}
}
