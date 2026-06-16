package ar.edu.ies.backend.domain.usuario;

public class Usuario {

	private Long idUsuario;
	private String usuario;
	private String password;
	private Rol rol;
	private Boolean activo;
	
	public Usuario(Long idUsuario, String usuario,
				   String password, Rol rol,
				   Boolean activo
	) {
		this.idUsuario = idUsuario;
		this.usuario = usuario;
		this.password = password;
		this.rol = rol;
		this.activo = activo;
	}
	
	public Long getIdUsuario() { return idUsuario; }

    public String getUsername() { return usuario; }

    public String getPassword() { return password; }

    public Rol getRol() { return rol; }
    
    public Boolean getActivo() { return activo; }
}
