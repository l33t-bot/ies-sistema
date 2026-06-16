package ar.edu.ies.backend.domain.correlatividad;

import java.util.List;
import java.util.Optional;

//PUERTO DE SALIDA (Output Port)
public interface CorrelatividadRepository {

	Correlatividad guardar(Correlatividad correlatividad);
	
	Optional<Correlatividad> buscarPorId(Long id);
	
	List<Correlatividad> listar();
	
	List<Correlatividad> listarPorMateriaPrincipal(Long idMateriaPrincipal);
	
	Boolean existeCorrelatividad(Long idMateriaPrincipal, Long idMateriaRequisito);
	
	Boolean existeCorrelatividadExceptoId(
			Long idMateriaPrincipal,
			Long idMateriaRequisito,
			Long idCorrelatividad);
	
	void eliminar(Long id);
}
