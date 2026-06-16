package ar.edu.ies.backend.application.correlatividad;

import java.util.List;

import ar.edu.ies.backend.domain.correlatividad.Correlatividad;
import ar.edu.ies.backend.domain.correlatividad.CorrelatividadRepository;

public class ListarCorrelatividadesUseCase {

	private final CorrelatividadRepository correlatividadRepository;
	
	public ListarCorrelatividadesUseCase(CorrelatividadRepository correlatividadRepository) {
		
		this.correlatividadRepository = correlatividadRepository;
	}
	
	public List<Correlatividad> ejecutar(){
		
		return correlatividadRepository.listar();
	}
}
