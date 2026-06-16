package ar.edu.ies.backend.infrastructure.controller.dto.PreinscripcionDto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import ar.edu.ies.backend.domain.preinscripcion.Preinscripcion;

public class PreinscripcionResponseDto {

	private Long idPreinscripcion;
	private Long idCarrera;
	private String apellido;
	private String nombres;
	private String dni;
	private Integer edad;
	private LocalDate fechaNacimiento;
	private String email;
	private String estado;
	private LocalDateTime fechaRegistro;
	
	private String nombreCarrera;
	
	public PreinscripcionResponseDto(Preinscripcion preinscripcion) {
		
		this.idPreinscripcion = preinscripcion.getIdPreinscripcion();
		this.idCarrera = preinscripcion.getIdCarrera();
		this.apellido = preinscripcion.getApellido();
		this.nombres = preinscripcion.getNombres();
		this.dni = preinscripcion.getDni();
		this.edad = preinscripcion.getEdad();
		this.fechaNacimiento = preinscripcion.getFechaNacimiento();
		this.email = preinscripcion.getEmail();
		this.estado = preinscripcion.getEstado().name();
		this.fechaRegistro = preinscripcion.getFechaRegistro();
	}
	
	// =========================
    // GETTERS
    // =========================

	public Long getIdPreinscripcion() { return idPreinscripcion; }
	
	public Long getIdCarrera() { return idCarrera; }
	
	public String getApellido() { return apellido; }
	
	public String getNombres() { return nombres; }
	
	public String getDni() { return dni; }
	
	public Integer getEdad() { return edad; }
	
	public LocalDate getFechaNacimiento() { return fechaNacimiento; }
	
	public String getEmail() { return email; }
	
	public String getEstado() { return estado; }
	
	public LocalDateTime getFechaRegistro() { return fechaRegistro; }
	
	public String getNombreCarrera() { return nombreCarrera; }
	
	// =========================
    // SETTERS
    // =========================
	
	public void setIdPreinscripcion(Long idPreinscripcion) { this.idPreinscripcion = idPreinscripcion; }
	
	public void setIdCarrera(Long idCarrera) { this.idCarrera = idCarrera; }
	
	public void setApellido(String apellido) { this.apellido = apellido; }
	
	public void setNombres(String nombres) { this.nombres = nombres; }
	
	public void setDni(String dni) { this.dni = dni; }
	
	public void setEdad(Integer edad) { this.edad = edad; }
	
	public void setFechaNacimiento(LocalDate fecha) { this.fechaNacimiento = fecha; }
	
	public void setEmail(String email) { this.email = email; }
	
	public void setEstado(String estado) { this.estado = estado; }
	
	public void setFechaRegistro(LocalDateTime fecha) { this.fechaRegistro = fecha; }
	
	public void setNombreCarrera(String nombreCarrera) { this.nombreCarrera = nombreCarrera; }
}
