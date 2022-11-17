package core.data;

public class ConnectionPool {

	private static ConnectionPool instance = new ConnectionPool();

	private ConnectionPool() {
	}

	public static ConnectionPool getInstance() {
		return instance;
	}

	public void init() {
		System.out.println("connection pool up");
	}

	public void cloaseAllConnections() {
		System.out.println("connection pool down");
	}

}
