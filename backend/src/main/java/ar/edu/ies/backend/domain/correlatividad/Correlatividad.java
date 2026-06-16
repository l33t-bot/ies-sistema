package ar.edu.ies.backend.domain.correlatividad;

public class Correlatividad {

	private Long idCorrelativa;
	private Long idMateriaPrincipal;
	private Long idMateriaRequisito;
	private TipoCorrelativa tipoCorrelativa;
	private Boolean activa;
	
	public Correlatividad(
			Long idCorrelativa,
			Long idMateriaPrincipal,
			Long idMateriaRequisito,
			TipoCorrelativa tipoCorrelativa,
			Boolean activa) {
		
		validarMateriaPrincipal(idMateriaPrincipal);
		validarMateriaRequisito(idMateriaRequisito);
		validarQueNoSeaLaMismaMateria(idMateriaPrincipal, idMateriaRequisito);
		validarTipoCorrelativa(tipoCorrelativa);
		
		this.idCorrelativa = idCorrelativa;
		this.idMateriaPrincipal = idMateriaPrincipal;
		this.idMateriaRequisito = idMateriaRequisito;
		this.tipoCorrelativa = tipoCorrelativa;
		this.activa = activa != null
				? activa
				: true;
	}
	
	// =========================
	// COMPORTAMIENTO
	// =========================
		
	public void cambiarIdMateriaPrincipal(Long idMateriaPrincipal) {
		
		validarMateriaPrincipal(idMateriaPrincipal);
		this.idMateriaPrincipal = idMateriaPrincipal;
	}
	
	public void cambiarIdMateriaRequisito(Long idMateriaRequisito) {
		
		validarMateriaRequisito(idMateriaRequisito);
		this.idMateriaRequisito = idMateriaRequisito;
	}
	
	public void cambiarTipoCorrelativa(TipoCorrelativa tipoCorrelativa) {
		
		validarTipoCorrelativa(tipoCorrelativa);
		this.tipoCorrelativa = tipoCorrelativa;
	}
	
	public void activar() {
		
		this.activa = true;
	}
	
	public void desactivar() {
		
		this.activa = false;
	}
	
	public void actualizarDatos(Long idMateriaPrincipal,
								Long idMateriaRequisito,
								TipoCorrelativa tipoCorrelativa,
								Boolean activa) {
		
		validarMateriaPrincipal(idMateriaPrincipal);
	    validarMateriaRequisito(idMateriaRequisito);
	    validarQueNoSeaLaMismaMateria(idMateriaPrincipal, idMateriaRequisito);
	    validarTipoCorrelativa(tipoCorrelativa);
	    
		this.idMateriaPrincipal = idMateriaPrincipal;
		this.idMateriaRequisito = idMateriaRequisito;
		this.tipoCorrelativa = tipoCorrelativa;
		this.activa = activa;
	}
	
	// =========================
    // GETTERS
    // =========================

	public Long getIdCorrelatividad() { return idCorrelativa; }
	public Long getIdMateriaPrincipal() { return idMateriaPrincipal; }
	public Long getIdMateriaRequisito() { return idMateriaRequisito; }
	public TipoCorrelativa getTipoCorrelativa() { return tipoCorrelativa; }
	public Boolean getActiva() { return activa; }
	
	// =========================
    // VALIDACIONES PRIVADAS
    // =========================
	
	private void validarMateriaPrincipal(Long idMateriaPrincipal) {
		
		if(idMateriaPrincipal == null)
			throw new IllegalArgumentException("La materia principal es obligatoria");
	}

	private void validarMateriaRequisito(Long idMateriaRequisito) {
		
		if (idMateriaRequisito == null)
			throw new IllegalArgumentException("La materia requisito es obligatoria");
	}
	
	private void validarTipoCorrelativa(TipoCorrelativa tipoCorrelativa) {
		
		if(tipoCorrelativa == null)
			throw new IllegalArgumentException("Tipo de correlativa obligatoria");
	}
	
	private void validarQueNoSeaLaMismaMateria(Long principal, Long requisito) {
		
		if (principal != null && principal.equals(requisito))
			throw new IllegalArgumentException("Una materia no puede ser correlativa de si misma");
	}
}
