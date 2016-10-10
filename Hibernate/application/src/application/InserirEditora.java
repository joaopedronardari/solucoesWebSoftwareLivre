package application;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InserirEditora {
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("teste");
		
		EntityManager manager = factory.createEntityManager();
		
		EditoraRepository repository = new EditoraRepository(manager);
		
		Editora editora = new Editora();
		
		Scanner entrada = new Scanner(System.in);
		editora.setNome(entrada.nextLine());
		editora.setEmail(entrada.nextLine());
		
		repository.adiciona(editora);
		
		manager.getTransaction().begin();
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
	
}
