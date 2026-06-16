package ar.edu.ies.backend.infrastructure.controller.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ar.edu.ies.backend.exception.*;

public class GlobalExceptionHandler {

	// =========================
	// VALIDACION
	// =========================
	
	@ExceptionHandler(ValidacionException.class)
	public ResponseEntity<ApiError> manejarValidacion(ValidacionException ex) {
		return new ResponseEntity<>(
				new ApiError(ex.getMessage(), 400, "BAD_REQUEST"),
				HttpStatus.BAD_REQUEST
		);
	}
	
	// =========================
	// NO ENCONTRADO
	// =========================
		
	@ExceptionHandler(RecursoNoEncontradoException.class)
	public ResponseEntity<ApiError> manejarNoEncontrado(RecursoNoEncontradoException ex) {
		return new ResponseEntity<>(
				new ApiError(ex.getMessage(), 404, "NOT_FOUND"),
				HttpStatus.NOT_FOUND
		);
	}
	
	// =========================
	// DUPLICADO
	// =========================
		
	@ExceptionHandler(RecursoDuplicadoException.class)
	public ResponseEntity<ApiError> manejarDuplicado(RecursoDuplicadoException ex) {
		return new ResponseEntity<>(
				new ApiError(ex.getMessage(), 409, "CONFLICT"),
				HttpStatus.CONFLICT
		);
	}
	
	// =========================
	// ERROR GENERAL
	// =========================
		
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ApiError> manejarGeneral(Exception ex) {
		return new ResponseEntity<>(
				new ApiError("Error interno del servidor", 500, "INTERNAL_SERVER_ERROR"),
				HttpStatus.INTERNAL_SERVER_ERROR
		);
	}
}
