package ar.edu.ies.backend.domain.documentacionRequerida;

import ar.edu.ies.backend.exception.ValidacionException;

public class DocumentacionRequerida {

	private Long idDocumento;
	private String nombreDocumento;
	private Boolean obligatorio;
	private Boolean aplicaInscripcion;
	private Boolean aplicaReinscripcion;
	private String descripcion;
	
	// =========================
	// CONSTRUCTORES
	// =========================
	
	public DocumentacionRequerida(
			
			String nombreDocumento, Boolean obligatorio,
			Boolean aplicaInscripcion, Boolean aplicaReinscripcion
	) {
		
		validarNombreDocumento(nombreDocumento);
		validarObligatorio(obligatorio);
		validarAplicaInscripcion(aplicaInscripcion);
		validarAplicaReinscripcion(aplicaReinscripcion);
		
		
		this.nombreDocumento = nombreDocumento;
		this.obligatorio = obligatorio;
		this.aplicaInscripcion = aplicaInscripcion;
		this.aplicaReinscripcion = aplicaReinscripcion;
		
		validarAplicaAlgunaInscripcion();
	}
	
	// constructor para mapper
	
	public DocumentacionRequerida(
			Long idDocumento,
			String nombreDocumento, Boolean obligatorio,
			Boolean aplicaInscripcion, Boolean aplicaReinscripcion
	) {
		
		validarIdDocumento(idDocumento);
		validarNombreDocumento(nombreDocumento);
		validarObligatorio(obligatorio);
		validarAplicaInscripcion(aplicaInscripcion);
		validarAplicaReinscripcion(aplicaReinscripcion);
		
		this.idDocumento = idDocumento;
		this.nombreDocumento = nombreDocumento;
		this.obligatorio = obligatorio;
		this.aplicaInscripcion = aplicaInscripcion;
		this.aplicaReinscripcion = aplicaReinscripcion;
		
		validarAplicaAlgunaInscripcion();
	}
	
	// =========================
	// COMPORTAMIENTO
	// =========================

	public void cambiarNombreDocumento(String nombreDocumento) {
		
		validarNombreDocumento(nombreDocumento);
		
		this.nombreDocumento = nombreDocumento;
	}
	
	public void cambiarObligatorio(Boolean obligatorio) {
		
		validarObligatorio(obligatorio);
		
		this.obligatorio = obligatorio;
	}
	
	public void cambiarAplicaReinscripcion(Boolean aplicaReinscripcion) {
		
		validarAplicaReinscripcion(aplicaReinscripcion);
		
		this.aplicaReinscripcion = aplicaReinscripcion;
	}
	
	public void cambiarAplicaInscripcion(Boolean aplicaInscripcion) {
		
		validarAplicaInscripcion(aplicaInscripcion);
		
		this.aplicaInscripcion = aplicaInscripcion;
	}
	
	public void cambiarDescripcion(String descripcion) {
		
		this.descripcion = descripcion;
	}
	
	// =========================
	// SETTERS(para persistencia)
	// =========================
	
	public void asignarId(Long idDocumento) {
		
		validarIdDocumento(idDocumento);
		
		this.idDocumento = idDocumento;
	}

	// =========================
	// GETTERS
	// =========================
	
	public Long getIdDocumento() { return idDocumento; }

	public String getNombreDocumento() { return nombreDocumento; }

	public Boolean getObligatorio() { return obligatorio; }

	public Boolean getAplicaInscripcion() { return aplicaInscripcion;	}

	public Boolean getAplicaReinscripcion() { return aplicaReinscripcion; }

	public String getDescripcion() { return descripcion; }
	
	// =========================
	// VALIDACIONES
	// =========================
	
	private void validarIdDocumento(Long idDocumento) {
		if (idDocumento != null)
			throw new ValidacionException("El ID del documento es obligatorio");
	}
	
	private void validarNombreDocumento(String nombreDocumento) {
		if (nombreDocumento == null || nombreDocumento.trim().isEmpty())
			throw new ValidacionException("El nombre del documento es obligatorio");
	}
	
	private void validarObligatorio(Boolean obligatorio) {
		if (obligatorio == null)
			throw new ValidacionException("El estado 'obligaotrio' es obligatorio");
	}
	
	private void validarAplicaInscripcion(Boolean aplicaInscripcion) {
		if (aplicaInscripcion == null)
			throw new ValidacionException("El estado 'aplicaInscripcionInicial' es obligatorio");
	}
	
	private void validarAplicaReinscripcion(Boolean aplicaReinscripcion) {
		if (aplicaReinscripcion == null)
			throw new ValidacionException("El estado 'aplicaReinscripcion' es obligatorio");
	}
	
	public boolean aplicaParaInscripcion(Boolean esReinscripcion) {
		
		return esReinscripcion ? aplicaReinscripcion : aplicaInscripcion;
	}
	
	private void validarAplicaAlgunaInscripcion() {
		
		if (!this.aplicaInscripcion && !this.aplicaReinscripcion)
			throw new ValidacionException("El documento debe aplicar a inscripcion o reinscripcion");
	}
	
	public boolean aplicaPara(Boolean esReinscripcion) {
		
		return esReinscripcion
				? this.aplicaReinscripcion
				: this.aplicaInscripcion;
	}
}
