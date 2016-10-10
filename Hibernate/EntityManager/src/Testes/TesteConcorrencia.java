package Testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import modelo.Conta;

public class TesteConcorrencia {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("entity-manager");
		EntityManager manager1= factory.createEntityManager();
		EntityTransaction transaction1 = manager1.getTransaction();
		
		EntityManager manager2 = factory.createEntityManager();
		EntityTransaction transaction2 = manager2.getTransaction();
		
		transaction1.begin();
		transaction2.begin();
		
		Conta conta1 = manager1.find(Conta.class, 4L);
		conta1.setSaldo(conta1.getSaldo() + 500);
		
		Conta conta2 = manager2.find(Conta.class, 4L);
		conta2.setSaldo(conta2.getSaldo() - 500);
		
		transaction1.commit();
		transaction2.commit();
		
		System.out.println("Conta1: " + conta1.getSaldo());
		System.out.println("Conta2: " + conta2.getSaldo());
		
		manager1.close();
		manager2.close();
		
		factory.close();
	}
}
