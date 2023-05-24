package com.petshop.pataamiga.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petshop.pataamiga.domain.Usuario;
import com.petshop.pataamiga.repository.UsuarioRepository;

@Service
public class UsuarioServices {
	
	@Autowired
	private UsuarioRepository repository;
	
	public  List<Usuario> listaTodos() {
		return(List<Usuario>) repository.findAll();
	}
	
	public Usuario salvar(Usuario usuario) {
		return repository.save(usuario);
	}
	
	public Usuario buscaPorId(String id) {
		return repository.findById(id).get();
	}
	
	public void delete(String id) {
		repository.deleteById(id);
	}
	
	
}
