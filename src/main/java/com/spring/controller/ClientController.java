package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.ClientM;
import com.spring.service.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private ClientService service;

	@GetMapping
	public ResponseEntity<List<ClientM>> getAll() {
		return ResponseEntity.ok(service.getAll());
	}

	@PostMapping("/new")
	public ResponseEntity<ClientM> saveNew(@RequestBody ClientM data) {
		return ResponseEntity.ok(service.saveNew(data));
	}

	@PostMapping("/update")
	public ResponseEntity<ClientM> saveUpdate(@RequestBody ClientM data) {
		return ResponseEntity.ok(service.saveUpdate(data));
	}

	@GetMapping("/delete/id/{id}")
	public ResponseEntity<?> remove(@RequestParam("id") Long id) {
		service.remove(id);
		return ResponseEntity.ok(HttpStatus.ACCEPTED);
	}
}