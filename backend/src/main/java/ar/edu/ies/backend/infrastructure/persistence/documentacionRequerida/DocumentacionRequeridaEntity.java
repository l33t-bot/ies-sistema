package ar.edu.ies.backend.infrastructure.persistence.documentacionRequerida;

import jakarta.persistence.*;

@Entity
@Table(name = "documentacion_requerida")
public class DocumentacionRequeridaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_documento")
	private Long idDocumento;
	
	@Column(name = "nombre_documento", nullable = false, length = 150)
	private String nombreDocumento;
	
	@Column(name ="obligatorio", nullable = false)
	private Boolean obligatorio;
	
	@Column(name = "aplica_inscripcion_inicial", nullable = false)
	private Boolean aplicaInscripcion;
	
	@Column(name = "aplica_reinscripcion", nullable = false)
	private Boolean aplicaReinscripcion;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	// =========================
    // GETTERS
    // =========================
	
	public Long getIdDocumento() { return idDocumento; }

	public String getNombreDocumento() { return nombreDocumento; }

	public Boolean getObligatorio() { return obligatorio; }

	public Boolean getAplicaInscripcion() { return aplicaInscripcion; }

	public Boolean getAplicaReinscripcion() { return aplicaReinscripcion; }

	public String getDescripcion() { return descripcion; }
	
	// =========================
    // SETTERS
    // =========================
	
	public void setIdDocumento(Long idDocumento) { this.idDocumento = idDocumento; }

	public void setNombreDocumento(String nombreDocumento) { this.nombreDocumento = nombreDocumento; }

	public void setObligatorio(Boolean obligatorio) { this.obligatorio = obligatorio; }

	public void setAplicaInscripcion(Boolean aplicaInscripcion) { this.aplicaInscripcion = aplicaInscripcion; }

	public void setAplicaReinscripcion(Boolean aplicaReinscripcion) { this.aplicaReinscripcion = aplicaReinscripcion; }

	public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}
