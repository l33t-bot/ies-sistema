package ar.edu.ies.backend.infrastructure.controller.dto.correlatividadDto;

import ar.edu.ies.backend.domain.correlatividad.TipoCorrelativa;

public class CorrelatividadRequestDto {

	private Long idCorrelatividad;
	private Long idMateriaPrincipal;
	private Long idMateriaRequisito;
	private TipoCorrelativa tipoCorrelativa;
	private Boolean activo;
	
	private String nombreMateriaPrincipal;
	private String nombreMateriaRequisito;
	
	// =========================
    // GETTERS
    // =========================
	
	public Long getIdCorrelatividad() { return idCorrelatividad; }
	
	public Long getIdMateriaPrincipal() { return idMateriaPrincipal; }
	
	public Long getIdMateriaRequisito() { return idMateriaRequisito; }
	
	public TipoCorrelativa getTipoCorrelativa() { return tipoCorrelativa; }
	
	public Boolean getActivo() { return activo; }
	
	public String getNombreMateriaPrincipal() { return nombreMateriaPrincipal; }
	
	public String getNombreMateriaRequisito() { return nombreMateriaRequisito; }
	
	// =========================
    // SETTERS
    // =========================
	
	public void setIdCorrelatividad(Long idCorrelatividad) { this.idCorrelatividad = idCorrelatividad; }
	
	public void setIdMateriaPrincipal(Long idMateriaPrincipal) { this.idMateriaPrincipal = idMateriaPrincipal; }
	
	public void setIdMateriaRequisito(Long idMateriaRequisito) { this.idMateriaRequisito = idMateriaRequisito; }
	
	public void setTipoCorrelativa(TipoCorrelativa tipoCorrelativa) { this.tipoCorrelativa = tipoCorrelativa; }
	
	public void setActivo(Boolean activo) { this.activo = activo; }
	
	public void setNombreMateriaPrincipal(String materia) { this.nombreMateriaPrincipal = materia; }
	
	public void setNombreMateriaRequisito(String materia) { this.nombreMateriaRequisito = materia; }
}
