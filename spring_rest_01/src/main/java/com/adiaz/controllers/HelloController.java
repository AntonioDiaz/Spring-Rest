package com.adiaz.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.adiaz.beans.HelloBean;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String helloWorld() {
		return "vamos q nos vamos!!!";
	}
	
	@GetMapping("/greeting/{name}")
	public String greeting(@PathVariable String name) {
		return "Better call " + name;
	}

	@GetMapping("/helloBean")
	public HelloBean helloBean() {
		return new HelloBean("Aupa Atleti!!");
	}

	@GetMapping("/helloBean/{name}")
	public HelloBean helloBeanName(@PathVariable String name ) {
		return new HelloBean(name + ": Aupa Atleti!!");
	}

	
}
