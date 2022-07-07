package com.example.demo.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyfirstdockerappApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(MyfirstdockerappApplication.class, args);
	}
	@GetMapping("/")
	public String getMsg() {
		return "welcome to Mike's very nice app :)";
	}
	
}
