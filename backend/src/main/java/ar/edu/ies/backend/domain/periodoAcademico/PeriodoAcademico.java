package ar.edu.ies.backend.domain.periodoAcademico;

import java.time.LocalDate;

import ar.edu.ies.backend.exception.ValidacionException;

public class PeriodoAcademico {

	// Tengo que agregar un atributo anio para busquedas por año
	private Long idPeriodoAcademico;
	
	private LocalDate fechaInicioInscripcion;
	private LocalDate fechaFinInscripcion;
	
	private LocalDate fechaRecepcionDocumentosDiciembreInicio;
	private LocalDate fechaRecepcionDocumentosDiciembreFin;
	
	private LocalDate fechaRecepcionDocumentosFebreroInicio;
	private LocalDate fechaRecepcionDocumentosFebreroFin;
	
	private LocalDate fechaReinscripcionInicio;
	private LocalDate fechaReinscripcionFin;
	
	private Boolean activo;

	// =========================
	// CONSTRUCTOR (CREACIÓN)
	// =========================
	public PeriodoAcademico(
			LocalDate fechaInicioInscripcion,
			LocalDate fechaFinInscripcion,
			LocalDate fechaRecepcionDocumentosDiciembreInicio,
			LocalDate fechaRecepcionDocumentosDiciembreFin,
			LocalDate fechaRecepcionDocumentosFebreroInicio,
			LocalDate fechaRecepcionDocumentosFebreroFin,
			LocalDate fechaReinscripcionInicio,
			LocalDate fechaReinscripcionFin,
			Boolean activo
	) {
		validarRangoFechas(
				fechaInicioInscripcion,
				fechaFinInscripcion,
				"Período de Inscripción");
		
		validarRangoFechas(
				fechaRecepcionDocumentosDiciembreInicio,
                fechaRecepcionDocumentosDiciembreFin,
                "Recepción de documentos de diciembre");
		
		validarRangoFechas(
                fechaRecepcionDocumentosFebreroInicio,
                fechaRecepcionDocumentosFebreroFin,
                "Recepción de documentos de febrero");
		
		validarRangoFechas(
                fechaReinscripcionInicio,
                fechaReinscripcionFin,
                "Período de reinscripción"
        );
		
		this.fechaInicioInscripcion = fechaInicioInscripcion;
		this.fechaFinInscripcion = fechaFinInscripcion;
		
		this.fechaRecepcionDocumentosDiciembreInicio = fechaRecepcionDocumentosDiciembreInicio;
		this.fechaRecepcionDocumentosDiciembreFin = fechaRecepcionDocumentosDiciembreFin;
		
		this.fechaRecepcionDocumentosFebreroInicio = fechaRecepcionDocumentosFebreroInicio;
		this.fechaRecepcionDocumentosFebreroFin = fechaRecepcionDocumentosFebreroFin;
		
		this.fechaReinscripcionInicio = fechaReinscripcionInicio;
		this.fechaReinscripcionInicio = fechaReinscripcionFin;
		
		this.activo = (activo != null)
				? activo
				: true;
	}
	
	// =========================
	// CONSTRUCTOR PARA MAPPER
	// =========================
	
	public PeriodoAcademico(
			Long idPeriodoAcademico,
			LocalDate fechaInicioInscripcion,
			LocalDate fechaFinInscripcion,
			LocalDate fechaRecepcionDocumentosDiciembreInicio,
			LocalDate fechaRecepcionDocumentosDiciembreFin,
			LocalDate fechaRecepcionDocumentosFebreroInicio,
			LocalDate fechaRecepcionDocumentosFebreroFin,
			LocalDate fechaReinscripcionInicio,
			LocalDate fechaReinscripcionFin,
			Boolean activo
	) {
		// VALIDCIONES
		
		this.idPeriodoAcademico = idPeriodoAcademico;
		this.fechaInicioInscripcion = fechaInicioInscripcion;
		this.fechaFinInscripcion = fechaFinInscripcion;
		this.fechaRecepcionDocumentosDiciembreInicio = fechaRecepcionDocumentosDiciembreInicio;
		this.fechaRecepcionDocumentosDiciembreFin = fechaRecepcionDocumentosDiciembreFin;
		this.fechaRecepcionDocumentosFebreroInicio = fechaRecepcionDocumentosFebreroInicio;
		this.fechaRecepcionDocumentosFebreroFin = fechaRecepcionDocumentosFebreroFin;
		this.fechaReinscripcionInicio = fechaReinscripcionInicio;
		this.fechaReinscripcionInicio = fechaReinscripcionFin;
		this.activo = true;
	}
	
	// =========================
	// COMPORTAMIENTO
	// =========================
	
	public void cambiarIdPeriodoAcademico(Long idPeriodoAcademico) {
		this.idPeriodoAcademico = idPeriodoAcademico;
	}
	
	public void cambiarFechaInicioInscripcion(LocalDate fecha) {
        validarNoNulo(fecha, "La fecha de inicio de inscripción es obligatoria");
        validarRangoFechas(fecha, this.fechaFinInscripcion,
                "Período de inscripción");
        this.fechaInicioInscripcion = fecha;
    }
	
	public void cambiarFechaFinInscripcion(LocalDate fecha) {
        validarNoNulo(fecha, "La fecha de fin de inscripción es obligatoria");
        validarRangoFechas(this.fechaInicioInscripcion, fecha,
                "Período de inscripción");
        this.fechaFinInscripcion = fecha;
    }
	
	public void cambiarFechaRecepcionDocumentosDiciembreInicio(LocalDate fecha) {
        validarNoNulo(fecha,
                "La fecha de inicio de recepción de documentos de diciembre es obligatoria");
        validarRangoFechas(
                fecha,
                this.fechaRecepcionDocumentosDiciembreFin,
                "Recepción de documentos de diciembre"
        );
        this.fechaRecepcionDocumentosDiciembreInicio = fecha;
    }
	
	public void cambiarFechaRecepcionDocumentosDiciembreFin(LocalDate fecha) {
        validarNoNulo(fecha,
                "La fecha de fin de recepción de documentos de diciembre es obligatoria");
        validarRangoFechas(
                this.fechaRecepcionDocumentosDiciembreInicio,
                fecha,
                "Recepción de documentos de diciembre"
        );
        this.fechaRecepcionDocumentosDiciembreFin = fecha;
    }
	
	public void cambiarFechaRecepcionDocumentosFebreroInicio(LocalDate fecha) {
        validarNoNulo(fecha,
                "La fecha de inicio de recepción de documentos de febrero es obligatoria");
        validarRangoFechas(
                fecha,
                this.fechaRecepcionDocumentosFebreroFin,
                "Recepción de documentos de febrero"
        );
        this.fechaRecepcionDocumentosFebreroInicio = fecha;
    }
	
	public void cambiarFechaRecepcionDocumentosFebreroFin(LocalDate fecha) {
        validarNoNulo(fecha,
                "La fecha de fin de recepción de documentos de febrero es obligatoria");
        validarRangoFechas(
                this.fechaRecepcionDocumentosFebreroInicio,
                fecha,
                "Recepción de documentos de febrero"
        );
        this.fechaRecepcionDocumentosFebreroFin = fecha;
    }
	
	public void cambiarFechaReinscripcionInicio(LocalDate fecha) {
        validarNoNulo(fecha,
                "La fecha de inicio de reinscripción es obligatoria");
        validarRangoFechas(
                fecha,
                this.fechaReinscripcionFin,
                "Período de reinscripción"
        );
        this.fechaReinscripcionInicio = fecha;
    }
	
	public void cambiarFechaReinscripcionFin(LocalDate fecha) {
        validarNoNulo(fecha,
                "La fecha de fin de reinscripción es obligatoria");
        validarRangoFechas(
                this.fechaReinscripcionInicio,
                fecha,
                "Período de reinscripción"
        );
        this.fechaReinscripcionFin = fecha;
    }
	
	public void activar() {
		this.activo = true;
	}
	
	public void desactivar() {
		this.activo = false;
	}
	
	public boolean esActivo() {
		return Boolean.TRUE.equals(activo);
	}

	// =========================
    // GETTERS
    // =========================
	
	public Long getIdPeriodoAcademico() {
		return idPeriodoAcademico;
	}

	public LocalDate getFechaInicioInscripcion() {
		return fechaInicioInscripcion;
	}

	public LocalDate getFechaFinInscripcion() {
		return fechaFinInscripcion;
	}

	public LocalDate getFechaRecepcionDocumentosDiciembreInicio() {
		return fechaRecepcionDocumentosDiciembreInicio;
	}

	public LocalDate getFechaRecepcionDocumentosDiciembreFin() {
		return fechaRecepcionDocumentosDiciembreFin;
	}

	public LocalDate getFechaRecepcionDocumentosFebreroInicio() {
		return fechaRecepcionDocumentosFebreroInicio;
	}

	public LocalDate getFechaRecepcionDocumentosFebreroFin() {
		return fechaRecepcionDocumentosFebreroFin;
	}

	public LocalDate getFechaReinscripcionInicio() {
		return fechaReinscripcionInicio;
	}

	public LocalDate getFechaReinscripcionFin() {
		return fechaReinscripcionFin;
	}

	public Boolean getActivo() {
		return activo;
	}
	
	// =========================
    // VALIDACIONES PRIVADAS
    // =========================
	
	private void validarNoNulo(LocalDate fecha, String mensaje) {
		if (fecha == null)
			throw new ValidacionException(mensaje);
	}
	
	private void validarRangoFechas(
			LocalDate fechaInicio,
			LocalDate fechaFin,
			String descripcion
	) {
		validarNoNulo(fechaInicio,
				"La fecha de inicio de " + descripcion + " es obligatoria");
		
		if (fechaInicio.isAfter(fechaFin)) {
			throw new ValidacionException(
					"La fecha de inicio de " + descripcion +
					" no puede ser posterior a la fecha de fin");
		}
	}
}
