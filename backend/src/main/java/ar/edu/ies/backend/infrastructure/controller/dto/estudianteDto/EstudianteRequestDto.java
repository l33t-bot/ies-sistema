package ar.edu.ies.backend.infrastructure.controller.dto.estudianteDto;

public class EstudianteRequestDto {	// entrada del serv

	private Long idUsuario;

	private String apellido;
	private String nombres;
	private String dni;
	private String email;
	private String fechaNacimiento;

	// opcionales
	private String nacionalidad;
	private String domicilio;
	private String localidad;
	private String telefono;

	private Long idCarrera;
	private Long idPlan;
	
	// =========================
    // GETTERS
    // =========================
	
	public Long getIdUsuario() {
		return idUsuario;
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
	public Long getIdCarrera() {
		return idCarrera;
	}
	public Long getIdPlan() {
		return idPlan;
	}
	
	// =========================
    // SETTERS
    // =========================
	
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
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
	public void setIdCarrera(Long idCarrera) {
		this.idCarrera = idCarrera;
	}
	public void setIdPlan(Long idPlan) {
		this.idPlan = idPlan;
	}
}
