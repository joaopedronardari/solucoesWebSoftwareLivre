package Testes;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelos.Autor;
import modelos.Livro;

public class TesteNamedQuery {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpql");
		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createNamedQuery("Autor.findAll");
		List<Autor> autores = query.getResultList();
		for (Autor a : autores) {
			System.out.println("Autor: " + a.getNome());
			Collection<Livro> livros = a.getLivros();
			
			for (Livro livro : livros) {
				System.out.println("	Livro:" + livro.getNome());
				System.out.println("	Preco:" + livro.getPreco());
				System.out.println();
			}
		}
		
		manager.close();
		factory.close();
	}
}
