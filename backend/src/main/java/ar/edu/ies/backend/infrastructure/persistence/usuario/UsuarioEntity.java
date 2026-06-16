package ar.edu.ies.backend.infrastructure.persistence.usuario;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;

    @Column(name = "usuario", length = 80, nullable = false, unique = true)
    private String usuario;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash;

    @Column(name = "rol", nullable = false)
    private String rol;

    @Column(name = "activo", nullable = false)
    private Boolean activo;

    @Column(name = "creado_at", updatable = false)
    private LocalDateTime creadoAt;

    @Column(name = "actualizado_at")
    private LocalDateTime actualizadoAt;

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
	// GETTERS
	// ======================
	
	public Long getIdUsuario() { return idUsuario; }
	public String getUsuario() { return usuario; }
	public String getPasswordHash() { return passwordHash; }
	public String getRol() { return rol; }
	public Boolean getActivo() { return activo; }
	
	// ======================
	// SETTERS
	// ======================
	
	public void setIdUsuario(Long id) { this.idUsuario = id; }
	public void setUsuario(String usuario) { this.usuario = usuario; }
	public void setPasswordHash(String passwordHash) { this.passwordHash = passwordHash; }
	public void setRol(String rol) { this.rol = rol; }
	public void setActivo(Boolean activo) { this.activo = activo; }
}

