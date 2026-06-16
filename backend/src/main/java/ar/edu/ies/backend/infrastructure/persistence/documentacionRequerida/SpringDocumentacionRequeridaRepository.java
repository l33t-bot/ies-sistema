package ar.edu.ies.backend.infrastructure.persistence.documentacionRequerida;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDocumentacionRequeridaRepository extends JpaRepository<DocumentacionRequeridaEntity, Long>{

	List<DocumentacionRequeridaEntity> findByAplicaReinscripcion(Boolean esReinscripcion);
	
	List<DocumentacionRequeridaEntity> findByAplicaInscripcion(Boolean esInscripcion);
	
	Optional<DocumentacionRequeridaEntity> findByNombreDocumento(String nombre);
}
