package dl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	
		private static ConnectionFactory connectionFactory = new ConnectionFactory();
		private Properties props = new Properties();
		
		static {
			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		private ConnectionFactory() {
			try {
				ClassLoader loader = Thread.currentThread().getContextClassLoader();
				props.load(loader.getResourceAsStream ("db.properties"));
			} catch(IOException e) {
				e.printStackTrace();
				
			}
		}
		//lazy loading
		public static ConnectionFactory getInstance() {
			if (connectionFactory == null) connectionFactory = new ConnectionFactory();
			return connectionFactory;
		}
		
		public Connection getconnection() {
			Connection conn = null;
			try {
				conn = DriverManager.getConnection(
						props.getProperty("url"),
						props.getProperty("username"),
						props.getProperty("password")
						);
						
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return conn;
		}
		
	}


