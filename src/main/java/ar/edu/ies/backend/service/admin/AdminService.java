package ar.edu.ies.backend.service.admin;

import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import ar.edu.ies.backend.repository.UsuarioRepository;
import ar.edu.ies.backend.controller.dto.CrearUsuarioRequest;
import ar.edu.ies.backend.model.Rol;
import ar.edu.ies.backend.model.Usuario;

@Service
public class AdminService {
	
	private final UsuarioRepository usuarioRepository;
	private final PasswordEncoder passwordEncoder;
	
	public AdminService(
			UsuarioRepository usuarioRepository,
			PasswordEncoder passwordEncoder) {
		this.usuarioRepository = usuarioRepository;
		this.passwordEncoder = passwordEncoder;
	}
	
	public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }
	
	public Usuario crearUsuario(CrearUsuarioRequest request) {

	    if (usuarioRepository.findByUsuario(request.getUsuario()).isPresent()) {
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
