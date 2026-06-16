package ar.edu.ies.backend.exception;

//Excepción lanzada cuando intentamos crear algo que ya existe
public class RecursoDuplicadoException extends RuntimeException {
	public RecursoDuplicadoException(String mensaje) {
		super(mensaje);
	}
}
