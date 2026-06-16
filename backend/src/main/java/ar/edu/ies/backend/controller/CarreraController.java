package ar.edu.ies.backend.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ar.edu.ies.backend.dto.CarreraDto;
import ar.edu.ies.backend.service.CarreraService;

@RestController
@RequestMapping("/api/carreras")
public class CarreraController {
	
	private final CarreraService service;
	
	public CarreraController(CarreraService service) {
		this.service = service;
	}
	
	@GetMapping
    public List<CarreraDto> listar() {
        return service.listar();
    }

    @PostMapping
    public ResponseEntity<CarreraDto> guardar(@RequestBody CarreraDto dto) {
    	
    	CarreraDto guardada = service.guardar(dto);
    	
    	return ResponseEntity.ok(guardada);
    }

    @PutMapping("/{id}")
    public CarreraDto actualizar(@PathVariable Long id,
                                 @RequestBody CarreraDto dto) {
        dto.setId_carrera(id);
        return service.guardar(dto);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
