package ar.edu.ies.backend.dto;

public class CorrelatividadDto {

	private Long idCorrelatividad;
	private Long idMateriaPrincipal;
	private Long idMateriaRequisito;
	private String tipoCorrelativa; // "REGULAR", "APROBADA"
	private Boolean activo;
	
	// Para mostrar información adicional
	private String nombreMateriaPrincipal;
	private String nombreMateriaRequisito;
	
	// Getters & Setters
	public Long getIdCorrelatividad() { return idCorrelatividad; }
	public void setIdCorrelatividad(Long idCorrelatividad) { this.idCorrelatividad = idCorrelatividad; }
	
	public Long getIdMateriaPrincipal() { return idMateriaPrincipal; }
	public void setIdMateriaPrincipal(Long idMateriaPrincipal) { this.idMateriaPrincipal = idMateriaPrincipal; }
	
	public Long getIdMateriaRequisito() { return idMateriaRequisito; }
	public void setIdMateriaRequisito(Long idMateriaRequisito) { this.idMateriaRequisito = idMateriaRequisito; }
	
	public String getTipoCorrelativa() { return tipoCorrelativa; }
	public void setTipoCorrelativa(String tipoCorrelativa) { this.tipoCorrelativa = tipoCorrelativa; }
	
	public Boolean getActivo() { return activo; }
	public void setActivo(Boolean activo) { this.activo = activo; }
	
	public String getNombreMateriaPrincipal() { return nombreMateriaPrincipal; }
	public void setNombreMateriaPrincipal(String nombreMateriaPrincipal) { this.nombreMateriaPrincipal = nombreMateriaPrincipal; }
	
	public String getNombreMateriaRequisito() { return nombreMateriaRequisito; }
	public void setNombreMateriaRquisito(String nombreMateriaRequisito) { this.nombreMateriaRequisito = nombreMateriaRequisito; }
}
