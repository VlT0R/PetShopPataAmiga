package com.petshop.pataamiga.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.petshop.pataamiga.domain.Pet;
import com.petshop.pataamiga.repository.PetRepository;

@Service
public class PetServices {

	@Autowired
	private PetRepository repository;
	
	public  List<Pet> listaTodos() {
		return(List<Pet>) repository.findAll();
	}
	
	public Pet salvar(Pet pet) {
		return repository.save(pet);
	}
	
	public Pet buscaPorId(String id) {
		return repository.findById(id).get();
	}
	
	public void delete(String id) {
		repository.deleteById(id);
	}

}
