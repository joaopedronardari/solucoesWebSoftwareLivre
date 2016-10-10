package mvc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.logica.Logica;

public class ControllerServlet extends HttpServlet {
	
	private static final String basePkg = "mvc.logica.";
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String parametro = req.getParameter("logica");
		String nomeDaClasse = basePkg+parametro;
		
		try {
			Class classe = Class.forName(nomeDaClasse);
			Logica logica = (Logica) classe.newInstance();
			logica.executa(req, res);
		} catch (Exception e) {
			throw new ServletException("A Logica de Negocios causou uma exceção");
		}
	}
}
