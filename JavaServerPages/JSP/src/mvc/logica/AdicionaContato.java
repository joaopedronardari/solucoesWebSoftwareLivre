package mvc.logica;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ContatoDAO;
import model.Contato;

public class AdicionaContato implements Logica {

	@Override
	public void executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		String endereco = req.getParameter("endereco");
		String dataNascimentoTexto = req.getParameter("dataNascimento");
		
		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setEmail(email);
		contato.setEndereco(endereco);
		
		// Transforma data em texto em calendar
		Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimentoTexto);
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(data);
		contato.setDataNascimento(dataNascimento);
		
		// Connection vinda do filter
		Connection connection = (Connection) req.getAttribute("connection");
		
		ContatoDAO dao = new ContatoDAO(connection);
		dao.adiciona(contato);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/lista-contatos-tag.jsp");
		dispatcher.forward(req, res);
		System.out.println("Adicionando Contato " + contato.getNome());
	}
	
}
