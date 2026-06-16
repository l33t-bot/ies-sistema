package ar.edu.ies.backend.infrastructure.persistence.usuario;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringUsuarioRepository
        extends JpaRepository<UsuarioEntity, Long> {

    Optional<UsuarioEntity> findByUsuario(String usuario);
}
