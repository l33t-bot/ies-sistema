package ar.edu.ies.backend.infrastructure.controller.error;

import java.time.LocalDateTime;

public class ApiError {

	private String mensaje;
	private int codigo;
	private String error;
	private LocalDateTime fecha;
	
	public ApiError(String mensaje, int codigo, String error) {
		this.mensaje = mensaje;
		this.codigo = codigo;
		this.error = error;
	}

	public String getMensaje() { return mensaje; }

	public int getCodigo() { return codigo; }

	public String getError() { return error; }

	public LocalDateTime getFecha() { return fecha; }
}
