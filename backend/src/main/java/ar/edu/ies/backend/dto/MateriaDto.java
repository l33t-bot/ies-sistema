package ar.edu.ies.backend.dto;

public class MateriaDto {

	private Long idMateria;
	private Long idPlan;
	private String codigo;
	private String nombre;
	private Integer anioCarrera;
	
	private Boolean esPromocional;
	private Boolean activa;
	
	// Para mostrar datos adicionales (opcional)
	private String nombrePlan; // nombre del plan al que pertenece
	
	// Getters & Setters
	public Long getIdMateria() { return idMateria; }
	public void setIdMateria(Long idMateria) { this.idMateria = idMateria; }
	
	public Long getIdPlan() { return idPlan; }
	public void setIdPlan(Long idPlan) { this.idPlan = idPlan; }
	
	public String getCodigo() { return codigo; }
	public void setCodigo(String codigo) { this.codigo = codigo; }
	
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	
	public Integer getAnioCarrera() { return anioCarrera; }
	public void setAnioCarrera(Integer anioCarrera) { this.anioCarrera = anioCarrera; }
	
	public Boolean getEsPromocional() { return esPromocional; }
	public void setEsPromocional(Boolean esPromocional) { this.esPromocional = esPromocional; }
	
	public Boolean getActiva() { return activa; }
	public void setActiva(Boolean activa) { this.activa = activa; }
	
	public String getNombrePlan() { return nombrePlan; }
	public void setNombrePlan(String nombrePlan) { this.nombrePlan = nombrePlan; }
}
