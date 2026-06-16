package ar.edu.ies.backend.infrastructure.controller.dto.documentacionEntregada;

public class DocumentacionEntregadaRequestDto {

	private Long idInscripcion;
	private Long idDocumento;
	private String observaciones;
	private String rutaArchivo;
	
	// =========================
    // GETTERS
    // =========================
	
	public Long getIdInscripcion() { return idInscripcion; }
	
	public Long getIdDocumento() { return idDocumento; }
	
	public String getObsercaciones() { return observaciones; }
	
	public String getRutaArchivo() { return rutaArchivo; }
	
	// =========================
    // SETTERS
    // =========================
	
	public void setIdInscripcion(Long idInscripcion) { this.idInscripcion = idInscripcion; }
	
	public void setIdDocumento(Long idDocumento) { this.idDocumento = idDocumento; }
	
	public void serObservaciones(String observaciones) { this.observaciones = observaciones; }
	
	public void setRutaArchivo(String rutaArchivo) { this.rutaArchivo = rutaArchivo; }
}
