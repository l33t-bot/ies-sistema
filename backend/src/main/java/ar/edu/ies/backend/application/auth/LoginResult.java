package ar.edu.ies.backend.application.auth;

import ar.edu.ies.backend.domain.usuario.Rol;

public class LoginResult {

	private Long idUsuario;
    private String usuario;
    private Rol rol;
    private String token;

    public LoginResult(Long idUsuario,
                       String usuario,
                       Rol rol,
                       String token) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.rol = rol;
        this.token = token;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public String getUsername() {
        return usuario;
    }

    public Rol getRol() {
        return rol;
    }

    public String getToken() {
        return token;
    }
}
