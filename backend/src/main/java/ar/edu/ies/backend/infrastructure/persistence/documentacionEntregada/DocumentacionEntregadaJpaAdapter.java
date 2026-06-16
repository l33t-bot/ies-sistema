package ar.edu.ies.backend.infrastructure.persistence.documentacionEntregada;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import ar.edu.ies.backend.domain.documentacionEntregada.DocumentacionEntregada;
import ar.edu.ies.backend.domain.documentacionEntregada.DocumentacionEntregadaRepository;

@Component
public class DocumentacionEntregadaJpaAdapter implements DocumentacionEntregadaRepository{

	private final SpringDocumentacionEntregadaRepository jpaRepository;
	
	@Override
	public DocumentacionEntregada guardar(DocumentacionEntregada doc) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Optional<DocumentacionEntregada> bucarPorId(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<DocumentacionEntregada> buscarPorInscripcion(Long idInscripcion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean existe(Long idInscripcion, Long idDocumento) {
		// TODO Auto-generated method stub
		return false;
	}

}
