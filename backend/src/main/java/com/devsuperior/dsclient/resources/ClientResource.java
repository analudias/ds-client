package com.devsuperior.dsclient.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsclient.dto.ClientDTO;
import com.devsuperior.dsclient.repositories.ClientRepository;
import com.devsuperior.dsclient.services.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@Autowired
	private ClientRepository repository;
	
	@Autowired
	private ClientService service;
	
	public ResponseEntity<List<ClientDTO>> findAll(){
		List<ClientDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
