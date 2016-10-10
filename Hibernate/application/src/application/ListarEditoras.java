package application;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ListarEditoras {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("teste");
		EntityManager manager = factory.createEntityManager();
		EditoraRepository repository = new EditoraRepository(manager);
		
		List<Editora> list = repository.buscaTodas();
		
		for (Editora editora : list) {
			System.out.println("Editora:" + editora.getNome() + " - " + editora.getEmail());
		}
		
		manager.close();
		factory.close();
	}
}
