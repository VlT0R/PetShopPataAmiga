package com.petshop.pataamiga.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.petshop.pataamiga.domain.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario,String>{
	
	

}
