package ar.edu.ies.backend.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

// @RestControllerAdvice hace que esta clase intercepte todas las excepciones
// de todos los @RestController
@RestControllerAdvice
public class GlobalExceptionHandler {
	
	// Método auxiliar para crear la respuesta a error
	private Map<String, Object> crearRespuestaError(String mensaje, HttpStatus status){
		Map<String, Object> respuesta = new HashMap<>();
		respuesta.put("timestamp", LocalDateTime.now());
		respuesta.put("mensaje", mensaje);
		respuesta.put("status", status.value());
		return respuesta;
	}
	
	// Mensaje RecursoNoEncontradoException -> HTTP 404 (Not Found)
	@ExceptionHandler(RecursoNoEncontradoException.class)
	public ResponseEntity<Map<String, Object>> manejarRecursoNoEncontrado(
			RecursoNoEncontradoException ex) {
		Map<String, Object> respuesta = crearRespuestaError(
			ex.getMessage(),
			HttpStatus.NOT_FOUND
		);
		return new ResponseEntity<>(respuesta, HttpStatus.NOT_FOUND);
	}
	
	// Maneja RecursoDuplicadoException -> HTTP 409 (Conflict)
	@ExceptionHandler(RecursoDuplicadoException.class)
	public ResponseEntity<Map<String, Object>> manejarRecursoDuplicado(
			RecursoDuplicadoException ex) {
		
		Map<String, Object> respuesta = crearRespuestaError(
			ex.getMessage(),
			HttpStatus.CONFLICT
		);
		
		return new ResponseEntity<>(respuesta, HttpStatus.CONFLICT);
	}
	
	// Maneja ValidacionException -> HTTP 400 (Bad Request)
	@ExceptionHandler(ValidacionException.class)
	public ResponseEntity<Map<String, Object>> manejarValidacion(
			ValidacionException ex) {
		
		Map<String, Object> respuesta = crearRespuestaError(
			ex.getMessage(),
			HttpStatus.BAD_REQUEST
		);
		
		return new ResponseEntity<>(respuesta, HttpStatus.BAD_REQUEST);
	}
	
	// Maneja cualquier otra excepción no prevista -> HTTP 500 (Internal Server Error)
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Map<String, Object>> manejarExceptionGeneral(
			Exception ex) {
		
		Map<String, Object> respuesta = crearRespuestaError(
			"Error interno del servidor: " + ex.getMessage(),
			HttpStatus.INTERNAL_SERVER_ERROR
		);
		
		return new ResponseEntity<>(respuesta, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
