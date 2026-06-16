package ar.edu.ies.backend.domain.documentacionRequerida;

import java.util.List;
import java.util.Optional;

public interface DocumentacionRequeridaRepository {

	DocumentacionRequerida guardar(DocumentacionRequerida doc);
	
	Optional<DocumentacionRequerida> buscarPorId(Long id);
	
	List<DocumentacionRequerida> listarTodos();
	
	// agregado por los campos que tengo
	List<DocumentacionRequerida> buscarPorTipoInscripcion(Boolean esReinscripcion);
	
	Optional<DocumentacionRequerida> buscarPorNombre(String nombre);
	
	void eliminar(Long id);
}
