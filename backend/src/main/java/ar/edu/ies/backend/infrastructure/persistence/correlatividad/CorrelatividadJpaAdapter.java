package ar.edu.ies.backend.infrastructure.persistence.correlatividad;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;


import ar.edu.ies.backend.domain.correlatividad.Correlatividad;
import ar.edu.ies.backend.domain.correlatividad.CorrelatividadRepository;

@Component
public class CorrelatividadJpaAdapter implements CorrelatividadRepository {

	private final SpringCorrelatividadRepository jpaRepository;
	
	public CorrelatividadJpaAdapter(SpringCorrelatividadRepository jpaRepository) {
		
		this.jpaRepository = jpaRepository;
	}
	
	@Override
	public Correlatividad guardar(Correlatividad correlatividad) {
		
		CorrelatividadEntity entity = CorrelatividadMapper.toEntity(correlatividad);
		CorrelatividadEntity saved = jpaRepository.save(entity);
		
		return CorrelatividadMapper.toDomain(saved);
	}
	
	@Override
	public Optional<Correlatividad> buscarPorId(Long id){
		
		return jpaRepository.findById(id)
				.map(CorrelatividadMapper::toDomain);
	}
	
	@Override
	public List<Correlatividad> listar() {
		
		return jpaRepository.findAll()
				.stream()
				.map(CorrelatividadMapper::toDomain)
				.collect(Collectors.toList());
	}
	
	@Override
	public List<Correlatividad> listarPorMateriaPrincipal(Long idMateriaPrincipal) {
		
		return jpaRepository.findByIdMateriaPrincipal(idMateriaPrincipal)
	            .stream()
	            .map(CorrelatividadMapper::toDomain)
	            .collect(Collectors.toList());
	}
	
	@Override
	public Boolean existeCorrelatividad(Long idMateriaPrincipal, Long idMateriaRequisito) {

	    return jpaRepository.existsByIdMateriaPrincipalAndIdMateriaRequisito(
	            idMateriaPrincipal,
	            idMateriaRequisito
	    );
	}
	
	@Override
	public Boolean existeCorrelatividadExceptoId(
			Long idMateriaPrincipal,
			Long idMateriaRequisito,
			Long idCorrelatividad) {
		
		return jpaRepository
				.existsByIdMateriaPrincipalAndIdMateriaRequisitoAndIdCorrelatividadNot(
						idMateriaPrincipal,
						idMateriaRequisito,
						idCorrelatividad
				);
	}
	
	@Override
	public void eliminar(Long id) {
		jpaRepository.deleteById(id);
	}
}
