package com.myspringapi.logistica.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	@GetMapping("/clients")
	public String show() {
		return "Teste 1";
	}
}
