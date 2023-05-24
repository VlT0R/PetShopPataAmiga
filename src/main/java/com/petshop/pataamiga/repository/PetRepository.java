package com.petshop.pataamiga.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.petshop.pataamiga.domain.Pet;

@Repository
public interface PetRepository extends CrudRepository<Pet,String>{
	
	

}
