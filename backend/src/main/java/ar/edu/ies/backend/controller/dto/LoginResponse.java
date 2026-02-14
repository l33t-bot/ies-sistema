package ar.edu.ies.backend.controller.dto;

public class LoginResponse {
	private Integer id;
	private String usuario;
	private String rol;
	
	public LoginResponse(Integer id, String usuario, String rol) {
        this.id = id;
        this.usuario = usuario;
        this.rol = rol;
    }
	
	public Integer getId() {
        return id;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getRol() {
        return rol;
    }
}
