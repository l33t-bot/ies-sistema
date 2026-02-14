package ar.edu.ies.backend.controller.dto;

public class LoginResponse {
	private Integer idUsuario;
	private String usuario;
	private String rol;
	private String token;
	
	public LoginResponse(Integer id, String usuario, String rol, String token) {
        this.idUsuario = id;
        this.usuario = usuario;
        this.rol = rol;
        this.token = token;
    }

	public Integer getId() {
		return idUsuario;
	}
	
    public String getUsuario() {
        return usuario;
    }

    public String getRol() {
        return rol;
    }
    
    public String getToken() {
    	return token;
    }
}
