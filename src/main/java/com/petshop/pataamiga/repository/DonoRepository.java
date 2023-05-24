package com.petshop.pataamiga.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.petshop.pataamiga.domain.Dono;

@Repository
public interface DonoRepository extends CrudRepository<Dono,String>{
	
	

}
