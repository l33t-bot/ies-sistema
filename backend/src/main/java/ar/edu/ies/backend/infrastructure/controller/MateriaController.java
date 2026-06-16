package ar.edu.ies.backend.infrastructure.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import ar.edu.ies.backend.application.materia.ActualizarMateriaUseCase;
import ar.edu.ies.backend.application.materia.CrearMateriaUseCase;
import ar.edu.ies.backend.application.materia.ListarMateriasUseCase;
import ar.edu.ies.backend.domain.materia.Materia;
import ar.edu.ies.backend.infrastructure.controller.dto.MateriaRequestDto;
import ar.edu.ies.backend.infrastructure.controller.dto.MateriaResponseDto;

@RestController
@RequestMapping("/api/materias")
public class MateriaController {

	private final CrearMateriaUseCase crearUseCase;
	private final ActualizarMateriaUseCase actualizarUseCase;
	private final ListarMateriasUseCase listarUseCase;
	
	public MateriaController(
			CrearMateriaUseCase crearUseCase,
			ListarMateriasUseCase listarUseCase,
			ActualizarMateriaUseCase actualizarUseCase) {
		
		this.crearUseCase = crearUseCase;
		this.listarUseCase = listarUseCase;
		this.actualizarUseCase = actualizarUseCase;
	}
	
	@GetMapping
	public List<MateriaResponseDto> listar() {
		return listarUseCase.ejecutar()
				.stream()
				.map(MateriaResponseDto::new)
				.toList();
	}
	
	@PostMapping
	public MateriaResponseDto crear(@RequestBody MateriaRequestDto request) {

		Materia materia = new Materia(
				null,
				request.getIdPlan(),
				request.getCodigo(),
				request.getNombre(),
				request.getAnioCarrera(),
				request.getEsPromocional(),
				request.getActiva()
		);
		
		Materia creada = crearUseCase.ejecutar(materia);
		
		return new MateriaResponseDto(creada);
	}
	
	@PutMapping("/{id}")
	public MateriaResponseDto actualizar(
			@PathVariable Long id,
			@RequestBody MateriaRequestDto request) {
		
		Materia materia = new Materia(
				id,
				request.getIdPlan(),
				request.getCodigo(),
				request.getNombre(),
				request.getAnioCarrera(),
				request.getEsPromocional(),
				request.getActiva()
		);
		
		Materia actualizada = actualizarUseCase.ejecutar(materia);
		
		return new MateriaResponseDto(actualizada);
	}
}
