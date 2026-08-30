package com.testeapi.PrimeiraAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class PrimeiraAPI {

	public static void main(String[] args) {
		SpringApplication.run(PrimeiraAPI.class, args);
	}
	@GetMapping("/")
	public String Hello(){
		return "Hello World!";
	}

}
