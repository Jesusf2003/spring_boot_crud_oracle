package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.ClientM;
import com.spring.model.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repo;

	public List<ClientM> getAll() {
		return (List<ClientM>) repo.findAll();
	}

	public ClientM saveNew(ClientM data) {
		return repo.save(data);
	}

	public ClientM saveUpdate(ClientM data) {
		return repo.save(data);
	}

	public void remove(Long id) {
		repo.deleteById(id);
	}
}