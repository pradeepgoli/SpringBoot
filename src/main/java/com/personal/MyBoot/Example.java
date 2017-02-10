package com.personal.MyBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/boot")
public class Example {

	@RequestMapping("/home")
	String home() {
		return "Hello world reddy";
	}
	
	@RequestMapping("/name")
	String name(){
		return "pradeepgolireddy";
	}
	
	public static void main(String args[]) {
		SpringApplication.run(Example.class, args);
	}
	
}
