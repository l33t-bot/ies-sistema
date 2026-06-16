package ar.edu.ies.backend.domain.materia;

public class Materia {

	private Long idMateria;
	private Long idPlan;
	private String codigo;
	private String nombre;
	private Integer anioCarrera;
	private Boolean esPromocional;
	private Boolean activa;
	
	public Materia(Long idMateria, Long idPlan,
				   String codigo, String nombre,
				   Integer anioCarrera, Boolean esPromocional,
				   Boolean activa) {
		
		validarPlan(idPlan);
		validarNombre(nombre);
		validarAnioCarrera(anioCarrera);
		
		this.idMateria = idMateria;
		this.idPlan = idPlan;
		this.codigo = codigo;
		this.nombre = nombre;
		this.anioCarrera = anioCarrera;
		this.esPromocional = esPromocional != null
				? esPromocional
				: false;
		this.activa = activa != null
				? activa
				: true;
	}
	
	// =========================
    // COMPORTAMIENTO
    // =========================
	
	public void cambiarIdPlan(Long idPlan) {
		
		validarPlan(idPlan);
		this.idPlan = idPlan;
	}
	
	public void cambiarCodigo(String codigo) {
		
		this.codigo = codigo;
	}
	
	public void cambiarNombre(String nombre) {
		
		validarNombre(nombre);
		this.nombre = nombre;
	}
	
	public void cambiarAnioCarrera(Integer anioCarrera) {
		
		validarAnioCarrera(anioCarrera);
		this.anioCarrera = anioCarrera;
	}
	
	public void activar() {
		
		this.activa = true;
	}
	
	public void desactivar() {
		
		this.activa = false;
	}
	
	public void actualizarDatos(String codigo, String nombre,
								Integer anioCarrera, Boolean esPromocional,
								Boolean activa
	) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.anioCarrera = anioCarrera;
		this.esPromocional = esPromocional;
		this.activa = activa;
	}
	
	// =========================
    // GETTERS
    // =========================
	
	public Long getIdMateria() { return idMateria; }
	public Long getIdPlan() { return idPlan; }
	public String getCodigo() { return codigo; }
	public String getNombre() { return nombre; }
	public Integer getAnioCarrera() { return anioCarrera; }
	public Boolean getEsPromocional() { return esPromocional; }
	public Boolean getActiva() { return activa; }
	
	// =========================
    // VALIDACIONES PRIVADAS
    // =========================
	
	private void validarPlan(Long idPlan) {
		
		if(idPlan == null) throw new IllegalArgumentException("El Plan obligatorio");
	}
	
	private void validarNombre(String nombre) {
		if (nombre == null || nombre.trim().isEmpty()) {
			throw new IllegalArgumentException("El Nombre Obligatorio");
		}
	}
	
	private void validarAnioCarrera(Integer anioCarrera) {
		if (anioCarrera == null) {
			throw new IllegalArgumentException("El año de carrera es obligatorio");
		}
		
		if (anioCarrera < 1 || anioCarrera > 3) {
			throw new IllegalArgumentException("El año de carrera debe estar entre 1 y 3");
		}
	}
}
