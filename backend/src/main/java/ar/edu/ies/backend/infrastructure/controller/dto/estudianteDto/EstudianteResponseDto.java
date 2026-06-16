package ar.edu.ies.backend.infrastructure.controller.dto.estudianteDto;

public class EstudianteResponseDto { // salida del serv

	private Long idEstudiante;

	private String apellido;
	private String nombres;
	private String dni;
	private String email;
	private String fechaNacimiento;

	private String nacionalidad;
	private String domicilio;
	private String localidad;
	private String telefono;

	private String numeroLibreta;
	private String grupoSanguineo;

	private Long idCarrera;
	private Long idPlan;
	
	private String nombreCarrera;
	private String nombrePlan;

	public Boolean activo;
	
	// =========================
	// CONSTRUCTUR PARA CREAR
	// =========================
	
	/**
	 * public EstudianteResponseDto(Long idUsuario, String apellido,
			String nombres, String dni,
			String frchaNacimiento, String email
	) {
		this.idUsuario = idUsuario;
	}
	**/

	// =========================
	// SETTERS
	// =========================
	
	public void setIdEstudiante(Long idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setNumeroLibreta(String numeroLibreta) {
		this.numeroLibreta = numeroLibreta;
	}

	public void setGrupoSanguineo(String grupoSanguineo) {
		this.grupoSanguineo = grupoSanguineo;
	}

	public void setIdCarrera(Long idCarrera) {
		this.idCarrera = idCarrera;
	}

	public void setIdPlan(Long idPlan) {
		this.idPlan = idPlan;
	}

	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}

	public void setNombrePlan(String nombrePlan) {
		this.nombrePlan = nombrePlan;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	// =========================
	// GETTERS
	// =========================
	
	public Long getIdEstudiante() {
		return idEstudiante;
	}

	public String getApellido() {
		return apellido;
	}

	public String getNombres() {
		return nombres;
	}

	public String getDni() {
		return dni;
	}

	public String getEmail() {
		return email;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public String getLocalidad() {
		return localidad;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getNumeroLibreta() {
		return numeroLibreta;
	}

	public String getGrupoSanguineo() {
		return grupoSanguineo;
	}

	public Long getIdCarrera() {
		return idCarrera;
	}

	public Long getIdPlan() {
		return idPlan;
	}

	public String getNombreCarrera() {
		return nombreCarrera;
	}

	public String getNombrePlan() {
		return nombrePlan;
	}

	public Boolean getActivo() {
		return activo;
	}
}
