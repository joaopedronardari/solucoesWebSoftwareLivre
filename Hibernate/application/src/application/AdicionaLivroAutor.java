package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AdicionaLivroAutor {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("teste");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Autor a = new Autor();
		a.setNome("João Pedro");
		
		Livro livro1 = new Livro();
		livro1.setNome("Livro Teste");
		livro1.getAutores().add(a);
		
		manager.persist(a);
		manager.persist(livro1);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
}
