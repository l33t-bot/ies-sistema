package ar.edu.ies.backend.domain.documentacionEntregada;

import java.util.List;
import java.util.Optional;

public interface DocumentacionEntregadaRepository {

	DocumentacionEntregada guardar(DocumentacionEntregada doc);
	
	Optional<DocumentacionEntregada> bucarPorId(Long id);
	
	List<DocumentacionEntregada> buscarPorInscripcion(Long idInscripcion);
	
	void eliminar(Long id);
	
	boolean existe(Long idInscripcion, Long idDocumento);
}
