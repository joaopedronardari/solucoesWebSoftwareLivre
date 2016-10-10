package Testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Conta;

public class AdicionaConta {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("entity-manager");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Conta c = new Conta();
		c.setSaldo(2000);
		
		// Transformou em managed
		manager.persist(c);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
}
