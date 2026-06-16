package ar.edu.ies.backend.infrastructure.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import ar.edu.ies.backend.application.correlatividad.ActualizarCorrelatividadUseCase;
import ar.edu.ies.backend.application.correlatividad.CrearCorrelatividadUseCase;
import ar.edu.ies.backend.application.correlatividad.EliminarCorrelatividadUseCase;
import ar.edu.ies.backend.application.correlatividad.ListarCorrelatividadesPorMateriaUseCase;
import ar.edu.ies.backend.application.correlatividad.ListarCorrelatividadesUseCase;

import ar.edu.ies.backend.domain.correlatividad.Correlatividad;
import ar.edu.ies.backend.domain.materia.MateriaRepository;
import ar.edu.ies.backend.infrastructure.controller.dto.correlatividadDto.CorrelatividadRequestDto;
import ar.edu.ies.backend.infrastructure.controller.dto.correlatividadDto.CorrelatividadResponseDto;

@RestController
@RequestMapping("/api/correlatividades")
public class CorrelatividadController {

	private final CrearCorrelatividadUseCase crearUseCase;
	private final ActualizarCorrelatividadUseCase actualizarUseCase;
	private final ListarCorrelatividadesUseCase listarUseCase;
	private final ListarCorrelatividadesPorMateriaUseCase listarPorMateriaUseCase;
	private final EliminarCorrelatividadUseCase eliminarUseCase;
	
	private final MateriaRepository materiaRepository;
	
	public CorrelatividadController(
			CrearCorrelatividadUseCase crearUseCase,
			ActualizarCorrelatividadUseCase actualizarUseCase,
			ListarCorrelatividadesUseCase listarUseCase,
			ListarCorrelatividadesPorMateriaUseCase listarPorMateriaUseCase,
			EliminarCorrelatividadUseCase eliminarUseCase,
			MateriaRepository materiaRepository
	) {
		this.crearUseCase = crearUseCase;
		this.actualizarUseCase = actualizarUseCase;
		this.listarUseCase = listarUseCase;
		this.listarPorMateriaUseCase = listarPorMateriaUseCase;
		this.eliminarUseCase = eliminarUseCase;
		this.materiaRepository = materiaRepository;
	}
	
	// LISTAR
	@GetMapping
	public List<CorrelatividadResponseDto> listar() {
		
		return listarUseCase.ejecutar()
				.stream()
				.map(CorrelatividadResponseDto::new)
				.toList();
	}
	
	// LISTAR POR MATERIA PRINCIPAL
	@GetMapping("/materia/{id}")
	public List<CorrelatividadResponseDto> listarPorMateria(@PathVariable Long id) {
		
		List<Correlatividad> lista = listarPorMateriaUseCase.ejecutar(id);
		
		return lista.stream().map(c -> {
			
			CorrelatividadResponseDto dto = new CorrelatividadResponseDto(c);
			
			var materiaPrincipal = materiaRepository
					.buscarPorId(c.getIdMateriaPrincipal())
					.orElse(null);
			
			var materiaRequisito = materiaRepository
					.buscarPorId(c.getIdMateriaRequisito())
					.orElse(null);
			
			dto.setNombreMateriaPrincipal(
				materiaPrincipal != null
					? materiaPrincipal.getNombre()
					: null
			);
			
			dto.setNombreMateriaRequisito(
				materiaRequisito != null
					? materiaRequisito.getNombre()
					: null
			);
			
			return dto;
			
		}).toList();
	}
	
	// CREAR
	@PostMapping
	public CorrelatividadResponseDto crear(@RequestBody CorrelatividadRequestDto request) {
		
		Correlatividad creada = crearUseCase.ejecutar(
				request.getIdMateriaPrincipal(),
				request.getIdMateriaRequisito(),
				request.getTipoCorrelativa(),
				request.getActivo()
		);
		
		return new CorrelatividadResponseDto(creada);
	}
	
	// ACTUALIZAR
	@PutMapping("/{id}")
	public CorrelatividadResponseDto actualizar(@PathVariable Long id, @RequestBody CorrelatividadRequestDto request) {
		
		Correlatividad actualizada = actualizarUseCase.ejecutar(
				id,
				request.getIdMateriaPrincipal(),
				request.getIdMateriaRequisito(),
				request.getTipoCorrelativa(),
				request.getActivo()
		);
		
		return new CorrelatividadResponseDto(actualizada);
	}
	
	// ELIMINAR
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Long id) {
		
		eliminarUseCase.ejecutar(id);
	}
}
