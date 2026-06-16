package ar.edu.ies.backend.infrastructure.controller.dto.documentacionEntregada;

import java.time.LocalDate;

public class DocumentacionEntregadaResponseDto {

	private Long idEntrega;
	private Long idInscripcion;
	private Long idDocumento;
	private Boolean entregado;
	private LocalDate fechaEntrega;
	private Boolean valido;
	private String observaciones;
	private String rutaArchivo;
	
	private String nombreDocumento;
	
	// =========================
    // CONSTRUCTOR
    // =========================
	
	public DocumentacionEntregadaResponseDto(
			Long idEntrega, Long idInscripcion,
			Long idDocumento, Boolean entregado,
			LocalDate fechaEntrega, Boolean valido,
			String observaciones, String rutaArchivo
	) {
		
		this.idEntrega = idEntrega;
		this.idInscripcion = idInscripcion;
		this.idDocumento = idDocumento;
		this.entregado = entregado;
		this.fechaEntrega = fechaEntrega;
		this.valido = valido;
		this.observaciones = observaciones;
		this.rutaArchivo = rutaArchivo;
	}
	
	// =========================
    // GETTERS
    // =========================
	
	public Long getIdEntrega() { return idEntrega; }
	
	public Long getIdInscripcion() { return idInscripcion; }
	
	public Long getIdDocumento() { return idDocumento; }
	
	public Boolean getEntregado() {	return entregado; }
	
	public LocalDate getFechaEntrega() { return fechaEntrega; }
	
	public Boolean getValido() { return valido;	}
	
	public String getObservaciones() { return observaciones; }
	
	public String getRutaArchivo() { return rutaArchivo; }
	
	public String getNombreDocumento() { return nombreDocumento; }
}
