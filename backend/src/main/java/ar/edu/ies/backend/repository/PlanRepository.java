package ar.edu.ies.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.edu.ies.backend.model.Plan;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Long> {

	List<Plan> findByCarrera_IdCarrera(Long idCarrera);
}
