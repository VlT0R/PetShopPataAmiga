package com.petshop.pataamiga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petshop.pataamiga.domain.Servico;
import com.petshop.pataamiga.services.ServicoServices;

@RestController
@RequestMapping("/servico")
public class ServicoController {

	@Autowired
	private ServicoServices service;
	
	@GetMapping
	public List<Servico> listaTodos() {
		return service.listaTodos();
		
	}
	
	@GetMapping("/{id}")
	public Servico buscaPorId(@PathVariable String id) {
		Servico servico = service.buscaPorId(id);
		
		if(servico == null) {
			return null;
		}
		return servico;
	 }
	
	@PostMapping
	public Servico salvar(@RequestBody Servico servico) {
		return service.salvar(servico);
	}
	
	@PutMapping
	public Servico alterar(@RequestBody Servico servico) {
		return service.salvar(servico);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		service.delete(id);
	}

}
