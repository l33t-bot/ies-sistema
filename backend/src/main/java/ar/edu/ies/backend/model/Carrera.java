package ar.edu.ies.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "carreras")
public class Carrera {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_carrera")
	private Long idCarrera;
	
	@Column(name = "nombre", length = 150, nullable = false, unique = true)
	private String nombre;
	
	@Column(name = "codigo", length = 50)
	private String codigo;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "color_carpeta")
	private String colorCarpeta;
	
	@Column(name = "tiene_promocionales", nullable = false)
	private Boolean promocionales;
	
	@Column(name = "activa", nullable = false)
	private Boolean activa;
	
	//
	// getters setters
	//
	public Long getIdCarrera() {
		return idCarrera;
	}
	
	public void setIdCarrera(Long id_carrera) {
		this.idCarrera = id_carrera;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCodigo() {
	    return codigo;
	}

	public void setCodigo(String codigo) {
	    this.codigo = codigo;
	}
	
	public String getDescripcion() {
	    return descripcion;
	}

	
	public void setDescripcion(String descripcion) {
	    this.descripcion = descripcion;
	}
	
	public String getColorCarpeta() {
		return colorCarpeta;
	}
	
	public void setColorCarpeta(String colorCarpeta) {
		this.colorCarpeta = colorCarpeta;
	}
	
	public Boolean getPromocionales() {
		return promocionales;
	}
	
	public void setPromocionales(Boolean promocionales) {
		this.promocionales = promocionales;
	}
	
	public Boolean getActiva() {
		return activa;
	}
	
	public void setActiva(Boolean activa) {
		this.activa = activa;
	}
}
