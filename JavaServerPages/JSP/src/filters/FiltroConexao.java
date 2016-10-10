package filters;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import factory.ConnectionFactory;

public class FiltroConexao implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		// Processamento vai aqui
		try {
			// Abre uma conexao
			Connection connection = new ConnectionFactory().getConnection();
			
			// Pendura objeto na Request
			req.setAttribute("connection", connection);
			
			// indica que o processamento deve seguir
			chain.doFilter(req, res);
			
			// fecha conexao
			connection.close();
		} catch (SQLException e) {
			throw new ServletException(e);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
