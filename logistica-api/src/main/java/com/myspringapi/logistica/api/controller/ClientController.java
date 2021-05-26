package com.myspringapi.logistica.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myspringapi.logistica.domain.model.Client;

@RestController
public class ClientController {
	@GetMapping("/clients")
	public List<Client> show() {
		Client client1 = new Client();
		client1.setId(1L);
		client1.setName("Cliente one name");
		client1.setEmail("clientoneemail@email.com");
		client1.setPhone("55 44 333222111");
		
		Client client2 = new Client();
		client2.setId(1L);
		client2.setName("Cliente two name");
		client2.setEmail("clientoneemail@email.com");
		client2.setPhone("55 44 333222111");
		
		return Arrays.asList(client1, client2);
	}
}
