package ar.edu.ies.backend.infrastructure.persistence.documentacionRequerida;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import ar.edu.ies.backend.domain.documentacionRequerida.DocumentacionRequerida;
import ar.edu.ies.backend.domain.documentacionRequerida.DocumentacionRequeridaRepository;

@Component
public class DocumentacionRequeridaJpaAdapter implements DocumentacionRequeridaRepository {

	private final SpringDocumentacionRequeridaRepository jpaRepository;
	
	public DocumentacionRequeridaJpaAdapter(SpringDocumentacionRequeridaRepository jpaRepository) {
		this.jpaRepository = jpaRepository;
	}
	
	@Override
	public DocumentacionRequerida guardar(DocumentacionRequerida doc) {
		// TODO Auto-generated method stub
		
		DocumentacionRequeridaEntity entity = DocumentacionRequeridaMapper.toEntity(doc);
		DocumentacionRequeridaEntity saved = jpaRepository.save(entity);
		
		return DocumentacionRequeridaMapper.toDomain(saved);
	}

	@Override
	public Optional<DocumentacionRequerida> buscarPorId(Long id) {
		// TODO Auto-generated method stub
		
		return jpaRepository.findById(id)
				.map(DocumentacionRequeridaMapper::toDomain);
	}

	@Override
	public List<DocumentacionRequerida> listarTodos() {
		// TODO Auto-generated method stub
		return toDomainList(jpaRepository.findAll());
	}

	@Override
	public List<DocumentacionRequerida> buscarPorTipoInscripcion(Boolean esReinscripcion) {
		// TODO Auto-generated method stub
		return esReinscripcion 
				? toDomainList(jpaRepository.findByAplicaReinscripcion(true))
						
				: toDomainList(jpaRepository.findByAplicaInscripcion(true));
	}

	@Override
	public Optional<DocumentacionRequerida> buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return jpaRepository.findByNombreDocumento(nombre)
				.map(DocumentacionRequeridaMapper::toDomain);
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		jpaRepository.deleteById(id);
	}
	
	// FUNCIÓN PARA LISTAR LAS ENTIDADES QUE SE RETORNAN AL DOMINIO
	private List<DocumentacionRequerida> toDomainList(List<DocumentacionRequeridaEntity> entities){
		
		return entities
				.stream()
				.map(DocumentacionRequeridaMapper::toDomain)
				.toList();
	}
}
