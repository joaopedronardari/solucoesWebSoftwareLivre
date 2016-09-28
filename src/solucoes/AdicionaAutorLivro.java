package solucoes;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import relacionamentos.Autor;
import relacionamentos.Livro;

public class AdicionaAutorLivro {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("teste");
		
		EntityManager entityManager = factory.createEntityManager();
		
		Livro livro = new Livro();
		
		livro.addAutor(new Autor("JP"));
		livro.addAutor(new Autor("Teste"));
		
		entityManager.persist(livro);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		factory.close();
	}
}
