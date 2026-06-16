package ar.edu.ies.backend.dto;

public class CarreraDto {
	
	private Long id_carrera;
	private String nombre;
	private String codigo;
	private String descripcion;
	private String colorCarpeta;
	private Boolean promocionales;
	private Boolean activa;
	
	// getters & setters
	public Long getId_carrera() { return id_carrera; }
	public void setId_carrera(Long id) { this.id_carrera = id; }
	
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	
	public String getCodigo() { return codigo; }
	public void setCodigo(String codigo) { this.codigo = codigo; }
	
	public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getColorCarpeta() { return colorCarpeta; }
    public void setColorCarpeta(String colorCarpeta) { this.colorCarpeta = colorCarpeta; }

    public Boolean getPromocionales() { return promocionales; }
    public void setPromocionales(Boolean promocionales) { this.promocionales = promocionales; }

    public Boolean getActiva() { return activa; }
    public void setActiva(Boolean activa) { this.activa = activa; }
}
