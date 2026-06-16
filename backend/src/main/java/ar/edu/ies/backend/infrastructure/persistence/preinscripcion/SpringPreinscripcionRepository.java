package ar.edu.ies.backend.infrastructure.persistence.preinscripcion;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringPreinscripcionRepository extends JpaRepository<PreinscripcionEntity, Long>{

	boolean existsByDni(String dni);
}
