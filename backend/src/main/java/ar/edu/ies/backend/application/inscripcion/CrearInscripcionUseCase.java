package ar.edu.ies.backend.application.inscripcion;

import ar.edu.ies.backend.domain.inscripcion.Inscripcion;
import ar.edu.ies.backend.domain.inscripcion.InscripcionRepository;
import ar.edu.ies.backend.domain.inscripcion.TipoInscripcion;
import ar.edu.ies.backend.exception.ValidacionException;

public class CrearInscripcionUseCase {

	private final InscripcionRepository inscripcionRepository;
	private final GeneradorNumeroInscripcion generarNumeroInscripcion;
	
	public CrearInscripcionUseCase(
			InscripcionRepository inscripcionRepository,
			GeneradorNumeroInscripcion generarNumeroInscripcion
	) {
		
		this.inscripcionRepository = inscripcionRepository;
		this.generarNumeroInscripcion = generarNumeroInscripcion;
	}
	
	public Inscripcion ejecutar(
			Long idEstudiante, Long idPeriodo,
			TipoInscripcion tipoInscripcion,
			Integer ainoQueCursa
	) {
		
		// EVITO DUPLICADOS
		if (inscripcionRepository
				.buscarPorEstudianteYPeriodo(idEstudiante, idPeriodo)
				.isPresent()) {
			throw new ValidacionException("El estudiante ya está inscripto en este período");
		}
		
		// CREAO LA INSCRIPCIÓN
		Inscripcion inscripcion = new Inscripcion(
				idEstudiante,
				idPeriodo,
				tipoInscripcion,
				ainoQueCursa
		);
		
		// GENERO NÚMERO
		String numero = generarNumeroInscripcion.ejecutar(inscripcion.getAnioQueCursa());
		inscripcion.cambiarNumeroInscripcion(numero);
		
		
		return inscripcionRepository.guardar(inscripcion);
	}
}
