package ar.edu.ies.backend.infrastructure.persistence.correlatividad;

import ar.edu.ies.backend.domain.correlatividad.TipoCorrelativa;
import jakarta.persistence.*;

@Entity
@Table(name = "correlatividades")
public class CorrelatividadEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_correlatividad", nullable = false)
	private Long idCorrelatividad;
	
	// Relaciones con FK
	@Column(name = "id_materia_principal", nullable = false)
	private Long idMateriaPrincipal;
	
	@Column(name = "id_materia_requisito", nullable = false)
	private Long idMateriaRequisito;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_correlativa", nullable = false)
	private TipoCorrelativa tipoCorrelativa;
	
	@Column(name = "activo", nullable = false)
	private Boolean activo;
	
	protected CorrelatividadEntity() {
		// CONSTRUCTOR VACÍO REQUERIDO POR JPA
	}
	
	// =========================
    // GETTERS Y SETTERS
    // =========================

	public Long getIdCorrelatividad() { return idCorrelatividad; }
	public void setIdCorrelatividad(Long idCorrelatividad) { this.idCorrelatividad = idCorrelatividad; }
	
	public Long getIdMateriaPrincipal() { return idMateriaPrincipal; }
	public void setIdMateriaPrincipal(Long idMateriaPrincipal) { this.idMateriaPrincipal = idMateriaPrincipal; }
	
	public Long getIdMateriaRequisito() { return idMateriaRequisito; }
	public void setIdMateriaRequisito(Long idMateriaRequisito) { this.idMateriaRequisito = idMateriaRequisito; }
	
	public TipoCorrelativa getTipoCorrelativa() { return tipoCorrelativa; }
	public void setTipoCorrelativa(TipoCorrelativa tipoCorrelativa) { this.tipoCorrelativa = tipoCorrelativa; }
	
	public Boolean getActivo() { return activo; }
	public void setActivo(Boolean activo) { this.activo = activo; }
}
