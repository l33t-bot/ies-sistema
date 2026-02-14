package ar.edu.ies.backend.repository;

// Dependencia que evita el NullPinterException
import java.util.Optional;

// Dependencia para realizar las consultas sin necesidad de escribir sql
import org.springframework.data.jpa.repository.JpaRepository;
// Interfaz que provee métodos CRUD
import org.springframework.stereotype.Repository;

import ar.edu.ies.backend.model.Usuario;

@Repository //<Usuario, Integer> para buscar por usuario e id
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	// Buscar por nombre de usuario
	Optional<Usuario> findByUsuario(String usuario);
	
	// Buscar usuario activo por username
	Optional<Usuario> findByUsuarioAndActivoTrue(String usuario);
}
