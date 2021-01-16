package com.proyecto.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("holas")
public class HelloWorldController {
	
	@GetMapping
	public String saludo() {
		return "Hola mundo a todos tpdps";
	}

}
