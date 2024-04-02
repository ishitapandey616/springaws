package com.aws.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
//@RestController
//@RequestMapping("/book")
public class SpringbootAwsApplication {
	
	
	@GetMapping("/")
	public String home() {
		return "Hi springboot application is deployed";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootAwsApplication.class, args);
	}

}
