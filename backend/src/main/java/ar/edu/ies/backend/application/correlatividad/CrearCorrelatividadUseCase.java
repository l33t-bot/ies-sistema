package ar.edu.ies.backend.application.correlatividad;

import java.util.List;

import ar.edu.ies.backend.domain.correlatividad.Correlatividad;
import ar.edu.ies.backend.domain.correlatividad.CorrelatividadRepository;
import ar.edu.ies.backend.domain.correlatividad.TipoCorrelativa;
import ar.edu.ies.backend.domain.materia.Materia;
import ar.edu.ies.backend.domain.materia.MateriaRepository;

public class CrearCorrelatividadUseCase {

	private final CorrelatividadRepository correlatividadRepository;
	private final MateriaRepository materiaRepository;
	
	public CrearCorrelatividadUseCase(
			CorrelatividadRepository correlatividadRepository,
			MateriaRepository materiaRepository) {
		
		this.correlatividadRepository =  correlatividadRepository;
		this.materiaRepository = materiaRepository;
	}
	
	public Correlatividad ejecutar(
			Long idMateriaPrincipal,
			Long idMateriaRequisito,
			TipoCorrelativa tipoCorrelativa,
			Boolean activa) {
		
		// buscar materias
		Materia principal = materiaRepository
				.buscarPorId(idMateriaPrincipal)
				.orElseThrow(() -> new IllegalArgumentException("Materia principal no encontrada"));
		
		Materia requisito = materiaRepository
				.buscarPorId(idMateriaRequisito)
				.orElseThrow(() -> new IllegalArgumentException("Materia requisito no encontrada"));
		
		// validar años
		if (principal.getAnioCarrera() < requisito.getAnioCarrera())
			throw new IllegalArgumentException("Una materia de año inferior no puede tener correlativa de años superiores");
		
		// validar duplicado
		boolean existe = correlatividadRepository.existeCorrelatividad(idMateriaPrincipal, idMateriaRequisito);
		
		if(existe)
			throw new IllegalArgumentException("La correlatividad ya existe");
		
		// validar ciclo
		if(generaCiclo(idMateriaPrincipal, idMateriaRequisito))
			throw new IllegalArgumentException("La correlatividad generaría un ciclo entre materias");
		
		// crear correlatividad
		Correlatividad correlatividad = new Correlatividad(
				null,
				idMateriaPrincipal,
				idMateriaRequisito,
				tipoCorrelativa,
				activa);
		
		// guardar
		return correlatividadRepository.guardar(correlatividad);
	}
	
	// MÉTODO PARA DETECTAR CICLOS SUGERIDO POR LA IA
	// atento a la recursividad infinita
	private boolean generaCiclo(Long principal, Long requisito) {
		
		if (principal.equals(requisito)) return true;
		
		List<Correlatividad> correlativas =
				correlatividadRepository.listarPorMateriaPrincipal(requisito);
		
		for (Correlatividad c : correlativas) {
			
			if(generaCiclo(principal, c.getIdMateriaRequisito())) return true;
		}
		
		return false;
	}
}
