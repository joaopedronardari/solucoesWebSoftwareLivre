package application;

import java.util.Collection;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AdicionaFaturaLigacao {
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("teste");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		
		Ligacao l1 = new Ligacao();
		l1.setDuracao(100);
		Ligacao l2 = new Ligacao();
		l2.setDuracao(200);
		
		Fatura f = new Fatura();
		f.setVencimento(new GregorianCalendar(2016, 11, 20));
		
		Collection<Ligacao> ligacoes = f.getLigacoes();
		ligacoes.add(l1);
		ligacoes.add(l2);
		
		l1.setFatura(f);
		l2.setFatura(f);
		
		manager.persist(f);
		manager.persist(l1);
		manager.persist(l2);
		
		transaction.commit();
		
		manager.close();
		factory.close();
	}
	
}
