package com.springbootpostgres.spingboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.springbootpostgres.spingboot.controllers.HomeController;

@SpringBootApplication
@ComponentScan(basePackageClasses=HomeController.class)
@ComponentScan("com.springbootpostgres.spingboot.services")
@ComponentScan("com.springbootpostgres.spingboot.repositories")
public class SpingbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpingbootApplication.class, args);
	}

}
