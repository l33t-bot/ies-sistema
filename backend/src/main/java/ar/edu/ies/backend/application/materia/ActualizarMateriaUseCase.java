package ar.edu.ies.backend.application.materia;

import java.util.Optional;

import ar.edu.ies.backend.domain.materia.Materia;
import ar.edu.ies.backend.domain.materia.MateriaRepository;

public class ActualizarMateriaUseCase {

	private final MateriaRepository materiaRepository;
	
	public ActualizarMateriaUseCase(MateriaRepository materiaRepository) {
		this.materiaRepository = materiaRepository;
	}
	
	public Materia ejecutar(Materia materia) {
		
		Optional<Materia> optionalMateria = 
				materiaRepository.buscarPorId(materia.getIdMateria());
		
		if (optionalMateria.isEmpty()) {
			throw new IllegalArgumentException("Materia no encontrada");
		}
		
		return materiaRepository.guardar(materia);
	}
}
