package ar.edu.ies.backend.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import ar.edu.ies.backend.application.auth.LoginUseCase;
import ar.edu.ies.backend.application.correlatividad.*;
import ar.edu.ies.backend.application.documentacionRequerida.*;
import ar.edu.ies.backend.application.materia.*;
import ar.edu.ies.backend.application.preinscripcion.*;
import ar.edu.ies.backend.application.estudiante.*;
import ar.edu.ies.backend.domain.correlatividad.CorrelatividadRepository;
import ar.edu.ies.backend.domain.documentacionRequerida.DocumentacionRequeridaRepository;
import ar.edu.ies.backend.domain.materia.MateriaRepository;
import ar.edu.ies.backend.domain.preinscripcion.PreinscripcionRepository;
import ar.edu.ies.backend.domain.estudiante.EstudianteRepository;
import ar.edu.ies.backend.domain.usuario.UsuarioRepository;
import ar.edu.ies.backend.infrastructure.security.JwtService;


@Configuration
public class UseCaseConfig {
	
	// =========================
	// LOGIN
	// =========================
	
	@Bean
	public LoginUseCase loginUseCase(
	        UsuarioRepository usuarioRepository,
	        PasswordEncoder passwordEncoder,
	        JwtService jwtService
	) {
	    return new LoginUseCase(
	            usuarioRepository,
	            passwordEncoder,
	            jwtService
	    );
	}

	// =========================
	// MATERIA
	// =========================
	
    @Bean
    public CrearMateriaUseCase crearMateriaUseCase(
            MateriaRepository materiaRepository) {
        return new CrearMateriaUseCase(materiaRepository);
    }

    @Bean
    public ListarMateriasUseCase listarMateriasUseCase(
            MateriaRepository materiaRepository) {
        return new ListarMateriasUseCase(materiaRepository);
    }

    @Bean
    public ActualizarMateriaUseCase actualizarMateriaUseCase(
            MateriaRepository materiaRepository) {
        return new ActualizarMateriaUseCase(materiaRepository);
    }
    
    // =========================
 	// CORRELATIVIDAD
 	// =========================
    
    @Bean
    public CrearCorrelatividadUseCase crearCorrelatividadUseCase(
    		
    		CorrelatividadRepository correlatividadRepository,
    		MateriaRepository materiaRepository
    ) {
    	
    	return new CrearCorrelatividadUseCase(
    			correlatividadRepository,
    			materiaRepository);
    }
    
    @Bean
    public ActualizarCorrelatividadUseCase actualizarCorrelatividadUseCase(
    		CorrelatividadRepository correlatividadRepository,
    		MateriaRepository materiaRepository) {
    	
    	return new ActualizarCorrelatividadUseCase(correlatividadRepository, materiaRepository);
    }
    
    @Bean
    public ListarCorrelatividadesUseCase listarCorrelatividadesUseCase(
    		CorrelatividadRepository correlatividadRepository) {
    	
    	return new ListarCorrelatividadesUseCase(correlatividadRepository);
    }
    
    @Bean
    public ListarCorrelatividadesPorMateriaUseCase listarCorrelatividadesPorMateriaUseCase(
    		CorrelatividadRepository correlatividadRepository) {
    	
    	return new ListarCorrelatividadesPorMateriaUseCase(correlatividadRepository);
    }
    
    
    @Bean
    public EliminarCorrelatividadUseCase eliminarCorrelatividadUseCase(
    		CorrelatividadRepository correlatividadRepository) {
    	
    	return new EliminarCorrelatividadUseCase(correlatividadRepository);
    }
    
    // =========================
    // PREINSCRIPCION
    // =========================
    
    @Bean
    public CrearPreinscripcionUseCase crearPreinscripcionUseCase(
    		
    		PreinscripcionRepository preinscripcionRepository
    ) {
    	return new CrearPreinscripcionUseCase(preinscripcionRepository);
    }
    
    @Bean
    public ActualizarPreinscripcionUseCase actualizarPreinscripcionUseCase(
            PreinscripcionRepository preinscripcionRepository
    ) {
        return new ActualizarPreinscripcionUseCase(preinscripcionRepository);
    }
    
    @Bean
    public ListarPreinscripcionesUseCase  listarPreinscripcionUseCase(
    		
    		PreinscripcionRepository preinscripcionRepository
    ) {
    	return new ListarPreinscripcionesUseCase(preinscripcionRepository);
    }
    
//    @Bean
//    public AprobarPreinscripcionUseCase aprobarPreinscripcionUseCase(
//    		
//    		PreinscripcionRepository preinscripcionRepository
//    ) {
//    	return new AprobarPreinscripcionUseCase(preinscripcionRepository);
//    }
    
    @Bean
    public RechazarPreinscripcionUseCase rechazarPreinscripcionUseCase(
    		
    		PreinscripcionRepository preinscripcionRepository
    ) {
    	return new RechazarPreinscripcionUseCase(preinscripcionRepository);
    }
    
    // =========================
    // ESTUDIANTE
    // =========================
    
    @Bean
    public CrearEstudianteUseCase crearEstudianteUseCase(
            EstudianteRepository estudianteRepository
    ) {
        return new CrearEstudianteUseCase(estudianteRepository);
    }

    @Bean
    public ActualizarEstudianteUseCase actualizarEstudianteUseCase(
            EstudianteRepository estudianteRepository
    ) {
        return new ActualizarEstudianteUseCase(estudianteRepository);
    }

    @Bean
    public BuscarEstudianteUseCase buscarEstudianteUseCase(
            EstudianteRepository estudianteRepository
    ) {
        return new BuscarEstudianteUseCase(estudianteRepository);
    }

    @Bean
    public ListarEstudiantesUseCase listarEstudiantesUseCase(
            EstudianteRepository estudianteRepository
    ) {
        return new ListarEstudiantesUseCase(estudianteRepository);
    }

    @Bean
    public DesactivarEstudianteUseCase desactivarEstudianteUseCase(
            EstudianteRepository estudianteRepository
    ) {
        return new DesactivarEstudianteUseCase(estudianteRepository);
    }
    
    // =========================
    // DOCUMENTACIÓN REQUERIDA
    // =========================
    
    @Bean public CrearDocumentacionRequeridaUseCase crearDocumentacionRequeridaUseCase(
    		DocumentacionRequeridaRepository docRequeridaRepository,
    		DocumentacionRequeridaValidator validator
    ) {
    	return new CrearDocumentacionRequeridaUseCase(docRequeridaRepository, validator);
    }
    
    @Bean public ActualizarDocumentacionRequeridaUseCase actualizarDocumentacionRequeridaUseCase(
    		DocumentacionRequeridaRepository docRequeridaRepository,
    		DocumentacionRequeridaValidator validator
    ) {
    	return new ActualizarDocumentacionRequeridaUseCase(docRequeridaRepository, validator);
    }
    
    @Bean public BuscarDocumentacionPorNombreUseCase buscarDocumentacionPorNombreUseCase(
    		DocumentacionRequeridaRepository docRequeridaRepository,
    		DocumentacionRequeridaValidator validator
    ) {
    	return new BuscarDocumentacionPorNombreUseCase(docRequeridaRepository, validator);
    }
    
    @Bean public ListarDocumentacionParaInscripcionUseCase listarDocumentacionParaInscripcionUseCase(
    		DocumentacionRequeridaRepository docRequeridaRepository,
    		DocumentacionRequeridaValidator validator
    ) {
    	return new ListarDocumentacionParaInscripcionUseCase(docRequeridaRepository, validator);
    }
    
    @Bean public ListarDocumentacionRequeridaUseCase listarDocumentacionRequeridaUseCase(
    		DocumentacionRequeridaRepository docRequeridaRepository
    ) {
    	return new ListarDocumentacionRequeridaUseCase(docRequeridaRepository);
    }
    
    @Bean public ObtenerDocumentacionRequeridaPorIdUseCase obtenerDocumentacionRequeridaPorIdUseCase(
    		DocumentacionRequeridaRepository docRequeridaRepository,
    		DocumentacionRequeridaValidator validator
    ) {
    	return new ObtenerDocumentacionRequeridaPorIdUseCase(docRequeridaRepository, validator);
    }
    
    @Bean public EliminarDocumentacionRequeridaUseCase eliminarDocumentacionRequeridaUseCase(
    		DocumentacionRequeridaRepository docRequeridaRepository,
    		DocumentacionRequeridaValidator validator
    ) {
    	return new EliminarDocumentacionRequeridaUseCase(docRequeridaRepository, validator);
    }
    
    @Bean
    public DocumentacionRequeridaValidator documentacionRequeridaValidator() {
        return new DocumentacionRequeridaValidator();
    }
}
