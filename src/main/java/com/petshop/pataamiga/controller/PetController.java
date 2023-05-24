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

import com.petshop.pataamiga.domain.Pet;
import com.petshop.pataamiga.services.PetServices;

@RestController
@RequestMapping("/pet")
public class PetController {
	
	@Autowired
	private PetServices service;
	
	@GetMapping
	public List<Pet> listaTodos() {
		return service.listaTodos();
		
	}
	
	@GetMapping("/{id}")
	public Pet buscaPorId(@PathVariable String id) {
		Pet pet = service.buscaPorId(id);
		
		if(pet == null) {
			return null;
		}
		return pet;
	 }
	
	@PostMapping
	public Pet salvar(@RequestBody Pet pet) {
		return service.salvar(pet);
	}
	
	@PutMapping
	public Pet alterar(@RequestBody Pet pet) {
		return service.salvar(pet);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		service.delete(id);
	}
	

	

}
