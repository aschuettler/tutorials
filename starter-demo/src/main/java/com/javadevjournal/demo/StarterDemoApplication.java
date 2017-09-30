package com.javadevjournal.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.javadevjournal"})
public class StarterDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarterDemoApplication.class, args);
	}
}
