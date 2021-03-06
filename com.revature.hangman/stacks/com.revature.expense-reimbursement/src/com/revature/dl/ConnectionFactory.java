package com.revature.dl;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

public class ConnectionFactory {
	// eager loading - you create instance of connection factory as soon as the program starts up
	private static final ConnectionFactory connectionFactory = new ConnectionFactory();
	// hold db config stuff
	private Properties prop = new Properties();
	
	// force load postgresql driver
	// static members of class get loaded into memory at the start of program runtime
	// static blocks get run at the start
	static {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// singletons are characterized by the private constructor
	private ConnectionFactory() {
		// loading properties file that contains db config
		try {
			ClassLoader loader = Thread.currentThread().getContextClassLoader();
			prop.load(loader.getResourceAsStream("db.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// as well as the getInstance method
	public static ConnectionFactory getInstance()
	{
		//lazy loading - create instance of connection factory when you call it 
		//if(connectionFactory == null) connectionFactory = new ConnectionFactory();
		return connectionFactory;
	}

	public Connection getConnection() {
		/// TODO Auto-generated method stub
		//
		return null;
	}
}