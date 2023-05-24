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

import com.petshop.pataamiga.domain.Funcionario;
import com.petshop.pataamiga.services.FuncionarioServices;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
	
	@Autowired
	private FuncionarioServices service;
	
	@GetMapping
	public List<Funcionario> listaTodos() {
		return service.listaTodos();
		
	}
	
	@GetMapping("/{id}")
	public Funcionario buscaPorId(@PathVariable String id) {
		Funcionario funcionario = service.buscaPorId(id);
		
		if(funcionario == null) {
			return null;
		}
		return funcionario;
	 }
	
	@PostMapping
	public Funcionario salvar(@RequestBody Funcionario funcionario) {
		return service.salvar(funcionario);
	}
	
	@PutMapping
	public Funcionario alterar(@RequestBody Funcionario funcionario) {
		return service.salvar(funcionario);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		service.delete(id);
	}
	

}
