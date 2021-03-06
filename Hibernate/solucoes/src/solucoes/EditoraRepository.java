package solucoes;

import java.util.List;

import javax.persistence.EntityManager;

import models.Editora;

public class EditoraRepository {
	private EntityManager manager;
	
	public EditoraRepository(EntityManager manager) {
		this.manager = manager;
	}
	
	public void adiciona(Editora e) {
		this.manager.persist(e);
	}
	
	public Editora busca(Long id) {
		return this.manager.find(Editora.class, id);
	}
	
	public List<Editora> buscaTodas() {
		return manager.createQuery("SELECT e FROM Editora e")
				.getResultList();
	}
}
