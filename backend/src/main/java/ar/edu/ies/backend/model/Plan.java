package ar.edu.ies.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "planes_estudio")
public class Plan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_plan")
	private Long idPlan;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_carrera", nullable = false)
	private Carrera carrera;
	
	@Column(name = "nombre_plan", length = 100, nullable = false)
	private String nombrePlan;
	
	@Column(name = "anio_inicio")
	private Integer anioInicio;
	
	@Column(name = "activo", nullable = false)
	private Boolean activo;
	
	// Getter & Setters
	public Long getIdPlan() { return idPlan; }
	public void setIdPlan(Long idPlan) { this.idPlan = idPlan; }
	
	public Carrera getCarrera() { return carrera; }
	public void setCarrera(Carrera carrera) { this.carrera = carrera; }
	
	public String getNombrePlan() { return nombrePlan; }
	public void setNombrePlan(String nombrePlan) { this.nombrePlan = nombrePlan; }
	
	public Integer getAnioInicio() { return anioInicio; }
	public void setAnioInicio(Integer anioInicio) { this.anioInicio = anioInicio; }
	
	public Boolean getActiva() { return activo; }
	public void setActivo(Boolean activo) { this.activo = activo; }
}
