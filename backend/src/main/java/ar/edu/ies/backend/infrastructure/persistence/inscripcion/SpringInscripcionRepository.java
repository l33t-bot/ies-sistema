package ar.edu.ies.backend.infrastructure.persistence.inscripcion;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.ies.backend.domain.inscripcion.EstadoInscripcion;
import ar.edu.ies.backend.domain.inscripcion.TipoInscripcion;


public interface SpringInscripcionRepository extends JpaRepository<InscripcionEntity, Long> {

	// =========================
	// BÚSQUEDAS PRINCIPALES
	// =========================
	
	Optional<InscripcionEntity> findByIdInscripcion(Long idInscripcion);
	
	List<InscripcionEntity> findByEstudiante_IdEstudiante(Long idEstudiante);
	
	List<InscripcionEntity> findByPeriodo_IdPeriodo(Long idPeriodo);
	
	Optional<InscripcionEntity> findByNumeroInscripcion(String numeroInscripcion);
	
	// =========================
	// FILTROS
	// =========================
	
	List<InscripcionEntity> findByEstadoInscripcion(EstadoInscripcion estadoInscripcion);
	
	List<InscripcionEntity> findByTipoInscripcion(TipoInscripcion tipoInscripcion);
	
	List<InscripcionEntity> findByFechaInscripcionOnline(LocalDateTime fechaInscripcionOnline);
	
	// =========================
    // VALIDACIONES DE NEGOCIO
    // =========================
	
	Optional<InscripcionEntity> findByEstudiante_IdEstudianteAndPeriodo_IdPeriodo(Long idEstudiante, Long idPeriodo);
	
}
