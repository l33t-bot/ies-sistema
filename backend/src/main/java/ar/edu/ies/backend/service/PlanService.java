package ar.edu.ies.backend.service;

import java.util.List;
import org.springframework.stereotype.Service;

import ar.edu.ies.backend.dto.PlanDto;
import ar.edu.ies.backend.exception.RecursoNoEncontradoException;
import ar.edu.ies.backend.exception.ValidacionException;
import ar.edu.ies.backend.mapper.PlanMapper;
import ar.edu.ies.backend.model.Carrera;
import ar.edu.ies.backend.model.Plan;
import ar.edu.ies.backend.repository.CarreraRepository;
import ar.edu.ies.backend.repository.PlanRepository;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PlanService {

	private final PlanRepository planRepo;
	private final CarreraRepository carreraRepo;
	
	public PlanService(PlanRepository planRepo, CarreraRepository carreraRepo) {
		this.planRepo = planRepo;
		this.carreraRepo = carreraRepo;
	}
	
	// =========================
    // LISTAR
    // =========================
	
	@Transactional(readOnly = true)
	public List<PlanDto> listarPlanes() {
		return planRepo.findAll()
				.stream()
				.map(PlanMapper::toDto)
				.toList();
	}
	
	@Transactional(readOnly = true)
	public List<PlanDto> listarPorCarrera(Long idCarrera) {
		return planRepo.findByCarrera_IdCarrera(idCarrera)
					   .stream()
					   .map(PlanMapper::toDto)
					   .toList();
	}
	
	// =========================
    // CREAR
    // =========================
	
	public PlanDto crear(PlanDto dto) {
		validar(dto);
		
		Carrera carrera = obtenerCarrera(dto.getIdCarrera());
		
		Plan nuevo = PlanMapper.toEntity(dto, carrera);
		return PlanMapper.toDto(planRepo.save(nuevo));
	}
	
	 // =========================
    // ACTUALIZAR
    // =========================
	
	public PlanDto actualizar(Long id, PlanDto dto) {
		validar(dto);
		
		Plan existente = obtenerPlan(id);
		Carrera carrera = obtenerCarrera(dto.getIdCarrera());
		
		existente.setCarrera(carrera);
		existente.setNombrePlan(dto.getNombrePlan());
		existente.setAnioInicio(dto.getAnioInicio());
		existente.setActivo(dto.getActivo());
		
		return PlanMapper.toDto(planRepo.save(existente));
	}
	
	// =========================
    // DESACTIVAR
    // =========================
	
	public void desactivar(Long id) {
		Plan plan = obtenerPlan(id);
		plan.setActivo(false);
		planRepo.save(plan);
	}
	
	// =========================
    // MÉTODOS PRIVADOS
    // =========================
	
	private void validar(PlanDto dto) {
		if (dto.getNombrePlan() == null || dto.getNombrePlan().isBlank())
			throw new ValidacionException("El nombre del plan es obligatorio");
		
		if (dto.getIdCarrera() == null)
			throw new ValidacionException("Debe seleccionar una carrera");
	}
	
	private Carrera obtenerCarrera(Long idCarrera) {
		return carreraRepo.findById(idCarrera)
				.orElseThrow(() -> new RecursoNoEncontradoException("Carrera no encontrada"));
	}
	
	private Plan obtenerPlan(Long idPlan) {
		return planRepo.findById(idPlan)
				.orElseThrow(() -> new RecursoNoEncontradoException("Plan no encontrado"));
	}
}
