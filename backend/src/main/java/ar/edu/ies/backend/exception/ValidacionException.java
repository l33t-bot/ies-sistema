package ar.edu.ies.backend.exception;

// // Excepción lanzada cuando los datos no son válidos
public class ValidacionException extends RuntimeException {

	public ValidacionException(String mensaje) {
		super(mensaje);
	}
}
