package ar.edu.ies.backend.infrastructure.controller.dto;

public class MateriaRequestDto {

	private Long idPlan;
	private String codigo;
	private String nombre;
	private Integer anioCarrera;
	private Boolean esPromocional;
	private Boolean activa;
	
	public Long getIdPlan() { return idPlan; }
	public void setIdPlan(Long idPlan) { this.idPlan = idPlan; }
	
	public String getCodigo() {	return codigo; }
	public void setCodigo(String codigo) { this.codigo = codigo; }
	
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	
	public Integer getAnioCarrera() { return anioCarrera; }
	public void setAnioCarrera(Integer anioCarrera) { this.anioCarrera = anioCarrera; }
	
	public Boolean getEsPromocional() { return esPromocional; }
	public void setEsPromocional(Boolean esPromocional) { this.esPromocional = esPromocional; }
	
	public Boolean getActiva() { return activa; }
	public void setActiva(Boolean avtiva) { this.activa = avtiva; }
	
	
}
