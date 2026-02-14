package ar.edu.ies.backend.service;

import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import ar.edu.ies.backend.model.Usuario;
import ar.edu.ies.backend.repository.UsuarioRepository;

@Service
public class UsuarioService {
	// El atriburo es una instancia de la interfaz UsuarioRepository
	private final UsuarioRepository usuarioRepository;
	private final PasswordEncoder passwordEncoder;
	
	public UsuarioService(UsuarioRepository usuarioRepository,
						  PasswordEncoder passwordEncoder) {
		this.usuarioRepository = usuarioRepository;
		this.passwordEncoder = passwordEncoder;
	}
		
	public Usuario login(String username, String passwordPlano) {
		// se hace la consulta por nombre de usuario
		Optional<Usuario> optionalUsuario =
		        usuarioRepository.findByUsuario(username);
		
		// si la consulta está vacía retorna null
		if (optionalUsuario.isEmpty()) {
			return null; // usuario no existe o está inactivo
		}
		
		// asigno el usuario obtenido en la consulta a la variable usuario
		Usuario usuario = optionalUsuario.get();
		
		// se compara el pass de DB con el parametro enviado
		if (!passwordEncoder.matches(passwordPlano, usuario.getPasswordHash())) {
			return null; // contraseña incorrecta
		}
		
		return usuario; // login ok
	}
}
