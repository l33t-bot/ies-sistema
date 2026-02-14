package ar.edu.ies.backend.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Integer idUsuario;
	
	@Column(name = "usuario", length = 80, nullable = false, unique = true)
	private String usuario;
	
	@Column(name = "password_hash", nullable = false)
	private String passwordHash;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "rol", nullable = false)
	private Rol rol;
	
	@Column(name = "activo", nullable = false)
	private Boolean activo;
	
	@Column(name = "creado_at", updatable = false)
	private LocalDateTime creadoAt;
	
	@Column(name = "actualizado_at")
	private LocalDateTime actualizadoAt;
	
	// ======================
	
	// Ciclo de vida JPA
	
	// ======================
	
	@PrePersist
	protected void onCreate() {
		creadoAt = LocalDateTime.now();
		actualizadoAt = LocalDateTime.now();
	}
	
	@PreUpdate
	protected void onUpdate() {
		actualizadoAt = LocalDateTime.now();
	}
	
	// ======================
	
	// Getters & Setters
	
	// ======================
	
	public Integer getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdUsuario(Integer id) {
		this.idUsuario = id;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getPasswordHash() {
		return passwordHash;
	}
	
	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}
	
	public Rol getRol() {
		return rol;
	}
	
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	
	public Boolean getActivo() {
		return activo;
	}
	
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
}
