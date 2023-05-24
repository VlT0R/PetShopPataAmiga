package com.petshop.pataamiga.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petshop.pataamiga.domain.Funcionario;
import com.petshop.pataamiga.repository.FuncionarioRepository;

@Service
public class FuncionarioServices {
	
	@Autowired
	private FuncionarioRepository repository;
	
	public  List<Funcionario> listaTodos() {
		return(List<Funcionario>) repository.findAll();
	}
	
	public Funcionario salvar(Funcionario funcionario) {
		return repository.save(funcionario);
	}
	
	public Funcionario buscaPorId(String id) {
		return repository.findById(id).get();
	}
	
	public void delete(String id) {
		repository.deleteById(id);
	}
	
	
}
