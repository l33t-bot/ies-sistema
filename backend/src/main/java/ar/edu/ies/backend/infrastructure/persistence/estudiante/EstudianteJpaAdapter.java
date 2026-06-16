package ar.edu.ies.backend.infrastructure.persistence.estudiante;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import ar.edu.ies.backend.domain.estudiante.Estudiante;
import ar.edu.ies.backend.domain.estudiante.EstudianteRepository;
import ar.edu.ies.backend.exception.RecursoNoEncontradoException;
import ar.edu.ies.backend.infrastructure.persistence.usuario.SpringUsuarioRepository;
import ar.edu.ies.backend.infrastructure.persistence.usuario.UsuarioEntity;
import ar.edu.ies.backend.model.Carrera;
import ar.edu.ies.backend.model.Plan;
import ar.edu.ies.backend.repository.CarreraRepository;
import ar.edu.ies.backend.repository.PlanRepository;

@Component
public class EstudianteJpaAdapter implements EstudianteRepository {

	private final SpringEstudianteRepository jpaRepository;
	private final SpringUsuarioRepository usuarioRepository;
	private final CarreraRepository carreraRepository;
	private final PlanRepository planRepository;
	
	public EstudianteJpaAdapter(
			SpringEstudianteRepository jpaRepository, SpringUsuarioRepository usuarioRepository,
			CarreraRepository carreraRepository, PlanRepository planRepository 
	) {
		this.jpaRepository = jpaRepository;
		this.usuarioRepository = usuarioRepository;
		this.carreraRepository = carreraRepository;
		this.planRepository = planRepository;
	}
	
	@Override
	public Estudiante guardar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		EstudianteEntity entity = EstudianteMapper.toEntity(estudiante);
		
		UsuarioEntity usuario = usuarioRepository.findById(estudiante.getIdUsuario())
				.orElseThrow(() -> new
						RecursoNoEncontradoException("Usuario no encontrado"));
		
		entity.setUsuario(usuario);
		
		Carrera carrera = carreraRepository.findById(estudiante.getIdCarrera())
				.orElseThrow(() -> new
						RecursoNoEncontradoException("Carrera no encontrada"));
		
		entity.setCarrera(carrera);
		
		Plan plan = planRepository.findById(estudiante.getIdPlan())
				.orElseThrow(() -> new
						RecursoNoEncontradoException("Plan no encontrado"));
		
		entity.setPlan(plan);
		
		EstudianteEntity saved = jpaRepository.save(entity);
		
		return EstudianteMapper.toDomain(saved);
	}

	@Override
	public Optional<Estudiante> buscarPorId(Long id) {
		// TODO Auto-generated method stub
		
		return jpaRepository.findById(id)
				.map(EstudianteMapper::toDomain);
	}

	@Override
	public List<Estudiante> listarActivos() {
		// TODO Auto-generated method stub
		return jpaRepository.findByActivoTrue()
				.stream()
				.map(EstudianteMapper::toDomain)
				.collect(Collectors.toList());
	}

	@Override
	public List<Estudiante> listarPorCarrera(Long idCarrera) {
		// TODO Auto-generated method stub
		return jpaRepository.findByCarrera_IdCarrera(idCarrera)
				.stream()
				.map(EstudianteMapper::toDomain)
				.collect(Collectors.toList());
	}

	@Override
	public Optional<Estudiante> buscarPorDni(String dni) {
		// TODO Auto-generated method stub
		return jpaRepository.findByDni(dni)
				.map(EstudianteMapper::toDomain);
	}

	@Override
	public boolean existePorDni(String dni) {
		// TODO Auto-generated method stub
		return jpaRepository.existsByDni(dni);
	}

}
