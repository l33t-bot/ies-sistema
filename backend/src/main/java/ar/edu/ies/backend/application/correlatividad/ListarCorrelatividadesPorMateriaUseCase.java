package ar.edu.ies.backend.application.correlatividad;

import java.util.List;

import ar.edu.ies.backend.domain.correlatividad.Correlatividad;
import ar.edu.ies.backend.domain.correlatividad.CorrelatividadRepository;

public class ListarCorrelatividadesPorMateriaUseCase {

	private final CorrelatividadRepository correlatividadRepository;
	
	public ListarCorrelatividadesPorMateriaUseCase(CorrelatividadRepository correlatividadRepository) {
		this.correlatividadRepository = correlatividadRepository;
	}
	
	public List<Correlatividad> ejecutar(Long idMateria) {
		return correlatividadRepository.listarPorMateriaPrincipal(idMateria);
	}
}
