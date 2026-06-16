package ar.edu.ies.backend.application.preinscripcion;

import java.time.LocalDate;

import ar.edu.ies.backend.domain.preinscripcion.Preinscripcion;
import ar.edu.ies.backend.domain.preinscripcion.PreinscripcionRepository;

public class CrearPreinscripcionUseCase {

	private final PreinscripcionRepository preinscripcionRepository;
	//private final CrreraRepository carreraRepository;
	
	public CrearPreinscripcionUseCase(PreinscripcionRepository preinscripcionRepository) {
		
		this.preinscripcionRepository = preinscripcionRepository;
	}
	
	public Preinscripcion ejecutar(
			Long idCarrera, String apellido, String nombres,
			String dni,	LocalDate fechaNacimiento,
			Integer edad, String email
	) {
		
		// EVITAR DUPLICADO
		if (preinscripcionRepository.existePorDni(dni))
			throw new RuntimeException("Ya existe una preinscripción con ese DNI");
		
		Preinscripcion nueva = new Preinscripcion(
				idCarrera, apellido, nombres,
				dni, fechaNacimiento, edad, email
		);
		
		return preinscripcionRepository.guardar(nueva);
	}
}
