package ar.edu.ies.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}

/*
 * Orden de creación de las clases: Models(entity), DTOs,
 * Mapper, repository, Service, Controller, Actualización: SecurityConfig
 * */
