package Testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import modelo.Pessoa;

public class TestPersist {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("entity-manager");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		// Abrindo transacao
		transaction.begin();
		
		// objeto no estado new
		Pessoa p = new Pessoa();
		p.setNome("Joao");

		// objeto no estado managed
		manager.persist(p);
		
		// Sincronizando e terminando transacao
		transaction.commit();
		
		System.out.println(p.getId() + ":" + p.getNome());
		
		manager.close();
		factory.close();
	}
}
