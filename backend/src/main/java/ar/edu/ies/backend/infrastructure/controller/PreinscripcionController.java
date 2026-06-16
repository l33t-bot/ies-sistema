package ar.edu.ies.backend.infrastructure.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import ar.edu.ies.backend.application.preinscripcion.*;
import ar.edu.ies.backend.domain.preinscripcion.Preinscripcion;
import ar.edu.ies.backend.infrastructure.controller.dto.PreinscripcionDto.PreinscripcionRequestDto;
import ar.edu.ies.backend.infrastructure.controller.dto.PreinscripcionDto.PreinscripcionResponseDto;


@RestController
@RequestMapping("/api/preinscripciones")
public class PreinscripcionController {

	private final CrearPreinscripcionUseCase crearUseCase;
	private final ActualizarPreinscripcionUseCase actualizarUseCase;
	private final ListarPreinscripcionesUseCase listarUseCase;
	//private final AprobarPreinscripcionUseCase aprobarUseCase;
	private final RechazarPreinscripcionUseCase rechazarUseCase;
	
	//private final ActualizarFechaNacimientoUseCase actualizarFechaNacimiento;
	//private final CompletarDatosContactoUseCase completarDatosContactorUseCase;
	//private final CompletarDatosPersonalesUseCase completarDatosPersonalesUseCase;
	//private final CompletarDatosSaludUseCase completarDatosSaludUseCase;
	//private final CompletarDatosSecundarioUseCase completarDatosSecundarioUseCase;
	
	public PreinscripcionController(
			
			CrearPreinscripcionUseCase crearUseCase,
			ActualizarPreinscripcionUseCase actualizarUseCase,
			ListarPreinscripcionesUseCase listarUseCase,
			AprobarPreinscripcionUseCase aprobarUseCase,
			RechazarPreinscripcionUseCase rechazarUseCase
	) {
		
		this.crearUseCase = crearUseCase;
		this.actualizarUseCase = actualizarUseCase;
		//this.aprobarUseCase = aprobarUseCase;
		this.listarUseCase = listarUseCase;
		this.rechazarUseCase = rechazarUseCase;
	}
	
	// LISTAR
	@GetMapping
	public List<PreinscripcionResponseDto> listar() {
		
		return listarUseCase.ejecutar()
				.stream()
				.map(PreinscripcionResponseDto::new)
				.toList();
	}
	
	// CREAR
	@PostMapping
	public PreinscripcionResponseDto crear(@RequestBody PreinscripcionRequestDto request) {
		
		Preinscripcion creada = crearUseCase.ejecutar(
				request.getIdCarrera(),
				request.getApellido(),
				request.getNombres(),
				request.getDni(),
				request.getFechaNacimiento(),
				request.getEdad(),
				request.getEmail()
		);
		
		if (request.getFechaNacimiento() != null)
			creada.actualizarFechaNacimiento(request.getFechaNacimiento());
		
		return new PreinscripcionResponseDto(creada);
	}
	
	// ACTUALIZAR
	@PutMapping("/{id}")
	public PreinscripcionResponseDto actualizar(
			@PathVariable Long id,
			@RequestBody PreinscripcionRequestDto request
	) {
		Preinscripcion actualizada = actualizarUseCase.ejecutar(
				id,
				request.getIdCarrera(),
				request.getApellido(),
				request.getNombres(),
				request.getDni(),
				request.getEdad(),
				request.getEmail()
		);
		
		if (request.getFechaNacimiento() != null)
			actualizada.actualizarFechaNacimiento(request.getFechaNacimiento());
		
		return new PreinscripcionResponseDto(actualizada);
	}
	
	// APROBAR
//	@PutMapping("/{id}/aprobar")
//	public PreinscripcionResponseDto aprobar(@PathVariable Long id) {
//		Preinscripcion aprobada = aprobarUseCase.ejecutar(id);
//		
//		return new PreinscripcionResponseDto(aprobada);
//	}
	
	// RECHAZAR
	@PutMapping("/{id}/rechazar")
	public PreinscripcionResponseDto rechazar(@PathVariable Long id) {
		Preinscripcion rechazada = rechazarUseCase.ejecutar(id);
		
		return new PreinscripcionResponseDto(rechazada);
	}
}
