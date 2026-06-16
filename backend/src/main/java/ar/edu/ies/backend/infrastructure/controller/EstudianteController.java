package ar.edu.ies.backend.infrastructure.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.*;

import ar.edu.ies.backend.application.estudiante.*;
import ar.edu.ies.backend.domain.estudiante.Estudiante;
import ar.edu.ies.backend.infrastructure.controller.dto.estudianteDto.EstudianteRequestDto;
import ar.edu.ies.backend.infrastructure.controller.dto.estudianteDto.EstudianteResponseDto;
import ar.edu.ies.backend.infrastructure.persistence.estudiante.EstudianteMapper;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {

	private final CrearEstudianteUseCase crearUseCase;
	private final ActualizarEstudianteUseCase actualizarUseCase;
	private final BuscarEstudianteUseCase buscarUseCase;
	private final ListarEstudiantesUseCase listarUseCase;
	private final DesactivarEstudianteUseCase desactivarUseCase;
	
	public EstudianteController(
			CrearEstudianteUseCase crearUseCase, ActualizarEstudianteUseCase actualizarUseCase,
			BuscarEstudianteUseCase buscarUseCase,
			ListarEstudiantesUseCase listarUseCase, DesactivarEstudianteUseCase desactivarUseCase
	) {
		this.crearUseCase = crearUseCase;
		this.actualizarUseCase = actualizarUseCase;
		this.buscarUseCase = buscarUseCase;
		this.listarUseCase = listarUseCase;
		this.desactivarUseCase = desactivarUseCase;
	}
	
	// =========================
	// CREAR
	// =========================
	@PostMapping
	public EstudianteResponseDto crear(@RequestBody EstudianteRequestDto request) {
		
		Estudiante estudiante = EstudianteMapper.toDomain(request);
		
		Estudiante creado = crearUseCase.ejecutar(estudiante);
		
		return EstudianteMapper.toResponse(creado);
	}
	
	// =========================
	// ACTUALIZAR
	// =========================
	@PutMapping("/{id}")
	public EstudianteResponseDto actualizar(
			@PathVariable Long id, @RequestBody EstudianteRequestDto request
	) {
		Estudiante estudiante = EstudianteMapper.toDomain(request);
		
		Estudiante actualizado = actualizarUseCase.ejecutar(id, estudiante);
		
		return EstudianteMapper.toResponse(actualizado);
	}
	
	// =========================
	// BUSCAR POR ID
	// =========================
	@GetMapping("/{id}")
	public EstudianteResponseDto buscar(@PathVariable Long id) {
		
		Estudiante estudiante = buscarUseCase.ejecutar(id);
		
		return EstudianteMapper.toResponse(estudiante);
	}
	
	// =========================
	// LISTAR
	// =========================
	@GetMapping
	public List<EstudianteResponseDto> listar() {
		
		return listarUseCase.ejecutar()
				.stream()
				.map(EstudianteMapper::toResponse)
				.collect(Collectors.toList());
	}
	
	// =========================
	// DESACTIVAR
	// =========================
	@DeleteMapping("/{id}")
	public void desactivar(@PathVariable Long id) {
		desactivarUseCase.ejecutar(id);
	}
}
