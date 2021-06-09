package com.myspringapi.logistica.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myspringapi.logistica.domain.model.Client;
import com.myspringapi.logistica.domain.repository.ClientRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class ClientController {
	
	private ClientRepository clientRepository;

	@GetMapping("/clients")
	public List<Client> show() {
		return clientRepository.findAll();
	}
}
