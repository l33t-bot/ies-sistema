package ar.edu.ies.backend.infrastructure.persistence.materia;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import ar.edu.ies.backend.domain.materia.Materia;
import ar.edu.ies.backend.domain.materia.MateriaRepository;

@Component
public class MateriaJpaAdapter implements MateriaRepository {

	private final SpringMateriaRepository jpaRepository;
	
	public MateriaJpaAdapter(SpringMateriaRepository jpaRepository) {
		this.jpaRepository = jpaRepository;
	}
	
	@Override
	public Materia guardar(Materia materia) {

        MateriaEntity entity = MateriaMapper.toEntity(materia);
        MateriaEntity saved = jpaRepository.save(entity);

        return MateriaMapper.toDomain(saved);
    }
	
	@Override
	public Optional<Materia> buscarPorId(Long id) {
        return jpaRepository.findById(id)
                .map(MateriaMapper::toDomain);
    }
	
	@Override
	public List<Materia> listar() {
		return jpaRepository.findAll()
				.stream()
				.map(MateriaMapper::toDomain)
				.collect(Collectors.toList());
	}
	
	@Override
	public List<Materia> listarPorPlan(Long idPlan) {
		return jpaRepository.findByIdPlan(idPlan)
				.stream()
				.map(MateriaMapper::toDomain)
				.collect(Collectors.toList());
	}
	
	@Override
	public void eliminar(Long id) {
		jpaRepository.deleteById(id);
	}

	@Override
	public List<Materia> buscarPorAnioYCarrera(int anio, Long idCarrera) {
		// TODO Auto-generated method stub
		
		return null;
	}
}
