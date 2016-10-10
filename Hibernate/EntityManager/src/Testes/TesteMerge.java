package Testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Pessoa;

public class TesteMerge {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("entity-manager");
		EntityManager manager = factory.createEntityManager();
		
		// Objeto no estado managed
		Pessoa p = manager.find(Pessoa.class, 1L);

		// Objeto no estado detached
		manager.detach(p);
		
		// Objeto p2 no estado managed
		Pessoa p2 = manager.merge(p);
		
		// Alterando conteudo
		p2.setNome("Jo�o Pedro Nardari");
		
		manager.getTransaction().begin();
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
}
