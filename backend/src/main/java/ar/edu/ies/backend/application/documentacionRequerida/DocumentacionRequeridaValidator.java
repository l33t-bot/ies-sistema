package ar.edu.ies.backend.application.documentacionRequerida;

import ar.edu.ies.backend.exception.ValidacionException;

public class DocumentacionRequeridaValidator {

	/*
	 * CORREGIR EN EL PROXÍMO MÓDULO
	 * ESTA CLASE NO TIENE QUE TENER ACCESO A REPOSITORY, SOLO VALIDACIÓNES 
	*/
	
    // =========================
    // VALIDACIÓN DE FORMATO
    // =========================
    
    public void validarId(Long id) {
    	
    	if(id == null)
    		throw new ValidacionException("El ID es obligatorio");
    }
    
    public void validarNombre(String nombre) {
    	
    	if (nombre == null || nombre.isEmpty())
    		throw new ValidacionException("El nombre es obligatorio");
    }
    
    public void validarTipoInscripcion(Boolean esReinscripcion) {
    	
    	if (esReinscripcion == null)
    		throw new ValidacionException("Debe indicar si es reinscripción");
    }
    
    public void validarObligatorio(Boolean obligatorio) {
    	
    	if (obligatorio == null)
    		throw new ValidacionException("El estado 'obligatorio' es obligatorio");
    }
    
    public void validarAplicarInscripcionInicial(Boolean aplicaInicial) {
    	
    	if (aplicaInicial == null)
    		throw new ValidacionException("El estado 'aplicaInscripcionInicial' es obligatorio");
    }
    
    public void validarAplicaReinscripcion(Boolean aplicaReinscripcion) {
    	
    	if (aplicaReinscripcion == null)
    		throw new ValidacionException("El estado 'aplicaReinscripcion' es obligatorio");
    }
}
