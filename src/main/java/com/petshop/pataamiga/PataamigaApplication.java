package com.petshop.pataamiga;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import jakarta.persistence.Persistence;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

@SpringBootApplication

public class PataamigaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PataamigaApplication.class, args);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-pataamiga");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.getTransaction().commit();
		System.out.print("Banco conectado com sucesso!");
	}
	
}
