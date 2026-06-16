package ar.edu.ies.backend.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ar.edu.ies.backend.dto.PlanDto;
import ar.edu.ies.backend.service.PlanService;

@RestController
@RequestMapping("/api/planes")
public class PlanController {

	private final PlanService service;
	
	public PlanController(PlanService service) {
		this.service = service;
	}
	
	// =========================
    // LISTAR TODOS
    // =========================
	
	@GetMapping
	public ResponseEntity<List<PlanDto>> listar() {
		return ResponseEntity.ok(service.listarPlanes());
	}
	
	// =========================
    // LISTAR POR CARRERA
    // =========================
	
	@GetMapping("/carrera/{idCarrera}")
	public ResponseEntity<List<PlanDto>> listarPorCarrera(@PathVariable Long idCarrera) {
        return ResponseEntity.ok(service.listarPorCarrera(idCarrera));
	}
	
	// =========================
    // CREAR
    // =========================
	
	@PostMapping
    public ResponseEntity<PlanDto> crear(@RequestBody PlanDto dto) {
        return ResponseEntity.ok(service.crear(dto));
    }
	
	// =========================
    // ACTUALIZAR
    // =========================
	
	@PutMapping("/{id}")
	public ResponseEntity<PlanDto> actualizar(@PathVariable Long id,
											  @RequestBody PlanDto dto) {
		
		return ResponseEntity.ok(service.actualizar(id, dto));
	}
	
	// =========================
    // DESACTIVAR
    // =========================
	
	@PutMapping("/{id}/desactivar")
	public ResponseEntity<Void> desactivar(@PathVariable Long id){
		service.desactivar(id);
		
		return ResponseEntity.noContent().build();
	}
}
