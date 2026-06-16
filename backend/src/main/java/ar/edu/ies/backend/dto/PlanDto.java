package ar.edu.ies.backend.dto;

public class PlanDto {

	private Long idPlan;
	private Long idCarrera;
	private String nombrePlan;
	private Integer anioInicio;
	private Boolean activo;
	
	// Para mostrar datos adicionales (opcional)
	private String nombreCarrera; // nombre de la carrera a la que pertenece
	
	// Getters & Setters
	public Long getIdPlan() { return idPlan; }
	public void setIdPlan(Long idPlan) { this.idPlan = idPlan; }
	
	public Long getIdCarrera() { return idCarrera; }
	public void setIdCarrera(Long idCarrera) { this.idCarrera = idCarrera; }
	
	public String getNombrePlan() { return nombrePlan; }
	public void setNombrePlan(String nombrePlan) { this.nombrePlan = nombrePlan; }
	
	public Integer getAnioInicio() { return anioInicio; }
	public void setAnioInicio(Integer anioInicio) { this.anioInicio = anioInicio; }
	
	public Boolean getActivo() { return activo; }
	public void setActivo(Boolean activo) { this.activo = activo; }
	
	public String getNombreCarrera() { return nombreCarrera; }
	public void setNombreCarrera(String nombreCarrera) { this.nombreCarrera = nombreCarrera; }
}
