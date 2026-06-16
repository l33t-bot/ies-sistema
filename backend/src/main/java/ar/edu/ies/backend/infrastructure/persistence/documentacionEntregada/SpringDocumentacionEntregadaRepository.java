package ar.edu.ies.backend.infrastructure.persistence.documentacionEntregada;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDocumentacionEntregadaRepository extends JpaRepository<DocumentacionEntregadaEntity, Long>{
	
	Optional<DocumentacionEntregadaEntity> findByInscripcion_IdInscripcion(Long idInscripcion);
}
