package dl;

public class ConnectionFactory {
	
		private static ConnectionFactory connectionFactory;
		private db.properties prop = new Properties();
		private final Logger logger = LogManager.getLogger(this.getClass());
		
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
				prop.load(loader.getResourceAsStream ("db.properties"));
			} catch(IOException e) {
				e.printStackTrace();
				logger.error("Cant't get connection");
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
						prop.getProperty("url"),
						prop.getProperty("username"),
						prop.getProperty("password")
						);
						
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return conn;
		}
		
	}

}
