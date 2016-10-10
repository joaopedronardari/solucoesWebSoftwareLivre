package solucoes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author docente
 */
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import models.Editora;

public class InsereEditoraComJPA {
    public static void main(String[] args) {
      EntityManagerFactory factory =
         Persistence.createEntityManagerFactory("teste");

      EntityManager manager = factory.createEntityManager();

      Editora novaEditora = new Editora();
      Scanner entrada = new Scanner(System.in);

      System.out.println("Digite o nome da editora : ");
      novaEditora.setNome(entrada.nextLine());

      System.out.println("Digite o email da editora : ");
      novaEditora.setEmail(entrada.nextLine());

      EditoraRepository repository = new EditoraRepository(manager);
      repository.adiciona(novaEditora);
      
      manager.getTransaction().begin();
      manager.getTransaction().commit();

      manager.close();
      factory.close();
 }
    
}