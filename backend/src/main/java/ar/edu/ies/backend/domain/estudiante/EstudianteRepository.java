package ar.edu.ies.backend.domain.estudiante;

import java.util.List;
import java.util.Optional;

public interface EstudianteRepository {

	Estudiante guardar(Estudiante estudiante);
	
	Optional<Estudiante> buscarPorId(Long id);
	
	List<Estudiante> listarActivos();
	
	List<Estudiante> listarPorCarrera(Long idCarre);
	
	Optional<Estudiante> buscarPorDni(String dni);
	
	boolean existePorDni(String dni);
}
