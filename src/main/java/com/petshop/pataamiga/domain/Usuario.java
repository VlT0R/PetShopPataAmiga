package com.petshop.pataamiga.domain;


import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "usuario")
public class Usuario implements Serializable{
		
	private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		//@Column(name="id")
		private int id;
		
		@Column(name="nome")
		private String Nome;
		
		@Column(name="login")
		private String Login;
		
		@Column(name="senha")
		private String Senha;
		
		
		public Usuario() {
			
		}
		
	
		public Usuario(int id, String nome, String login, String senha) {
			super();
			this.id = id;
			Nome = nome;
			Login = login;
			Senha = senha;
		}


		//get e set
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNome() {
			return Nome;
		}
		public void setNome(String nome) {
			Nome = nome;
		}
		public String getLogin() {
			return Login;
		}
		public void setLogin(String login) {
			Login = login;
		}
		public String getSenha() {
			return Senha;
		}
		public void setSenha(String senha) {
			Senha = senha;
		}


		@Override
		public String toString() {
			return "Usuario [id=" + id + ", Nome=" + Nome + ", Login=" + Login + ", Senha=" + Senha + "]";
		}
		
		
	

}
