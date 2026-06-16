package ar.edu.ies.backend.domain.inscripcion;

import java.util.List;
import java.util.Optional;

public interface InscripcionRepository {

	// CRUD
	Inscripcion guardar(Inscripcion inscripcion);
	
	Optional<Inscripcion> buscarPorId(Long idInscripcion);
	
	void eliminar(Long id);
	
	List<Inscripcion> listarTodo();
	
	// CONSULTAS
	
	List<Inscripcion> buscarPorEstudiante(Long idEstudiante);
	
	List<Inscripcion> buscarPorPeriodo(Long idPeriodo);
	
	List<Inscripcion> buscarPorTipoInscripcion(TipoInscripcion tipo);
	
	List<Inscripcion> buscarPorEstado(EstadoInscripcion estado);
	
	Optional<Inscripcion> buscarPorEstudianteYPeriodo(Long idEstudiante, Long idPeriodo);
}
