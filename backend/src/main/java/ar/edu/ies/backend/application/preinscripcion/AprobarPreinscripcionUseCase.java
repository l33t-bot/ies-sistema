package ar.edu.ies.backend.application.preinscripcion;

import java.util.List;

import ar.edu.ies.backend.domain.materia.Materia;
import ar.edu.ies.backend.domain.materia.MateriaRepository;
import ar.edu.ies.backend.domain.preinscripcion.Preinscripcion;
import ar.edu.ies.backend.domain.preinscripcion.PreinscripcionRepository;
import ar.edu.ies.backend.domain.usuario.Usuario;
import ar.edu.ies.backend.domain.usuario.UsuarioRepository;

public class AprobarPreinscripcionUseCase {

//	private final PreinscripcionRepository preinscripcionRepository;
//	private final EstudianteRepository estudianteRepository;
//	private final UsuarioRepository usuarioRepository;
//	private final AntecedenteRepository antecedenteRepository;
//	private final InscripcionRepository inscripcionRepository;
//	private final MateriaRepository materiaRepository;
//	private final InscripcionMateriaRepository inscripcionMateriaRepository;
//	
//	public AprobarPreinscripcionUseCase(
//			PreinscripcionRepository preinscripcionRepository,
//			EstudianteRepository estudianteRepository,
//			UsuarioRepository usuarioRepository,
//			AntecedenteRepository antecedenteRepository,
//			InscripcionRepository inscripcionRepository,
//			MateriaRepository materiaRepository,
//			InscripcionMateriaRepository inscripcionMateriaRepository) {
//
//		this.preinscripcionRepository = preinscripcionRepository;
//		this.estudianteRepository = estudianteRepository;
//		this.usuarioRepository = usuarioRepository;
//		this.antecedenteRepository = antecedenteRepository;
//		this.inscripcionRepository = inscripcionRepository;
//		this.materiaRepository = materiaRepository;
//		this.inscripcionMateriaRepository = inscripcionMateriaRepository;
//	}
//	
//	public Preinscripcion ejecutar(Long id) {
//		
//		// buscar preinscripcion
//		Preinscripcion pre = preinscripcionRepository.buscarPorId(id)
//				.orElseThrow(() -> new RuntimeException("Preinscripcon no encontrada"));
//		
//		// validar estado
//		if (!pre.puedeAprobar())
//			throw new RuntimeException("La preinscripción no puede ser aprobada");
//		
//		// aprobar
//		pre.aprobar();
//		preinscripcionRepository.guardar(pre);
//		
//		// crear usuario
//		Usuario usuario = Usuario.crearDesdePreinscripcion(pre);
//		usuarioRepository.guardar(usuario);
//		
//		// crear antecedente secundario
//		AntecedenteSecundario ant = new AntecedenteSecundario(pre, estudiante.getIdUsuario());
//		antecedenteRepository.guardar(ant);
//		
//		// crear inscripción anual
//		Inscripcion inscripcion = new Inscripcion();
//		inscripcion.setIdEstudiante(estudiante.getIdUsuario());
//		inscripcion.setIdPeriodo(obtenerPeriodoActual());
//		inscripcion.setTipo("ingreso");
//		inscripcion.setEstado("confirmado");
//		inscripcion.setAnioQueCursa(1);
//		inscripcion.setFechaInscripcion(LocalDateTime.now());
//		
//		inscripcion = inscripcionRepository.guardar(inscripcion);
//		
//		// 8. Inscribir materias de primer año
//		List<Materia> materias = materiaRepository.buscarPorAnioYCarrera(1, pre.getIdCarrera());
//		
//		for (Materia m : materias) {
//			
//			InscripcionMateria im = new InscripcionMateria();
//			im.setIdInscripcion(inscripcion.getIdInscripcion());
//			im.setIdEstudiante(estudiante.getIdEstudiante());
//			im.setIdMateria(m.getIdMateria());
//			im.setIdPeriodo(inscripcion.getIdPeriodo());
//			im.setEstado("inscripto");
//
//			inscripcionMateriaRepository.guardar(im);
//		}
//		
//		return preinscripcionRepository.guardar(pre);
//	}
//	
//	private Long obtenerPeriodoActual() {
//		// terminar
//		return 1L;
//	}
}
