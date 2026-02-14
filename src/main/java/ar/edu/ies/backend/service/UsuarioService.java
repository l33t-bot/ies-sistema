package ar.edu.ies.backend.service;

import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import ar.edu.ies.backend.controller.dto.CrearUsuarioRequest;
import ar.edu.ies.backend.controller.dto.LoginRequest;
import ar.edu.ies.backend.controller.dto.LoginResponse;
import ar.edu.ies.backend.model.Rol;
import ar.edu.ies.backend.model.Usuario;
import ar.edu.ies.backend.repository.UsuarioRepository;
import ar.edu.ies.backend.security.JwtService;

@Service
public class UsuarioService {
	// El atriburo es una instancia de la interfaz UsuarioRepository
	private final UsuarioRepository usuarioRepository;
	private final PasswordEncoder passwordEncoder;
	private final JwtService jwtService;
	
	public UsuarioService(
			UsuarioRepository usuarioRepository,
			PasswordEncoder passwordEncoder,
			JwtService jwtService) {
		this.usuarioRepository = usuarioRepository;
		this.passwordEncoder = passwordEncoder;
		this.jwtService = jwtService;
	}
		
	public LoginResponse login(LoginRequest request) {
		Usuario usuario = usuarioRepository.findByUsuario(request.getUsuario())
				.orElseThrow(() -> new RuntimeException("Usuario o contraseña incorrecta"));
		
		if(!passwordEncoder.matches(request.getPassword(), usuario.getPasswordHash())) {
			throw new RuntimeException("Usuario o contraseña incorrecta");
		}
		
		
		String token = jwtService.generateToken(
                usuario.getUsuario(),
                usuario.getRol().name()
        );

        return new LoginResponse(
        		usuario.getIdUsuario(),
                usuario.getUsuario(),
                usuario.getRol().name(),
                token
        );
	}
	
	public Usuario crearUsuario(CrearUsuarioRequest request) {
		
		if(usuarioRepository.findByUsuario(request.getUsuario()).isPresent()) {
			throw new RuntimeException("El usuario ya existe");
		}
		
		Usuario usuario = new Usuario();
		usuario.setUsuario(request.getUsuario());
		usuario.setPasswordHash(passwordEncoder.encode(request.getPassword()));
		usuario.setRol(Rol.valueOf(request.getRol().toUpperCase()));
		usuario.setActivo(true);
		
		return usuarioRepository.save(usuario);
	}
}
