package ar.edu.ies.backend.application.inscripcion;

import ar.edu.ies.backend.domain.inscripcion.NumeradorInscripcionRepository;

public class GeneradorNumeroInscripcion {

	private final NumeradorInscripcionRepository numeradorRepository;
	
	public GeneradorNumeroInscripcion(NumeradorInscripcionRepository numeradorRepository) {
		
		this.numeradorRepository = numeradorRepository;
	}
	
	public String ejecutar(Integer anio) {
		
		Integer ultimoNumero = numeradorRepository
				.obtenerUltimoNumeroSecuencialDelAnio(anio);
		
		int siguienteNumero = (ultimoNumero == null ? 1 : ultimoNumero + 1);
		
		return formatearNumero(anio, siguienteNumero);
	}
	
	private String formatearNumero(Integer anio, Integer secuencia) {
		return String.format("INS-%d-%06d", anio, secuencia);
	}
}
