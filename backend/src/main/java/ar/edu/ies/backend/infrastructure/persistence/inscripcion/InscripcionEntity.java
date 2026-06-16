package ar.edu.ies.backend.infrastructure.persistence.inscripcion;

import java.time.LocalDateTime;

import ar.edu.ies.backend.domain.inscripcion.EstadoInscripcion;
import ar.edu.ies.backend.domain.inscripcion.TipoInscripcion;
import ar.edu.ies.backend.infrastructure.persistence.estudiante.EstudianteEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "inscripciones")
public class InscripcionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_inscripcion")
	private Long idInscripcion;
	
	// RELACIÓN CON FK
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_estudiante", nullable = false)
	private EstudianteEntity estudiante;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_periodo", nullable = false)
	private PeriodoEntity periodo;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_inscripcion", nullable = false)
	private TipoInscripcion tipoInscripcion;
	
	@Column(name = "fecha_inscripcion_online", nullable = false)
	private LocalDateTime fechaInscripcionOnline;
	
	@Column(name = "fecha_entrega_documentos")
	private LocalDateTime fechaEntregaDocumentos;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "estado", nullable = false)
	private EstadoInscripcion estadoInscripcion;
	
	@Column(name = "anio_que_cursa", nullable = false)
	private Integer anioQueCursa;
	
	@Column(name = "numero_inscripcion", nullable = false, unique = true)
	private String numeroInscripcion;
	
	@Column(name = "observaciones")
	private String observaciones;
	
	protected InscripcionEntity() {
		
	}

	// =========================
    // SETTERS
    // =========================
	
	public void setIdInscripcion(Long idInscripcion) {
		this.idInscripcion = idInscripcion;
	}

	public void setEstudiante(EstudianteEntity estudiante) {
		this.estudiante = estudiante;
	}

	public void setPeriodo(PeriodoEntity periodo) {
		this.periodo = periodo;
	}

	public void setTipoInscripcion(TipoInscripcion tipoInscripcion) {
		this.tipoInscripcion = tipoInscripcion;
	}

	public void setFechaInscripcionOnline(LocalDateTime fechaInscripcionOnline) {
		this.fechaInscripcionOnline = fechaInscripcionOnline;
	}

	public void setFechaEntregaDocumentos(LocalDateTime fechaEntregaDocumentos) {
		this.fechaEntregaDocumentos = fechaEntregaDocumentos;
	}

	public void setEstadoInscripcion(EstadoInscripcion estadoInscripcion) {
		this.estadoInscripcion = estadoInscripcion;
	}

	public void setAnioQueCursa(Integer anioQueCursa) {
		this.anioQueCursa = anioQueCursa;
	}

	public void setNumeroInscripcion(String numeroInscripcion) {
		this.numeroInscripcion = numeroInscripcion;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	// =========================
    // GETTERS
    // =========================
	
	public Long getIdInscripcion() {
		return idInscripcion;
	}

	public EstudianteEntity getEstudiante() {
		return estudiante;
	}

	public PeriodoEntity getPeriodo() {
		return periodo;
	}

	public TipoInscripcion getTipoInscripcion() {
		return tipoInscripcion;
	}

	public LocalDateTime getFechaInscripcionOnline() {
		return fechaInscripcionOnline;
	}

	public LocalDateTime getFechaEntregaDocumentos() {
		return fechaEntregaDocumentos;
	}

	public EstadoInscripcion getEstadoInscripcion() {
		return estadoInscripcion;
	}

	public Integer getAnioQueCursa() {
		return anioQueCursa;
	}

	public String getNumeroInscripcion() {
		return numeroInscripcion;
	}

	public String getObservaciones() {
		return observaciones;
	}
}
