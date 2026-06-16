package ar.edu.ies.backend.application.materia;

import java.util.List;

import ar.edu.ies.backend.domain.materia.Materia;
import ar.edu.ies.backend.domain.materia.MateriaRepository;

public class ListarMateriasUseCase {

	private final MateriaRepository repository;
	
	public ListarMateriasUseCase(MateriaRepository repository) {
		this.repository = repository;
	}
	
	public List<Materia> ejecutar() {
		return repository.listar();
	}
}
