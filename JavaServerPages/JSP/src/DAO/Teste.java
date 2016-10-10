package DAO;

import java.util.Calendar;

import model.Contato;

public class Teste {
	public static void main(String[] args) {
		// pronto para gravar
        Contato contato = new Contato();
        contato.setNome("Joao Pedro");
        contato.setEmail("jp.rd@usp.br");
        contato.setEndereco("R. Vergueiro 3185 cj57");
        contato.setDataNascimento(Calendar.getInstance());
        // grave nessa conexão!!!
        ContatoDAO dao = new ContatoDAO();

        // método elegante
        dao.adiciona(contato);

        System.out.println("Gravado!");
	}
}
