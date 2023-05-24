package com.petshop.pataamiga.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petshop.pataamiga.domain.Dono;
import com.petshop.pataamiga.repository.DonoRepository;

@Service
public class DonoServices {
	
	@Autowired
	private DonoRepository repository;
	
	public  List<Dono> listaTodos() {
		return(List<Dono>) repository.findAll();
	}
	
	public Dono salvar(Dono dono) {
		return repository.save(dono);
	}
	
	public Dono buscaPorId(String id) {
		return repository.findById(id).get();
	}
	
	public void delete(String id) {
		repository.deleteById(id);
	}
	
	
}
