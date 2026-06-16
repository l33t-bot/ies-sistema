package ar.edu.ies.backend.infrastructure.persistence.preinscripcion;

import java.time.LocalDate;
import java.time.LocalDateTime;

import ar.edu.ies.backend.domain.preinscripcion.EstadoPreinscripcion;
import ar.edu.ies.backend.infrastructure.persistence.converter.EstadoPreinscripcionConverter;
import ar.edu.ies.backend.model.Carrera;
import jakarta.persistence.*;

@Entity
@Table(name = "preinscripciones")
public class PreinscripcionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_preinscripcion")
	private Long idPreinscripcion;
	
	// RELACION CON FK
	@ManyToOne
	@JoinColumn(name = "id_carrera", nullable = false)
	private Carrera carrera;
	
	@Column(name = "apellido", nullable = false, length = 80)
	private String apellido;
	
	@Column(name = "nombres", nullable = false, length = 120)
	private String nombres;
	
	@Column(name = "dni", nullable = false, length = 20)
	private String dni;
	
	@Column(name = "fecha_nacimiento", nullable = false)
	private LocalDate fechaNacimiento;
	
	@Column(name = "edad")
	private Integer edad;
	
	@Column(name = "lugar_nacimiento")
	private String lugarNacimiento;
	
	@Column(name = "nacionalidad")
	private String nacionalidad;
	
	@Column(name = "domicilio")
	private String domicilio;
	
	@Column(name = "localidad")
	private String localidad;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "secundario_egresado_de")
	private String secundarioEgresadoDe;
	
	@Column(name = "secundario_titulo")
	private String secundarioTitulo;
	
	@Column(name = "secundario_debe_materias")
	private Boolean secundarioDebeMaterias;
	
	@Column(name = "secundario_materias_adeudadas")
	private String secundarioMateriasAdeudadas;
	
	@Column(name = "salud_afeccion")
	private String saludAfeccion;
	
	@Column(name = "grupo_sanguineo")
	private String grupoSanguineo;
	
	@Convert(converter = EstadoPreinscripcionConverter.class)
	@Column(name = "estado", nullable = false) // PENDIENTE, APROBADO, RECHAZADO
	private EstadoPreinscripcion estado;
	
	@Column(name = "fecha_registro", updatable = false)
	private LocalDateTime fechaRegistro;
	
	@PrePersist
	protected void onCreate() {
		this.fechaRegistro = LocalDateTime.now();
	}
	
	protected PreinscripcionEntity() {
		// CONSTRUCTOR VACÍO REQUERIDO POR JPA
	}
	
	// =========================
    // GETTERS
    // =========================
	
	public Long getIdPreinscripcion() { return idPreinscripcion; }
	
	public Carrera getCarrera() { return carrera; }
	
	public String getApellido() { return apellido; }
	
	public String getNombres() { return nombres; }
	
	public String getDni() { return dni; }
	
	public LocalDate getFechaNacimiento() { return fechaNacimiento; }
	
	public Integer getEdad() { return edad; }
	
	public String getLugarNacimiento() { return lugarNacimiento; }
	
	public String getNacionalidad() { return nacionalidad; }
	
	public String getDomicilio() { return domicilio; }
	
	public String getLocalidad() { return localidad; }
	
	public String getTelefono() { return telefono; }
	
	public String getEmail() { return email; }
	
	public String getSecundarioEgresadoDe() { return secundarioEgresadoDe; }
	
	public String getSecundarioTitulo() { return secundarioTitulo; }
	
	public Boolean getSecundarioDebeMaterias() { return secundarioDebeMaterias; }
	
	public String getSecundarioMateriasAdeudadas() { return secundarioMateriasAdeudadas; }
	
	public String getSaludAfeccion() { return saludAfeccion; }
	
	public String getGrupoSanguineo() { return grupoSanguineo; }
	
	public EstadoPreinscripcion getEstado() { return estado; }
	
	public LocalDateTime getFechaRegistro() { return fechaRegistro; }
	
	// =========================
    // SETTERS
    // =========================

	public void setIdPreinscripcion(Long idPreinscripcion) { this.idPreinscripcion = idPreinscripcion; }
	
	public void setCarrera(Carrera carrera) { this.carrera = carrera; }
	
	public void setApellido(String apellido) { this.apellido = apellido; }
	
	public void setNombres(String nombres) { this.nombres = nombres; }
	
	public void setDni(String dni) { this.dni = dni; }
	
	public void setFechaNacimiento(LocalDate fecha) { this.fechaNacimiento = fecha; }
	
	public void setEdad(Integer edad) { this.edad = edad; }
	
	public void setLugarNacimiento(String lugarNacimiento) { this.lugarNacimiento = lugarNacimiento; }
	
	public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }
	
	public void setDomicilio(String domicilio) { this.domicilio = domicilio; }
	
	public void setLocalidad(String localidad) { this.localidad = localidad; }
	
	public void setTelefono(String telefono) { this.telefono = telefono; }
	
	public void setEmail(String email) { this.email = email; }
	
	public void setSecundarioEgresadoDe(String egresadoDe) { this.secundarioEgresadoDe = egresadoDe; }
	
	public void setSecundarioTitulo(String titulo) { this.secundarioTitulo = titulo; }
	
	public void setSecundarioDebeMaterias(Boolean debeMaterias) { this.secundarioDebeMaterias = debeMaterias; }
	
	public void setSecundarioMateriasAdeudadas (String materiasAdeudadas) { this.secundarioMateriasAdeudadas = materiasAdeudadas; }
	
	public void setSaludAfeccion(String afeccion) { this.saludAfeccion = afeccion; }
	
	public void setGrupoSanguineo(String grupoSanguineo) { this.grupoSanguineo = grupoSanguineo; }
	
	public void setEstado(EstadoPreinscripcion estado) { this.estado = estado; }
	
	public void setFechaRegistro(LocalDateTime fecha) { this.fechaRegistro = fecha; }
}
