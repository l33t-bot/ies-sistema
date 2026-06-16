package ar.edu.ies.backend.domain.usuario;

import java.util.Optional;

public interface UsuarioRepository {

	Optional<Usuario> buscarPorId(Long id);
	
	Optional<Usuario> buscarPorUsername(String username);

    Usuario guardar(Usuario usuario);
}
