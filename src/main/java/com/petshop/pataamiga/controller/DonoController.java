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

import com.petshop.pataamiga.domain.Dono;
import com.petshop.pataamiga.services.DonoServices;



@RestController
@RequestMapping("/dono")
public class DonoController {
	
	@Autowired
	private DonoServices service;
	
	@GetMapping
	public List<Dono> listaTodos() {
		return service.listaTodos();
		
	}
	
	@GetMapping("/{id}")
	public Dono buscaPorId(@PathVariable String id) {
		Dono dono = service.buscaPorId(id);
		
		if(dono == null) {
			return null;
		}
		return dono;
	 }
	
	@PostMapping
	public Dono salvar(@RequestBody Dono dono) {
		return service.salvar(dono);
	}
	
	@PutMapping
	public Dono alterar(@RequestBody Dono dono) {
		return service.salvar(dono);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		service.delete(id);
	}
	



}
