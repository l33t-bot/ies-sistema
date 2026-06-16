package ar.edu.ies.backend.domain.inscripcion;

import java.time.LocalDateTime;

import ar.edu.ies.backend.exception.ValidacionException;

public class Inscripcion {

	private Long idInscripcion;
	private Long idEstudiante;
	private Long idPeriodo;
	
	private TipoInscripcion tipoInscripcion;
	private LocalDateTime fechaInscripcionOnline;
	private LocalDateTime fechaEntregaDocumentos;
	private EstadoInscripcion estadoInscripcion;
	private Integer anioQueCursa;
	private String numeroInscripcion;
	
	private String observaciones;
	
	// =========================
	// CONSTRUCTOR (CREACIÓN)
	// =========================
	
	public Inscripcion(
			Long idEstudiante, Long idPeriodo,
			TipoInscripcion tipoInscripcion,
			Integer anioQueCursa
	) {
		validarEstudiante(idEstudiante);
		validarPeriodo(idPeriodo);
		validarTipoInscripcion(tipoInscripcion);
		ValidarAnioQueCursa(anioQueCursa);
		
		this.idEstudiante = idEstudiante;
		this.idPeriodo = idPeriodo;
		this.tipoInscripcion = tipoInscripcion;
		this.anioQueCursa = anioQueCursa;
		
		this.fechaInscripcionOnline = LocalDateTime.now();
		this.fechaEntregaDocumentos = null;
		this.estadoInscripcion = EstadoInscripcion.PENDIENTE;
	}
	
	// =========================
	// CONSTRUCTOR PARA MAPPER
	// =========================
	
	public Inscripcion(
			Long idInscripcion,
			Long idEstudiante, Long idPeriodo,
			TipoInscripcion tipoInscripcion,
			LocalDateTime fechaInscripcionOnline,
			LocalDateTime fechaEntregaDocumentos,
			EstadoInscripcion estadoInscripcion,
			Integer anioQueCursa, String numeroInscripcion,
			String observaciones
	) {
		validarInscripcion(idInscripcion);
		validarEstudiante(idEstudiante);
		validarPeriodo(idPeriodo);
		
		validarTipoInscripcion(tipoInscripcion);
		validarFechaInscripcionOnline(fechaInscripcionOnline);
		ValidarAnioQueCursa(anioQueCursa);
		
		this.idInscripcion = idInscripcion;
		this.idEstudiante = idEstudiante;
		this.idPeriodo = idPeriodo;
		this.tipoInscripcion = tipoInscripcion;
		this.fechaInscripcionOnline = LocalDateTime.now();
		this.fechaEntregaDocumentos = null;
		this.estadoInscripcion = estadoInscripcion != null
				? estadoInscripcion
				: EstadoInscripcion.PENDIENTE;
		this.anioQueCursa = anioQueCursa;
		this.numeroInscripcion = numeroInscripcion;
		this.observaciones = observaciones;
	}
	
	// =========================
    // COMPORTAMIENTO
    // =========================
	
	public void cambiarIdInscripcion(Long idInscripcion) {
		
		validarInscripcion(idInscripcion);
		this.idInscripcion = idInscripcion;
	}
	
	public void cambiarIdEstudiante(Long idEstudiante) {
		
		validarEstudiante(idEstudiante);
		this.idEstudiante = idEstudiante;
	}
	
	public void cambiarIdPeriodo(Long idPeriodo) {
		
		validarPeriodo(idPeriodo);
		this.idPeriodo = idPeriodo;
	}
	
	public void cambiarTipoInscripcion(TipoInscripcion tipoInscripcion) {
		
		validarTipoInscripcion(tipoInscripcion);
		
		this.tipoInscripcion = tipoInscripcion;
	}
	
	public void cambiarAnioQueCursa(Integer anio) {
		
		ValidarAnioQueCursa(anio);
		
		this.anioQueCursa = anio;
	}
	
	public void cambiarObservaciones(String observacion) {
		
		this.observaciones = observacion;
	}
	
	public void cambiarFechaInscripcionOnline(LocalDateTime fecha) {
		
		validarFechaInscripcionOnline(fecha);
		
		this.fechaInscripcionOnline = fecha;
	}
	
	public void cambiarFechaEntregaDocumentos(LocalDateTime fecha) {
		
		this.fechaEntregaDocumentos = fecha;
	}
	
	public void cambiarNumeroInscripcion(String numeroInscripcion) {
		
		validarNumeroInscripcion(numeroInscripcion);
		
		this.numeroInscripcion = numeroInscripcion;
	}
	
	// Evento de negocio
	public void registrarEntregaDocumentos(LocalDateTime fechaEntregaDocumentos) {
		if (fechaEntregaDocumentos == null)
			this.fechaEntregaDocumentos = fechaEntregaDocumentos;
	}
	
	// Reglas de negocio
	public void confirmar() {
		
		if (this.fechaEntregaDocumentos == null)
			throw new ValidacionException(
					"No se puede confirmar la inscripción sin entrega de documentos"
		);
		
		this.estadoInscripcion = EstadoInscripcion.CONFIRMADO;
	}
	
	public void rechazar(String motivo) {
		
		this.estadoInscripcion = EstadoInscripcion.RECHAZADO;
		this.observaciones = motivo;
	}
	
	// =========================
    // GETTERS
    // =========================
	
	public Long getIdInscripcion() { return idInscripcion; }

	public Long getIdEstudiante() { return idEstudiante; }

	public Long getIdPeriodo() { return idPeriodo; }

	public TipoInscripcion getTipoInscripcion() { return tipoInscripcion; }

	public LocalDateTime getFechaInscripcionOnline() { return fechaInscripcionOnline; }

	public LocalDateTime getFechaEntregaDocumentos() { return fechaEntregaDocumentos; }

	public EstadoInscripcion getEstadoInscripcion() { return estadoInscripcion; }

	public Integer getAnioQueCursa() { return anioQueCursa; }

	public String getNumeroInscripcion() { return numeroInscripcion; }

	public String getObservaciones() { return observaciones; }
	
	// =========================
    // VALIDACIONES PRIVADAS
    // =========================
	
	private void validarInscripcion(Long idInscripcion) {
		if (idInscripcion == null)
			throw new ValidacionException("La inscripcion es obligatoria");
	}

	private void validarEstudiante(Long idEstudiante) {
		if (idEstudiante == null)
			throw new ValidacionException("El estudiante es obligatorio");
	}
	
	private void validarPeriodo(Long idPeriodo) {
		if (idPeriodo == null)
			throw new ValidacionException("El periodo es obligatorio");
	}
	
	private void validarTipoInscripcion(TipoInscripcion tipoInscripcion) {
		if (tipoInscripcion == null)
			throw new ValidacionException("El tipo de inscripcion es obligatorio");
	}
	
	private void validarFechaInscripcionOnline(LocalDateTime fechaInscripcionOnline) {
		if (fechaInscripcionOnline == null)
			throw new ValidacionException("La fecha de inscripcion online es obligatoria");
	}
	
	private void ValidarAnioQueCursa(Integer anioQueCursa) {
		if (anioQueCursa == null)
			throw new ValidacionException("El año que cursa es obligatorio");
		
		if (anioQueCursa < 1 || anioQueCursa > 3)
			throw new ValidacionException("Año que cursa inválido");
	}
	
	private void validarNumeroInscripcion(String numero) {
		
		if (numero == null || numero.trim().isEmpty())
			throw new ValidacionException("El número de inscripción es obligatorio");
	}
}
