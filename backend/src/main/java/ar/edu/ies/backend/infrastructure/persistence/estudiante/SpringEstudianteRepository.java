package ar.edu.ies.backend.infrastructure.persistence.estudiante;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringEstudianteRepository extends JpaRepository<EstudianteEntity, Long>{

	Optional<EstudianteEntity> findByDni(String dni);
	
	boolean existsByDni(String dni);
	
	List<EstudianteEntity> findByActivoTrue();
	
	List<EstudianteEntity> findByCarrera_IdCarrera(Long idCarrera);
}
