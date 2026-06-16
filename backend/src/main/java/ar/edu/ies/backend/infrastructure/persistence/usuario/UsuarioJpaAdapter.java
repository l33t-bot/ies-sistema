package ar.edu.ies.backend.infrastructure.persistence.usuario;

import java.util.Optional;

import org.springframework.stereotype.Component;

import ar.edu.ies.backend.domain.usuario.Usuario;
import ar.edu.ies.backend.domain.usuario.UsuarioRepository;

@Component
public class UsuarioJpaAdapter implements UsuarioRepository {

	private final SpringUsuarioRepository repository;

    public UsuarioJpaAdapter(SpringUsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Usuario> buscarPorUsername(String username) {
        return repository.findByUsuario(username)
                .map(UsuarioMapper::toDomain);
    }

    @Override
    public Usuario guardar(Usuario usuario) {
        UsuarioEntity entity =
                UsuarioMapper.toEntity(usuario);

        UsuarioEntity saved = repository.save(entity);

        return UsuarioMapper.toDomain(saved);
    }

	@Override
	public Optional<Usuario> buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id)
				.map(UsuarioMapper::toDomain);
	}
}
