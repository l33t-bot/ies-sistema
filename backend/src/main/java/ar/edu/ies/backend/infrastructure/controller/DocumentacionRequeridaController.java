package ar.edu.ies.backend.infrastructure.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import ar.edu.ies.backend.application.documentacionRequerida.ActualizarDocumentacionRequeridaUseCase;
import ar.edu.ies.backend.application.documentacionRequerida.BuscarDocumentacionPorNombreUseCase;
import ar.edu.ies.backend.application.documentacionRequerida.CrearDocumentacionRequeridaUseCase;
import ar.edu.ies.backend.application.documentacionRequerida.EliminarDocumentacionRequeridaUseCase;
import ar.edu.ies.backend.application.documentacionRequerida.ListarDocumentacionParaInscripcionUseCase;
import ar.edu.ies.backend.application.documentacionRequerida.ListarDocumentacionRequeridaUseCase;
import ar.edu.ies.backend.application.documentacionRequerida.ObtenerDocumentacionRequeridaPorIdUseCase;
import ar.edu.ies.backend.domain.documentacionRequerida.DocumentacionRequerida;
import ar.edu.ies.backend.infrastructure.controller.dto.documentacionRequerida.DocumentacionRequeridaRequestDto;
import ar.edu.ies.backend.infrastructure.controller.dto.documentacionRequerida.DocumentacionRequeridaResponseDto;
import ar.edu.ies.backend.infrastructure.controller.mapper.DocumentacionRequeridaControllerMapper;
import ar.edu.ies.backend.infrastructure.persistence.documentacionRequerida.DocumentacionRequeridaMapper;

@RestController
@RequestMapping("/api/documentacionRequerida")
public class DocumentacionRequeridaController {

	private final CrearDocumentacionRequeridaUseCase crearUseCase;
	private final ActualizarDocumentacionRequeridaUseCase actualizarUseCase;
	private final BuscarDocumentacionPorNombreUseCase buscarPorNombreUseCase;
	private final EliminarDocumentacionRequeridaUseCase eliminarUseCase;
	private final ListarDocumentacionParaInscripcionUseCase listarParaInscripcionUseCase;
	private final ListarDocumentacionRequeridaUseCase listarUseCase;
	private final ObtenerDocumentacionRequeridaPorIdUseCase obtenerPorIdUseCase;
	
	public DocumentacionRequeridaController(
			CrearDocumentacionRequeridaUseCase crearUseCase,
			ActualizarDocumentacionRequeridaUseCase actualizarUseCase,
			BuscarDocumentacionPorNombreUseCase buscarPorNombreUseCase,
			EliminarDocumentacionRequeridaUseCase eliminarUseCase,
			ListarDocumentacionParaInscripcionUseCase listarParaInscripcionUseCase,
			ListarDocumentacionRequeridaUseCase listarUseCase,
			ObtenerDocumentacionRequeridaPorIdUseCase obtenerPorIdUseCase
	) {
		this.crearUseCase = crearUseCase;
		this.actualizarUseCase = actualizarUseCase;
		this.buscarPorNombreUseCase = buscarPorNombreUseCase;
		this.eliminarUseCase = eliminarUseCase;
		this.listarParaInscripcionUseCase = listarParaInscripcionUseCase;
		this.listarUseCase = listarUseCase;
		this.obtenerPorIdUseCase = obtenerPorIdUseCase;
	}
	
	// =========================
	// CREAR
	// =========================
	
	@PostMapping
	public DocumentacionRequeridaResponseDto crear(@RequestBody DocumentacionRequeridaRequestDto request) {
		
		DocumentacionRequerida documento = crearUseCase.ejecutar(
				request.getNombreDocumento(), request.getObligatorio(),
				request.getAplicaInscripcionInicial(), request.getAplicaReinscripcion()
		);
		
		if (request.getDescripcion() != null)
			documento.cambiarDescripcion(request.getDescripcion());
		
		return DocumentacionRequeridaControllerMapper.toDto(documento);
	}
	
	// =========================
	// ACTUALIZAR
	// =========================
	
	@PutMapping("/{id}")
	public DocumentacionRequeridaResponseDto actualizar(
			@PathVariable Long id, @RequestBody DocumentacionRequeridaRequestDto request
	) {
		
		DocumentacionRequerida documento = actualizarUseCase.ejecutar(
				id,
				request.getNombreDocumento(), request.getObligatorio(),
				request.getAplicaInscripcionInicial(), request.getAplicaReinscripcion()
		);
		
		if (request.getDescripcion() != null)
			documento.cambiarDescripcion(request.getDescripcion());
		
		return DocumentacionRequeridaControllerMapper.toDto(documento);
	}
	
	// =========================
	// BUSCAR POR NOMBRE
	// =========================
	
	@GetMapping("/nombre/{nombre]")
	public DocumentacionRequeridaResponseDto buscarPorNombre(@PathVariable String nombre) {
		
		DocumentacionRequerida documento = buscarPorNombreUseCase.ejecutar(nombre);
		
		return DocumentacionRequeridaControllerMapper.toDto(documento);
	}
	
	// =========================
	// BUSCAR POR ID
	// =========================
	
	@GetMapping("/{id}")
	public DocumentacionRequeridaResponseDto obtenerPorId(@PathVariable Long id) {
		
		DocumentacionRequerida documento = obtenerPorIdUseCase.ejecutar(id);
		
		return DocumentacionRequeridaControllerMapper.toDto(documento);
	}
	
	// =========================
	// LISTAR TODOS
	// =========================
	
	@GetMapping
	public List<DocumentacionRequeridaResponseDto> listar() {
		
		return listarUseCase.ejecutar()
				.stream()
				.map(DocumentacionRequeridaControllerMapper::toDto)
				.toList();
	}
	
	// =========================
	// LISTAR PARA INSCRIPCION
	// =========================
	
	@GetMapping("/tipo")
	public List<DocumentacionRequeridaResponseDto> listarParaInscripcion(
			@RequestParam Boolean esReinscripcion
	) {
		return listarParaInscripcionUseCase.ejecutar(esReinscripcion)
				.stream()
				.map(DocumentacionRequeridaControllerMapper::toDto)
				.toList();
	}
	
	// =========================
	// ELIMINAR
	// =========================
		
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Long id) {
		eliminarUseCase.ejecutar(id);
	}
}
