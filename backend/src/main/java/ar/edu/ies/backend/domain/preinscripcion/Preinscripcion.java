package ar.edu.ies.backend.domain.preinscripcion;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Preinscripcion {

	// DATOS TÉCNICOS
	private Long idPreinscripcion;
	private Long idCarrera;
	
	// DATOS PERSONALES (OBLIGATORIOS)
	private String apellido;
	private String nombres;
	private String dni;
	private LocalDate fechaNacimiento;
	private Integer edad;
	private String email; // OBLIGATORIO
	
	// DATOS PERSONALES
	private String lugarNacimiento;
	private String nacionalidad;
	
	// DATOS DE CONTACTO
	private String telefono;
	private String domicilio;
	private String localidad;
	
	// DATOS SECUNDARIO(ACADEMICO)
	private String secundarioEgresadoDe;
	private String secundarioTitulo;
	private Boolean secundarioDebeMaterias;
	private String secundarioMateriasAdeudadas;
	
	// DATOS DE SALUD
	private String saludAfeccion;
	private String grupoSanguineo;
	
	private EstadoPreinscripcion estado; // OBLIGATORIO
	
	private LocalDateTime fechaRegistro;
	
	// =========================
	// CONSTRUCTOR
	// =========================

	// PARA MAPPER
	public Preinscripcion(Long idPreinscripcion, Long idCarrera, String apellido,
			String nombres, String dni,	LocalDate fechaNacimiento,	Integer edad,
			String email, EstadoPreinscripcion estado, LocalDateTime fechaRegistro
	) {

		validarCarrera(idCarrera);
		validarApellido(apellido);
		validarNombres(nombres);
		validarDni(dni);
		validarEdad(edad);
		validarEmail(email);

		this.idPreinscripcion = idPreinscripcion;
		this.idCarrera = idCarrera;
		this.apellido = apellido;
		this.nombres = nombres;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = edad;
		this.email = email;
		this.estado = estado;
		this.fechaRegistro = fechaRegistro;
	}
	
	// CONSTRUCTOR PARA CREACIÓN
	public Preinscripcion(Long idCarrera, String apellido, String nombres, String dni,
							LocalDate fechaNacimiento, Integer edad, String email
	) {
	
		validarCarrera(idCarrera);
		validarApellido(apellido);
		validarNombres(nombres);
		validarDni(dni);
		validarFechaNacimiento(fechaNacimiento);
		validarEdad(edad);
		validarEmail(email);
		
		this.idPreinscripcion = null;
		this.idCarrera = idCarrera;
		this.apellido = apellido;
		this.nombres = nombres;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = edad;
		this.email = email;
		this.estado = EstadoPreinscripcion.PENDIENTE;
		this.fechaRegistro = null;
	}
	
	// =========================
	// COMPORTAMIENTO
	// =========================

	public void aprobar() {
		
		if (this.estado == EstadoPreinscripcion.APROBADO)
			throw new IllegalArgumentException("La preinscripción ya está aprobada");
		
		this.estado = EstadoPreinscripcion.APROBADO;
	}
	
	public void rechazar() {
		this.estado = EstadoPreinscripcion.RECHAZADO;
	}
	
	public void actualizarDatos(Long idCarrera, String apellido, String nombres, String dni,
								Integer edad, String email
	) {
		validarCarrera(idCarrera);
		validarApellido(apellido);
		validarNombres(nombres);
		validarDni(dni);
		validarEdad(edad);
		validarEmail(email);
		
		this.idCarrera = idCarrera;
		this.apellido = apellido;
		this.nombres = nombres;
		this.dni = dni;
		this.edad = edad;
		this.email = email;
	}
	
	// METEODO DATOS DE CONTACTOS
	public void actualizarContacto(String telefono, String domicilio, String localidad) {
		
		validarTelefono(telefono);
		
		this.telefono = telefono;
		this.domicilio = domicilio;
		this.localidad = localidad;
	}
	
	// METODO DATOS SECUNDARIO(ACADEMICOS)
	public void completarDatosSecundario(
			String egresadoDe, String titulo,
			Boolean debeMaterias, String materiasAdeudadas
	) {
		
		if (debeMaterias != null && debeMaterias && (materiasAdeudadas == null || materiasAdeudadas.trim().isEmpty()))
			throw new IllegalArgumentException("Debe especificar materias adeudadas");
		
		this.secundarioEgresadoDe = egresadoDe;
		this.secundarioTitulo = titulo;
		this.secundarioDebeMaterias = debeMaterias;
		this.secundarioMateriasAdeudadas = materiasAdeudadas;
	}
	
	// MÉTODO DATOS DE SALUD
	public void completarDatosSalud(String afeccion, String grupoSanguineo) {
		
		this.saludAfeccion = afeccion;
		this.grupoSanguineo = grupoSanguineo;
	}
	
	// MÉTODOS DATOS PERSONALES NO OBLIGATORIOS
	public void completarDatosPersonales(String lugarNacimiento, String nacionalidad) {
		
		this.lugarNacimiento = lugarNacimiento;
		this.nacionalidad = nacionalidad;
	}
	
	// MÉTODO PARA FECHA NACIMIENTO
	public void actualizarFechaNacimiento(LocalDate fechaNacimiento) {
		
		if (fechaNacimiento == null) {
			throw new IllegalArgumentException("Fecha de nacimiento obligatoria");
		}
		
		this.fechaNacimiento = fechaNacimiento;
	}
	
	// =========================
	// GETTERS
	// =========================
	
	public Long getIdPreinscripcion() { return idPreinscripcion; }
	public Long getIdCarrera() { return idCarrera; }
	public String getApellido() { return apellido; }
	public String getNombres() { return nombres; }
	public String getDni() { return dni; }
	public LocalDate getFechaNacimiento() { return fechaNacimiento; }
	public Integer getEdad() { return edad; }
	public String getEmail() { return email; }
	public EstadoPreinscripcion getEstado() { return estado; }
	public LocalDateTime getFechaRegistro() { return fechaRegistro; }
	
	// =========================
	// VALIDACIONES
	// =========================
	
	private void validarCarrera(Long idCarrera) {
		if (idCarrera == null)
			throw new IllegalArgumentException("La carrera es obligatoria");
	}
	
	private void validarApellido(String apellido) {
		if (apellido == null || apellido.trim().isEmpty())
			throw new IllegalArgumentException("El apellido es obligatorio");
	}
	
	private void validarNombres(String nombres) {
		if (nombres == null || nombres.trim().isEmpty())
			throw new IllegalArgumentException("Los nombres son obligatorios");
	}
	
	private void validarDni(String dni) {
		if (dni == null || dni.trim().isEmpty())
			throw new IllegalArgumentException("El DNI es obligatorio");
	}
	
	private void validarFechaNacimiento(LocalDate fecha) {
	    if (fecha == null)
	        throw new IllegalArgumentException("Fecha de nacimiento obligatoria");
	}
	
	private void validarEdad(Integer edad) {
		if (edad == null || edad <= 0)
			throw new IllegalArgumentException("Edad inválida");
	}
	
	private void validarEmail(String email) {
		if(email == null || !email.contains("@"))
			throw new IllegalArgumentException("Email inválido");
	}
	
	private void validarTelefono(String telefono) {
		
		if (telefono != null && telefono.length() < 6)
			throw new IllegalArgumentException("Teléfono inválido");
	}
	
	private void validarNoAprobada() {
		
		if(this.estado == EstadoPreinscripcion.APROBADO)
			throw new IllegalArgumentException("No se puede modificar una preinscripción aprogada");
	}
}