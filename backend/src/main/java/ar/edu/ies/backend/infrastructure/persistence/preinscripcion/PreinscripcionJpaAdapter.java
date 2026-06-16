package ar.edu.ies.backend.infrastructure.persistence.preinscripcion;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import ar.edu.ies.backend.domain.preinscripcion.Preinscripcion;
import ar.edu.ies.backend.domain.preinscripcion.PreinscripcionRepository;

@Component
public class PreinscripcionJpaAdapter implements PreinscripcionRepository{

	private final SpringPreinscripcionRepository jpaRepository;
	
	public PreinscripcionJpaAdapter(SpringPreinscripcionRepository jpaRepository) {
		this.jpaRepository = jpaRepository;
	}
	
	@Override
	public Preinscripcion guardar(Preinscripcion preinscripcion) {
		// TODO Auto-generated method stub
		
		PreinscripcionEntity entity = PreinscripcionMapper.toEntity(preinscripcion);
		PreinscripcionEntity saved = jpaRepository.save(entity);
		
		return PreinscripcionMapper.toDomain(saved);
	}

	@Override
	public Optional<Preinscripcion> buscarPorId(Long id) {
		// TODO Auto-generated method stub
		
		return jpaRepository.findById(id)
				.map(PreinscripcionMapper::toDomain);
	}

	@Override
	public List<Preinscripcion> listarTodas() {
		// TODO Auto-generated method stub
		
		return jpaRepository.findAll()
				.stream()
				.map(PreinscripcionMapper::toDomain)
				.collect(Collectors.toList());
	}

	@Override
	public boolean existePorDni(String dni) {
		// TODO Auto-generated method stub
		
		return jpaRepository.existsByDni(dni);
	}

	@Override
	public Preinscripcion actualizar(Preinscripcion preinscripcion) {
		// TODO Auto-generated method stub
		
		// validar id
		if (preinscripcion.getIdPreinscripcion() == null)
			throw new IllegalArgumentException("El ID es ogligatorio para actualizar");
		
		// buscar entity existente
		PreinscripcionEntity existente = jpaRepository
				.findById(preinscripcion.getIdPreinscripcion())
				.orElseThrow(() -> new RuntimeException("Preinscripción no encontrada"));
		
		// actualizar datos
		PreinscripcionMapper.updateEntity(preinscripcion, existente);
		
		// guardar cambios
		PreinscripcionEntity actualizada = jpaRepository.save(existente);
		
		// volver a dominio
		return PreinscripcionMapper.toDomain(actualizada);
	}
}
