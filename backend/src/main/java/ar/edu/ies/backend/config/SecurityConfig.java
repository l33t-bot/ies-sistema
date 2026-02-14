package ar.edu.ies.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
            // Deshabilitamos CSRF para APIs REST
            .csrf(csrf -> csrf.disable())

            // Autorizaciones
            .authorizeHttpRequests(auth -> auth
                // Permitimos login sin autenticación
                .requestMatchers("/api/auth/**").permitAll()
                // Todo lo demás requiere auth
                .anyRequest().authenticated()
            )

            // Deshabilitamos login por formulario
            .httpBasic(Customizer.withDefaults());

        return http.build();
    }
}