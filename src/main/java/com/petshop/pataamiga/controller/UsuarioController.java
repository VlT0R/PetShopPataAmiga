package com.petshop.pataamiga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petshop.pataamiga.domain.Usuario;
import com.petshop.pataamiga.services.UsuarioServices;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioServices service;
	
	@GetMapping
	public List<Usuario> listaTodos() {
		return service.listaTodos();
		
	}
	
	@GetMapping("/{id}")
	public Usuario buscaPorId(@PathVariable String id) {
		Usuario usuario = service.buscaPorId(id);
		
		if(usuario == null) {
			return null;
		}
		return usuario;
	 }
	
	@PostMapping
	public Usuario salvar(@RequestBody Usuario usuario) {
		return service.salvar(usuario);
	}
	
	@PutMapping
	public Usuario alterar(@RequestBody Usuario usuario) {
		return service.salvar(usuario);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		service.delete(id);
	}
	
	
	
	


}
