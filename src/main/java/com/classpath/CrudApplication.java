package com.classpath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication

public class CrudApplication {

	public static void main(String[] args) {
        System.out.println("***************************************");
        System.out.println("Came inside the correct class");
        SpringApplication.run(CrudApplication.class, args);
	}
}
