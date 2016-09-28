package solucoes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import models.Editora;

public class ListaEditoraComJPA {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("teste");
		
		EntityManager entityManager = factory.createEntityManager();

		EditoraRepository repository = new EditoraRepository(entityManager);
		List<Editora> editoras = repository.buscaTodas();
		
		for (Editora e : editoras) {
			System.out.println("Editora: " + e.getNome() + " - " + e.getEmail());
		}
		
		entityManager.close();
		factory.close();
	}
}
