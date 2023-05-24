package com.petshop.pataamiga.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.petshop.pataamiga.domain.Funcionario;

@Repository
public interface FuncionarioRepository extends CrudRepository<Funcionario,String>{
	
	

}