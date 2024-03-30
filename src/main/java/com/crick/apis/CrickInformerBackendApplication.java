package com.crick.apis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.crick.entities")
@ComponentScan(basePackages = {"com.crick", "com.crick.service",}) 
@ComponentScan(basePackages = {"com.crick", "com.crick.repositories"})
public class CrickInformerBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrickInformerBackendApplication.class, args);
		System.out.println("Hello");
	}

}
