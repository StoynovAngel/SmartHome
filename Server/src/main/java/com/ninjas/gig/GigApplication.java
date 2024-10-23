package com.ninjas.gig;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Objects;

@SpringBootApplication
public class GigApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();
		System.setProperty("SPRING_APPLICATION_NAME", Objects.requireNonNull(dotenv.get("SPRING_APPLICATION_NAME")));
		System.setProperty("SPRING_DATASOURCE_URL", Objects.requireNonNull(dotenv.get("SPRING_DATASOURCE_URL")));
		System.setProperty("SPRING_DATASOURCE_DRIVER_CLASS_NAME", Objects.requireNonNull(dotenv.get("SPRING_DATASOURCE_DRIVER_CLASS_NAME")));
		System.setProperty("SPRING_DATASOURCE_USERNAME", Objects.requireNonNull(dotenv.get("SPRING_DATASOURCE_USERNAME")));
		System.setProperty("SPRING_DATASOURCE_PASSWORD", Objects.requireNonNull(dotenv.get("SPRING_DATASOURCE_PASSWORD")));
		System.setProperty("SPRING_JPA_DATABASE_PLATFORM", Objects.requireNonNull(dotenv.get("SPRING_JPA_DATABASE_PLATFORM")));
		System.setProperty("SPRING_JPA_HIBERNATE_DDL_AUTO", Objects.requireNonNull(dotenv.get("SPRING_JPA_HIBERNATE_DDL_AUTO")));
		SpringApplication.run(GigApplication.class, args);
	}

}
