package ar.edu.ies.backend.domain.documentacionEntregada;

import java.time.LocalDate;

import ar.edu.ies.backend.exception.ValidacionException;

public class DocumentacionEntregada {

	private Long idEntrega;
	private Long idInscripcion;
	private Long idDocumento;
	
	private Boolean entregado;
	private LocalDate fechaEntrega;
	private Boolean valido;
	private String observaciones; // ESTE CAMPO PODRÍA SER NULL, NO SE SI ES NECESARIO PARA LA CREACIÓN
	private String rutaArchivo; // NO SE SI ESTE TIPO DE ARCHIVO ESTÁ BIEN PARA EL CAMPO
	
	// =========================
	// CONSTRUCTOR
	// =========================

	public DocumentacionEntregada(
			
			Long idInscripcion, Long idDocumento,
			Boolean entregado, Boolean valido,
			String observaciones, String rutaArchivo
	) {
		validarInscripcion(idInscripcion);
		validarDocumento(idDocumento);
		validarEntregado(entregado);
		validarValido(valido);
		
		this.idInscripcion = idInscripcion;
		this.idDocumento = idDocumento;
		
		this.entregado = entregado;
		this.valido = valido;
		this.observaciones = observaciones;
		this.rutaArchivo = rutaArchivo;
	}
	
	// =========================
	// COMPORTAMIENTO
	// =========================
	
	public void marcarComoEntregado() {
		
		this.entregado = true;
		this.valido = false;
		this.fechaEntrega = LocalDate.now();
	}
	
	public void validarDocumento() { // validación de buena condición
		
		if (!this.entregado)
			throw new ValidacionException("No se puede validar un documento no entregado");
		
		this.valido = true;
	}
	
	public void rechazarDocumento(String observaciones) {
		
		if (!this.entregado)
			throw new ValidacionException("No se puede rechazar un documento no entregado");
		
		this.valido = false;
		this.observaciones = observaciones;
	}

	public void cambiarDocumentacion(Long idDocumento) {
		
		validarDocumento(idDocumento);
		
		this.idDocumento = idDocumento;
	}
	
	public void cambiarEntregado(Boolean entregado) {
		
		validarEntregado(entregado);
		
		this.entregado = entregado;
	}
	
	public void cambiarValido(Boolean valido) {
		
		validarValido(valido);
		
		this.valido = valido;
	}
	
	// =========================
	// SETTERS
	// =========================
	
	protected void setIdEntrega(Long idEntrega) { this.idEntrega = idEntrega; }
	
	// =========================
	// GETTERS
	// =========================
	
	public Long getIdEntrega() { return idEntrega; }
	
	public Long getIdInscripcion() { return idInscripcion; }
	
	public Long getIdDocumento() { return idDocumento; }
	
	public Boolean getEntregado() { return entregado; }
	
	public Boolean getValido() { return valido; }
	
	public String getObservaciones() { return observaciones; }
	
	public String getRutaArchivo() { return rutaArchivo; }
	
	public LocalDate getFechaEntrega() { return fechaEntrega; }
	
	// =========================
	// VALIDACIONES
	// =========================
	
	public void validarInscripcion(Long idInscripcion) {
		
		if (idInscripcion == null)
			throw new ValidacionException("La inscripción es obligatoria");
	}
	
	public void validarDocumento(Long idDocumento) { // validación de existencia
		
		if (idDocumento == null)
			throw new ValidacionException("El documento es obligatorio");
	}
	
	public void validarEntregado(Boolean entregado) {
		
		if (entregado == null)
			throw new ValidacionException("El estado 'entregado' es obligatorio");
	}
	
	public void validarValido(Boolean valido) {
		
		if (valido == null)
			throw new ValidacionException("El estado 'valido' es obligatorio");
	}
}
