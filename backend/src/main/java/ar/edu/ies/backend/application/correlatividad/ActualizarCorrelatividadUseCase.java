package ar.edu.ies.backend.application.correlatividad;

import ar.edu.ies.backend.domain.correlatividad.Correlatividad;
import ar.edu.ies.backend.domain.correlatividad.CorrelatividadRepository;
import ar.edu.ies.backend.domain.correlatividad.TipoCorrelativa;
import ar.edu.ies.backend.domain.materia.Materia;
import ar.edu.ies.backend.domain.materia.MateriaRepository;

public class ActualizarCorrelatividadUseCase {

	private final CorrelatividadRepository correlatividadRepository;
	private final MateriaRepository materiaRepository;
	
	public ActualizarCorrelatividadUseCase(
			CorrelatividadRepository correlatividadRepository,
			MateriaRepository materiaRepository) {
		
		this.correlatividadRepository = correlatividadRepository;
		this.materiaRepository = materiaRepository;
	}
	
	public Correlatividad ejecutar(
			Long idCorrelatividad,
			Long idMateriaPrincipal,
			Long idMateriaRequisito,
			TipoCorrelativa tipo,
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
			throw new IllegalArgumentException(
					"Una materia de año inferior no puede tener correlativas de años superiores");
		
		// validar duplicado
		boolean existe = correlatividadRepository.existeCorrelatividadExceptoId(
				idMateriaPrincipal,
				idMateriaRequisito,
				idCorrelatividad);
		
		if(existe)
			throw new IllegalArgumentException("La correlatividad ya existe");
		
		// buscar correlatividad
		Correlatividad correlatividad = correlatividadRepository
				.buscarPorId(idCorrelatividad)
				.orElseThrow(() -> new IllegalArgumentException("Correlatividad no encontrada"));
		
		correlatividad.actualizarDatos(idMateriaPrincipal, idMateriaRequisito, tipo, activa);
		
		return correlatividadRepository.guardar(correlatividad);
	}
}
