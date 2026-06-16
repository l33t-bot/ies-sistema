package ar.edu.ies.backend.infrastructure.persistence.estudiante;

import java.time.LocalDate;
import java.time.LocalDateTime;

import ar.edu.ies.backend.infrastructure.persistence.usuario.UsuarioEntity;
import ar.edu.ies.backend.model.Carrera;
import ar.edu.ies.backend.model.Plan;
import jakarta.persistence.*;

@Entity
@Table(name = "estudiantes")
public class EstudianteEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_estudiante")
	private Long idEstudiante;
	
	// RELACIÓN CON FK
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario", nullable = false)
	private UsuarioEntity usuario;
	
	@Column(name = "apellido", nullable = false, length = 80)
	private String apellido;

	@Column(name = "nombres", nullable = false, length = 120)
	private String nombres;

	@Column(name = "dni", nullable = false, length = 20)
	private String dni;
	
	@Column(name = "fecha_nacimiento", nullable = false)
	private LocalDate fechaNacimiento;
	
	@Column(name = "nacionalidad", length = 60)
	private String nacionalidad;
	
	@Column(name = "domicilio", length = 150)
	private String domicilio;
	
	@Column(name = "localidad", length = 100)
	private String localidad;
	
	@Column(name = "telefono", length = 50)
	private String telefono;
	
	@Column(name = "email", nullable = false, length = 120)
	private String email;
	
	@Column(name = "numero_libreta", length = 12)
	private String numeroLibreta;
	
	@Column(name = "grupo_sanguineo", length = 60)
	private String grupoSanguineo;
	
	// RELACIÓN CON FK
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_carrera", nullable = false)
	private Carrera carrera;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_plan", nullable = false)
	private Plan plan;
	
	@Column(name = "activo", nullable = false)
	private Boolean activo;
	
	@Column(name = "created_at", updatable = false)
	private LocalDateTime createdAt;
	
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;

	@PrePersist
	protected void onCreate() {
		this.createdAt = LocalDateTime.now();
		this.updatedAt = LocalDateTime.now();
		
		if (this.activo == null)
			this.activo = true;
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = LocalDateTime.now();
	}
	
	// =========================
    // SETTERS
    // =========================

	public void setIdEstudiante(Long idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public void setUsuario(UsuarioEntity usuario) {
		this.usuario = usuario;
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

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
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

	public void setEmail(String email) {
		this.email = email;
	}

	public void setNumeroLibreta(String numeroLibreta) {
		this.numeroLibreta = numeroLibreta;
	}

	public void setGrupoSanguineo(String grupoSanguineo) {
		this.grupoSanguineo = grupoSanguineo;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	// =========================
    // GETTERS
    // =========================
	public Long getIdEstudiante() {
		return idEstudiante;
	}

	public UsuarioEntity getUsuario() {
		return usuario;
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

	public LocalDate getFechaNacimiento() {
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

	public String getEmail() {
		return email;
	}

	public String getNumeroLibreta() {
		return numeroLibreta;
	}

	public String getGrupoSanguineo() {
		return grupoSanguineo;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public Plan getPlan() {
		return plan;
	}

	public Boolean getActivo() {
		return activo;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
}
