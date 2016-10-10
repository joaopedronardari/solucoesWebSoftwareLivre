package factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	private Connection con;
	
	public Connection getConnection() {
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/agenda", "postgres", "each");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
