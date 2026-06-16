package ar.edu.ies.backend.domain.estudiante;

import java.time.LocalDate;

public class Estudiante {

	private Long idEstudiante;
	private Long idUsuario;
	
	// DATOS PERSONALES
	private String apellido;
	private String nombres;
	private String dni;
	private LocalDate fechaNacimiento;
	private String email;
	private String nacionalidad;
	
	// CONTACTO
	private String domicilio;
	private String localidad;
	private String telefono;
	
	private String numeroLibreta;
	private String grupoSanguineo;
	private Long idCarrera;
	private Long idPlan;
	private Boolean activo;
	
	// =========================
	// CONSTRUCTOR
	// =========================

	public Estudiante(
			Long idUsuario, String apellido,
			String nombres, String dni,
			LocalDate fechaNacimiento, String email
	) {
		validarUsuario(idUsuario);
		validarApellido(apellido);
		validarNombres(nombres);
		validarDni(dni);
		validarFechaNacimiento(fechaNacimiento);
		validarEmail(email);
		
		this.idUsuario = idUsuario;
		this.apellido = apellido;
		this.nombres = nombres;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.email = email;
		this.activo = true;
	}
	
	// =========================
	// COMPORTAMIENTO
	// =========================

	public void cambiarApellido(String apellido) {
		
		validarApellido(apellido);
		this.apellido = apellido;
	}
	
	public void cambiarNombres(String nombres) {
		
		validarNombres(nombres);
		this.nombres = nombres;
	}
	
	public void cambiarDni(String dni) {
		
		validarDni(dni);
		this.dni = dni;
	}
	
	public void cambiarFechaNacimiento(LocalDate fecha) {
		
		validarFechaNacimiento(fecha);
		this.fechaNacimiento = fecha;
	}
	
	public void cambiarEmail(String email) {
		
		validarEmail(email);
		this.email = email;
	}
	
	public void desactivar() {
		
		this.activo = false;
	}
	
	// =========================
	// GETTERS
	// =========================
	
	public Long getIdEstudiante() { return idEstudiante; }
	
	public Long getIdUsuario() { return idUsuario; }
	
	public String getApellido() { return apellido; }
	
	public String getNombres() { return nombres; }
	
	public String getDni () { return dni; }
	
	public LocalDate getFechaNacimiento() { return fechaNacimiento; }
	
	public String getEmail() { return email; }
	
	public Long getIdCarrera() { return idCarrera; }
	
	public Long getIdPlan() { return idPlan; }
	
	public Boolean getActivo() { return activo; }
	
	// =========================
	// SETTERS
	// =========================
	
	public void setIdCarrera(Long idCarrera) { this.idCarrera = idCarrera; }
	
	public void setIdPlan(Long idPlan) { this.idPlan = idPlan; }
	
	// =========================
	// VALIDACIONES
	// =========================
	
	private void validarUsuario(Long idUsuario) {
		
		if (idUsuario == null)
			throw new IllegalArgumentException("El usuario es obligatorio");
	}

	private void validarApellido(String apellido) {
		
		if (apellido == null || apellido.trim().isEmpty())
			throw new IllegalArgumentException("El apellido es obligatorio");
	}
	
	public void validarNombres(String nombres) {
		
		if (nombres == null || nombres.trim().isEmpty())
			throw new IllegalArgumentException("Los nombres son obligatorio");
	}
	
	public void validarDni(String dni) {
		
		if (dni == null || dni.trim().isEmpty())
			throw new IllegalArgumentException("El DNI es obligatorio");
	}
	
	public void validarFechaNacimiento(LocalDate fecha) {
		
		if (fecha == null)
			throw new IllegalArgumentException("Fecha de nacimiento obligatoria");
	}
	
	public void validarEmail(String email) {
		
		if (email == null || !email.contains("@"))
			throw new IllegalArgumentException("Email inválido");
	}
}
