package ar.edu.ies.backend.infrastructure.persistence.materia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringMateriaRepository extends JpaRepository<MateriaEntity, Long> {
	
	List<MateriaEntity> findByIdPlan(Long idPlan);
}
