package ar.edu.ies.backend.infrastructure.persistence.materia;

import jakarta.persistence.*;

@Entity
@Table(name = "materias")
public class MateriaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_materia")
	private Long idMateria;
	
	// Relación con FK
	@Column(name = "id_plan", nullable = false)
	private Long idPlan;
	
	@Column(name = "codigo", length = 50)
	private String codigo;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column(name = "anio_carrera", nullable = false)
	private Integer anioCarrera;
		
	@Column(name = "es_promocional", nullable = false)
	private Boolean esPromocional;
	
	@Column(name = "activa", nullable = false)
	private Boolean activa;
	
	protected MateriaEntity() {
		// Constructor vació requerido por JPA
	}
	
	// =========================
    // GETTERS Y SETTERS
    // =========================
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
		
		public Boolean getEsPromocional () { return esPromocional; }
		public void setEsPromocional(Boolean esPromocional) { this.esPromocional = esPromocional; }
		
		public Boolean getActiva() { return activa; }
		public void setActiva(Boolean activa) { this.activa = activa; }
}
