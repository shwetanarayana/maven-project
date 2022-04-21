package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MavenSampleprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenSampleprojectApplication.class, args);
	}

	@GetMapping("/hello")
	public String helloUser() {
		return "hello shweta";
	}
}
