package ar.edu.ies.backend.infrastructure.persistence.inscripcion;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import ar.edu.ies.backend.domain.inscripcion.EstadoInscripcion;
import ar.edu.ies.backend.domain.inscripcion.Inscripcion;
import ar.edu.ies.backend.domain.inscripcion.InscripcionRepository;
import ar.edu.ies.backend.domain.inscripcion.TipoInscripcion;

@Repository
public class InscripcionJpaAdapter implements InscripcionRepository{

	private final SpringInscripcionRepository jpaRepository;
	
	public InscripcionJpaAdapter(SpringInscripcionRepository jpaRepository) {
		this.jpaRepository = jpaRepository;
	}
	
	@Override
	public Inscripcion guardar(Inscripcion inscripcion) {
		// TODO Auto-generated method stub
		InscripcionEntity entity = InscripcionMapper.toEntity(inscripcion);
		InscripcionEntity saved = jpaRepository.save(entity);
		
		return InscripcionMapper.toDomain(saved);
	}

	@Override
	public Optional<Inscripcion> buscarPorId(Long idInscripcion) {
		// TODO Auto-generated method stub
		
		return jpaRepository.findById(idInscripcion)
				.map(InscripcionMapper::toDomain);
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		jpaRepository.deleteById(id);
	}

	@Override
	public List<Inscripcion> listarTodo() {
		// TODO Auto-generated method stub
		return jpaRepository.findAll()
				.stream()
				.map(InscripcionMapper::toDomain)
				.toList();
	}

	@Override
	public List<Inscripcion> buscarPorEstudiante(Long idEstudiante) {
		// TODO Auto-generated method stub
		return jpaRepository.findByEstudiante_IdEstudiante(idEstudiante)
				.stream()
				.map(InscripcionMapper::toDomain)
				.toList();
	}

	@Override
	public List<Inscripcion> buscarPorPeriodo(Long idPeriodo) {
		// TODO Auto-generated method stub
		return jpaRepository.findByPeriodo_IdPeriodo(idPeriodo)
				.stream()
				.map(InscripcionMapper::toDomain)
				.toList();
	}

	@Override
	public List<Inscripcion> buscarPorTipoInscripcion(TipoInscripcion tipo) {
		// TODO Auto-generated method stub
		return jpaRepository.findByTipoInscripcion(tipo)
				.stream()
				.map(InscripcionMapper::toDomain)
				.toList();
	}

	@Override
	public List<Inscripcion> buscarPorEstado(EstadoInscripcion estado) {
		// TODO Auto-generated method stub
		return jpaRepository.findByEstadoInscripcion(estado)
				.stream()
				.map(InscripcionMapper::toDomain)
				.toList();
	}

	@Override
	public Optional<Inscripcion> buscarPorEstudianteYPeriodo(Long idEstudiante, Long idPeriodo) {
		// TODO Auto-generated method stub
		return jpaRepository.findByEstudiante_IdEstudianteAndPeriodo_IdPeriodo(idEstudiante, idPeriodo)
				.map(InscripcionMapper::toDomain);
	}
}