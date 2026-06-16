package ar.edu.ies.backend.application.documentacionRequerida;

import java.util.List;

import ar.edu.ies.backend.domain.documentacionRequerida.DocumentacionRequerida;
import ar.edu.ies.backend.domain.documentacionRequerida.DocumentacionRequeridaRepository;

public class ListarDocumentacionRequeridaUseCase {

	private final DocumentacionRequeridaRepository requeridaRepository;
	
	public ListarDocumentacionRequeridaUseCase(DocumentacionRequeridaRepository requeridaRepository) {
		
		this.requeridaRepository = requeridaRepository;
	}
	
	public List<DocumentacionRequerida> ejecutar() {
		
		return requeridaRepository.listarTodos();
	}
}
