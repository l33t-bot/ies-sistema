package ar.edu.ies.backend.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import ar.edu.ies.backend.dto.CarreraDto;
import ar.edu.ies.backend.exception.RecursoNoEncontradoException;
import ar.edu.ies.backend.exception.ValidacionException;
import ar.edu.ies.backend.mapper.CarreraMapper;
import ar.edu.ies.backend.model.Carrera;
import ar.edu.ies.backend.repository.CarreraRepository;

@Service
public class CarreraService {
	
	private CarreraRepository repo;
	
	public CarreraService(CarreraRepository repo) {
		this.repo = repo;
	}
	
	public List<CarreraDto> listar() {
		return repo.findAll()
				   .stream()
				   .map(CarreraMapper::toDto)
				   .collect(Collectors.toList());
	}
	
	public CarreraDto guardar(CarreraDto dto) {
		
		// Validación: nombre obligatorio
		if (dto.getNombre() == null || dto.getNombre().trim().isEmpty()) {
			throw new ValidacionException("El nombre de la crrera es obligatorio");
		}
		
		// Insert
		if (dto.getId_carrera() == null) {
			Carrera nueva = CarreraMapper.toEntity(dto);
			Carrera saved = repo.save(nueva);
			
			return CarreraMapper.toDto(saved);
		}
		
		// Update
		Carrera existente = repo.findById(dto.getId_carrera())
				.orElseThrow(() -> new RecursoNoEncontradoException("Carrera no encontrada"));
		
		existente.setNombre(dto.getNombre());
		existente.setCodigo(dto.getCodigo());
		existente.setDescripcion(dto.getDescripcion());
		existente.setColorCarpeta(dto.getColorCarpeta());
		existente.setPromocionales(dto.getPromocionales());
		existente.setActiva(dto.getActiva());
		
		Carrera saved = repo.save(existente);
		return CarreraMapper.toDto(saved);
	}
	
	public void eliminar(Long id) {
		
		// Verificación que exista antes de eliminar
		if (!repo.existsById(id)) {
			throw new RecursoNoEncontradoException(
				"Carrera con ID " + id + " no encontrada"
			);
		}
		
		repo.deleteById(id);
	}
}
