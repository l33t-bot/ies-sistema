package ar.edu.ies.backend.application.auth;

import org.springframework.security.crypto.password.PasswordEncoder;

import ar.edu.ies.backend.domain.usuario.Usuario;
import ar.edu.ies.backend.domain.usuario.UsuarioRepository;
import ar.edu.ies.backend.infrastructure.security.JwtService;

public class LoginUseCase {

	private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    public LoginUseCase(
            UsuarioRepository usuarioRepository,
            PasswordEncoder passwordEncoder,
            JwtService jwtService
    ) {
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtService = jwtService;
    }

    public LoginResult ejecutar(String username, String password) {

        Usuario usuario = usuarioRepository
                .buscarPorUsername(username)
                .orElseThrow(() ->
                        new IllegalArgumentException("Usuario no encontrado")
                );

        if (!passwordEncoder.matches(password, usuario.getPassword())) {
            throw new IllegalArgumentException("Credenciales inválidas");
        }

        String token = jwtService.generateToken(
                usuario.getUsername(),
                usuario.getRol().name()
        );

        return new LoginResult(
        		usuario.getIdUsuario(),
        		usuario.getUsername(),
        		usuario.getRol(),
        		token
        );
    }
}
