package com.kubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/kubapi")
public class SpringK8SAppApplication {

	@GetMapping("/get")
	public String displayMessage()
	{
		return "Hello World";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringK8SAppApplication.class, args);
	}
	

}
