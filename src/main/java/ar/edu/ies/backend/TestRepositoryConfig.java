package ar.edu.ies.backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class TestRepositoryConfig {

	@Bean
    CommandLineRunner generarHash(PasswordEncoder encoder) {
        return args -> {
            String hash = encoder.encode("1234");
            System.out.println("HASH BCrypt: " + hash);
        };
	}
}
