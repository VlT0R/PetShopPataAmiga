package com.petshop.pataamiga.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "servico")
public class Servico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name="id")
	private int id;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JsonProperty("pet")
	//@Column(name="pet")
	private Pet pet;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JsonProperty("funcionario")
	//@Column(name="funcionario")
	private Funcionario funcionario;
	
	@Column(name="tipo")
	private String tipo;
	
	@Column(name="preco")
	private float preco;
	
	@Column(name="data_hora")
	private String data_hora;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getData_hora() {
		return data_hora;
	}
	public void setData_hora(String data_hora) {
		this.data_hora = data_hora;
	}
	
	
}
