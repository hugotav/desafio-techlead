package DesafioDevTechlead;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
public Connection recuperarConexao() throws SQLException {
		
		return DriverManager
				.getConnection("jdbc:mysql://localhost/biblioteca?useTimezone=true&serverTimezone=UTC", "root", "mysqlroot");
		
		
		
	}
	

}
