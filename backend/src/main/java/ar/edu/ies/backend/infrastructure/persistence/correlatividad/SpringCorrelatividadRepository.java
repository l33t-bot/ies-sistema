package ar.edu.ies.backend.infrastructure.persistence.correlatividad;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SpringCorrelatividadRepository extends JpaRepository<CorrelatividadEntity, Long> {

	/*@Query("""
		SELECT new ar.edu.ies.backend.infrastrucure.controller.dto.correlatividadDto.CorrelatividadResponse(
			c.idCorrelatividad,
			c.idMateriaPrincipal,
			c.idMateriaRequisito,
			c.tipoCorrelativa,
			c.activa,
			mp.nombre,
			mr.nombre
		)
		FROM Correlatividad c
		JOIN Materia mp ON mp.idMateria = c.idMateriaPrincipal
		JOIN Materia mr ON mr.idMateriaRequisito = c.idMateriaPrincipal
		WHERE c.idMateriaPrincipal = :idMateria
	""")*/
	
	List<CorrelatividadEntity> findByIdMateriaPrincipal(Long idMateriaPrincipal);
	
	boolean existsByIdMateriaPrincipalAndIdMateriaRequisito(
	        Long idMateriaPrincipal,
	        Long idMateriaRequisito
	);
	
	boolean existsByIdMateriaPrincipalAndIdMateriaRequisitoAndIdCorrelatividadNot(
			Long idMateriaPrincipal,
			Long idMateriaRequisito,
			Long idCorrelatividad
	);
}
