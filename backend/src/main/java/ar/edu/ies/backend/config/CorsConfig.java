package ar.edu.ies.backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// CORS (Cross-Origin Resource Sharing: Intercambio de recursos entre orígenes)
// Permite que WinForms pueda consumir API
@Configuration
public class CorsConfig implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry
			.addMapping("/api/**") // Aplica todas las rutas que empiecen con /api/
			.allowedOrigins("*") // Permite requests desde cualquier origen (solo para desarrollo)
			.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Métodos HTTP permitidos
			.allowedHeaders("*") // Permite todos los headers
			.allowCredentials(false); // No permite coockies (porque usamos JWT)
	}
}
