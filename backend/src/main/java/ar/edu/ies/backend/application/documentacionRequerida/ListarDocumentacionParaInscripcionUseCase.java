package ar.edu.ies.backend.application.documentacionRequerida;

import java.util.List;
import java.util.stream.Collectors;

import ar.edu.ies.backend.domain.documentacionRequerida.DocumentacionRequerida;
import ar.edu.ies.backend.domain.documentacionRequerida.DocumentacionRequeridaRepository;

public class ListarDocumentacionParaInscripcionUseCase {

	private final DocumentacionRequeridaRepository requeridaRepository;
	private final DocumentacionRequeridaValidator validator;

	public ListarDocumentacionParaInscripcionUseCase(
			DocumentacionRequeridaRepository requeridaRepository,
			DocumentacionRequeridaValidator validator
	) {
		
		this.requeridaRepository = requeridaRepository;
		this.validator = validator;
	}
	
	public List<DocumentacionRequerida> ejecutar(Boolean esReinscripcion) {
		
		validator.validarTipoInscripcion(esReinscripcion);
		
		return requeridaRepository.listarTodos()
				.stream()
				.filter(doc -> doc.aplicaPara(esReinscripcion))
				.collect(Collectors.toList());
	}
}
