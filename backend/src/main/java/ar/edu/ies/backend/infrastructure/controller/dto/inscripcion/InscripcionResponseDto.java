package ar.edu.ies.backend.infrastructure.controller.dto.inscripcion;

import java.time.LocalDateTime;

import ar.edu.ies.backend.domain.inscripcion.EstadoInscripcion;
import ar.edu.ies.backend.domain.inscripcion.TipoInscripcion;

public class InscripcionResponseDto {

	private Long idInscripcion;
	private Long idEstudiante;
	private Long idPeriodo;
	
	private TipoInscripcion tipoInscripcion;
	private LocalDateTime fechaInscripcionOnline;
	private LocalDateTime fechaEntregaDocumentos;
	private EstadoInscripcion estadoInscripcion;
	private Integer anioQueCursa;
	private String numeroInscripcion;
	private String observaciones;
	
	private String nombresEstudiante;
	private String apellidoEstudiante;
	private String nombrePeriodo;
	
	public InscripcionResponseDto() {
		
	}
	
    // =========================
    // GETTERS
    // =========================

    public Long getIdInscripcion() {
        return idInscripcion;
    }

    public Long getIdEstudiante() {
        return idEstudiante;
    }

    public Long getIdPeriodo() {
        return idPeriodo;
    }

    public TipoInscripcion getTipoInscripcion() {
        return tipoInscripcion;
    }

    public LocalDateTime getFechaInscripcionOnline() {
        return fechaInscripcionOnline;
    }

    public LocalDateTime getFechaEntregaDocumentos() {
        return fechaEntregaDocumentos;
    }

    public EstadoInscripcion getEstadoInscripcion() {
        return estadoInscripcion;
    }

    public Integer getAnioQueCursa() {
        return anioQueCursa;
    }

    public String getNumeroInscripcion() {
        return numeroInscripcion;
    }

    public String getObservaciones() {
        return observaciones;
    }
    
    public String getNombresEstudiante() { return this.nombresEstudiante; }
    
    public String getApellidoEstudiante() { return this.apellidoEstudiante; }
    
    public String getNombrePeriodo() { return this.nombrePeriodo; }

    // =========================
    // SETTERS
    // =========================

    public void setIdInscripcion(Long idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public void setIdEstudiante(Long idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public void setIdPeriodo(Long idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public void setTipoInscripcion(TipoInscripcion tipoInscripcion) {
        this.tipoInscripcion = tipoInscripcion;
    }

    public void setFechaInscripcionOnline(LocalDateTime fechaInscripcionOnline) {
        this.fechaInscripcionOnline = fechaInscripcionOnline;
    }

    public void setFechaEntregaDocumentos(LocalDateTime fechaEntregaDocumentos) {
        this.fechaEntregaDocumentos = fechaEntregaDocumentos;
    }

    public void setEstadoInscripcion(EstadoInscripcion estadoInscripcion) {
        this.estadoInscripcion = estadoInscripcion;
    }

    public void setAnioQueCursa(Integer anioQueCursa) {
        this.anioQueCursa = anioQueCursa;
    }

    public void setNumeroInscripcion(String numeroInscripcion) {
        this.numeroInscripcion = numeroInscripcion;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    public void setNombresEstudiante(String nombresEstudiante) { this.nombresEstudiante = nombresEstudiante; }
    
    public void setApellidoEstudiante(String apellidoEstudiante) { this.apellidoEstudiante = apellidoEstudiante; }
    
    public void setNombrePeriodo(String nombrePeriodo) { this.nombrePeriodo = nombrePeriodo; }
}
