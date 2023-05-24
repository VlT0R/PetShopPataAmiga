package com.petshop.pataamiga.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petshop.pataamiga.domain.Servico;
import com.petshop.pataamiga.repository.ServicoRepository;

@Service
public class ServicoServices {

	@Autowired
	private ServicoRepository repository;
	
	public  List<Servico> listaTodos() {
		return(List<Servico>) repository.findAll();
	}
	
	public Servico salvar(Servico servico) {
		return repository.save(servico);
	}
	
	public Servico buscaPorId(String id) {
		return repository.findById(id).get();
	}
	
	public void delete(String id) {
		repository.deleteById(id);
	}

}
