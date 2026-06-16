package ar.edu.ies.backend.infrastructure.persistence.documentacionEntregada;

import java.time.LocalDate;

import ar.edu.ies.backend.domain.documentacionRequerida.DocumentacionRequerida;
import ar.edu.ies.backend.domain.inscripcion.Inscripcion;
import jakarta.persistence.*;

@Entity
@Table(name = "documentacion_entregada")
public class DocumentacionEntregadaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_entrega")
	private Long idEntrega;
	
	// RELACIÓN CON FK
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id_inscripcion", nullable = false)
	private Inscripcion inscripcion;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id_documento", nullable = false)
	private DocumentacionRequerida documento;
	
	@Column(name = "entregado", nullable = false)
	private Boolean entregado;
	
	@Column(name = "fecha_entrega", updatable = false)
	private LocalDate fechaEntrega;
	
	@Column(name = "valido", nullable = false)
	private Boolean valido;
	
	@Column(name = "observaciones")
	private String observaciones;
	
	@Column(name = "ruta_archivo", length = 255)
	private String rutaArchivo;
	
	public DocumentacionEntregadaEntity() {}
	
	@PrePersist
	protected void onCreate() {
		
		if (this.fechaEntrega == null)
			this.fechaEntrega = LocalDate.now();
	}

	// =========================
    // SETTERS
    // =========================

	public void setIdEntrega(Long idEntrega) {
		this.idEntrega = idEntrega;
	}

	public void setInscripcion(Inscripcion inscripcion) {
		this.inscripcion = inscripcion;
	}

	public void setDocumento(DocumentacionRequerida documento) {
		this.documento = documento;
	}

	public void setEntregado(Boolean entregado) {
		this.entregado = entregado;
	}

	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public void setValido(Boolean valido) {
		this.valido = valido;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public void setRutaArchivo(String rutaArchivo) {
		this.rutaArchivo = rutaArchivo;
	}

	// =========================
    // GETTERS
    // =========================

	public Long getIdEntrega() {
		return idEntrega;
	}

	public Inscripcion getInscripcion() {
		return inscripcion;
	}

	public DocumentacionRequerida getDocumento() {
		return documento;
	}

	public Boolean getEntregado() {
		return entregado;
	}

	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}

	public Boolean getValido() {
		return valido;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public String getRutaArchivo() {
		return rutaArchivo;
	}
}
