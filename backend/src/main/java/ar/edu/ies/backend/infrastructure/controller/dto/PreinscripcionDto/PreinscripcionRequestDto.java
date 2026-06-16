package ar.edu.ies.backend.infrastructure.controller.dto.PreinscripcionDto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import ar.edu.ies.backend.domain.preinscripcion.EstadoPreinscripcion;

public class PreinscripcionRequestDto {

	private Long idPreinscripcion;
	private Long idCarrera;
	private String apellido;
	private String nombres;
	private String dni;
	private Integer edad;
	private LocalDate fechaNacimiento;
	private String email;
	
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
}
