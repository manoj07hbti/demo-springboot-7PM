package com.example.demospringboot7PM;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = {"com.example.demospringboot7PM.student.Model"})
@SpringBootApplication
public class DemoSpringboot7PmApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringboot7PmApplication.class, args);
	}

}
