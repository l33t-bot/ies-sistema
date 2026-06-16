package ar.edu.ies.backend.domain.preinscripcion;

import java.util.List;
import java.util.Optional;

// PUERTO DE SALIDA (Output port)
public interface PreinscripcionRepository {

	Preinscripcion guardar(Preinscripcion preinscripcion);
	
	Preinscripcion actualizar(Preinscripcion preinscripcion);
	
	Optional<Preinscripcion> buscarPorId(Long id);
	
	List<Preinscripcion> listarTodas();
	
	boolean existePorDni(String dni);
}
