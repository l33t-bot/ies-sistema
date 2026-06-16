package ar.edu.ies.backend.infrastructure.controller.dto.inscripcion;

import ar.edu.ies.backend.domain.inscripcion.TipoInscripcion;

public class InscripcionRequestDto {

	private Long idEstudiante;
	private Long idPeriodo;
	private TipoInscripcion tipoInscripcion;
	private Integer anioQueCursa;
	
	public InscripcionRequestDto() {
		
	}
	
	// =========================
	// GETTERS
	// =========================
	
	public Long getIdEstudiante() { return idEstudiante; }

    public Long getIdPeriodo() { return idPeriodo; }

    public TipoInscripcion getTipoInscripcion() { return tipoInscripcion; }

    public Integer getAnioQueCursa() { return anioQueCursa; }
    
    // =========================
    // SETTERS
    // =========================

    public void setIdEstudiante(Long idEstudiante) { this.idEstudiante = idEstudiante; }

    public void setIdPeriodo(Long idPeriodo) { this.idPeriodo = idPeriodo; }

    public void setTipoInscripcion(TipoInscripcion tipoInscripcion) { this.tipoInscripcion = tipoInscripcion; }

    public void setAnioQueCursa(Integer anioQueCursa) { this.anioQueCursa = anioQueCursa; }
}
