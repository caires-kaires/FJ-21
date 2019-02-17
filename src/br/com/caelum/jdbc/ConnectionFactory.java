package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnetion(){
		
		try{
			return DriverManager.getConnection("jdbc:mysql://localhost/fj21?useTimezone=true&serverTimezone=UTC&verifyServerCertificate=false&useSSL=true", "root", "root");
			
		}
		catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
}