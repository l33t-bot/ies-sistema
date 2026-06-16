package ar.edu.ies.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.ies.backend.model.Carrera;

public interface CarreraRepository extends JpaRepository<Carrera, Long>{
	
}
