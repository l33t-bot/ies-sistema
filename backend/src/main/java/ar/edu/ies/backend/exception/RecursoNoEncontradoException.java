package ar.edu.ies.backend.exception;

// Excepción lanzada cuando buscamos algo que no existe
public class RecursoNoEncontradoException extends RuntimeException {
	
	public RecursoNoEncontradoException(String mensaje) {
		super(mensaje); // llama al constructor de RuntimeException
	}
}
