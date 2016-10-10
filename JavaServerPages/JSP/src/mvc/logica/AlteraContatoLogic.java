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

public class AlteraContatoLogic implements Logica {

	@Override
	public void executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Contato contato = new Contato();
		long id = Long.parseLong(req.getParameter("id"));
		contato.setId(id);
		contato.setNome(req.getParameter("nome"));
		contato.setEmail(req.getParameter("email"));
		contato.setEndereco(req.getParameter("endereco"));
		
		// Converte Data de String para Calendar
		String dateEmTexto = req.getParameter("dataNascimento");
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateEmTexto);
		
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(date);
		contato.setDataNascimento(dataNascimento);

		Connection connection = (Connection) req.getAttribute("connection");
		
		ContatoDAO dao = new ContatoDAO(connection);
		dao.atualiza(contato);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/lista-contatos-tag.jsp");
		dispatcher.forward(req, res);
		System.out.println("Editando Contato " + contato.getNome());
	}

}
