package com.petshop.pataamiga.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.petshop.pataamiga.domain.Servico;

@Repository
public interface ServicoRepository extends CrudRepository<Servico,String>{
	
	

}
