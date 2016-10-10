package Testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Pessoa;

public class TestFind {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("entity-manager");
		EntityManager manager = factory.createEntityManager();
		
		// Objeto no estado managed
		Pessoa p = manager.find(Pessoa.class, 1L);
		System.out.println("id:"+p.getId());
		System.out.println("nome:"+p.getNome());
				
		// Alterando conteudo
		p.setNome("João Pedro");
		
		manager.getTransaction().begin();
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
}
