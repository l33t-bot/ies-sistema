package ar.edu.ies.backend.domain.materia;

import java.util.List;
import java.util.Optional;

// PUERTO DE SALIDA (Output Port)
public interface MateriaRepository {

	Materia guardar(Materia materia);
	
	Optional<Materia> buscarPorId(Long id);
	
	List<Materia> listar();
	
	List<Materia> listarPorPlan(Long idPlan);
	
	List<Materia> buscarPorAnioYCarrera(int anio, Long idCarrera);
	
	void eliminar(Long id);
}
