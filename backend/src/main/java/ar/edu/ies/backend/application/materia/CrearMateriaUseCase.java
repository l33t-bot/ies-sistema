package ar.edu.ies.backend.application.materia;

import ar.edu.ies.backend.domain.materia.Materia;
import ar.edu.ies.backend.domain.materia.MateriaRepository;

public class CrearMateriaUseCase {

	private final MateriaRepository repository;
	
	public CrearMateriaUseCase(MateriaRepository repository) {
		this.repository = repository;
	}
	
	public Materia ejecutar(Materia materia) {
		return repository.guardar(materia);
	}
}
