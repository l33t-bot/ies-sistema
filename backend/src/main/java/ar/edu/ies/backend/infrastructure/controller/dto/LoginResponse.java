package ar.edu.ies.backend.infrastructure.controller.dto;

public class LoginResponse {

	private Long idUsuario;
    private String usuario;
    private String rol;
    private String token;

    public LoginResponse(Long idUsuario,
                         String usuario,
                         String rol,
                         String token) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.rol = rol;
        this.token = token;
    }

    public Long getIdUsuario() { return idUsuario; }

    public String getUsuario() { return usuario; }

    public String getRol() { return rol; }

    public String getToken() { return token; }
}
