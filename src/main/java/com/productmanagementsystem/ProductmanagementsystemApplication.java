package com.productmanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;

@SpringBootApplication
public class ProductmanagementsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductmanagementsystemApplication.class, args);
	}

	@Bean
	public OpenAPI getOpenAPI() {
		return new OpenAPI();
	} 
}
