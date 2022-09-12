package app.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ConnectionPool {

	private Set<Connection> connections = new HashSet<>();
	public static final int MAX_CONNECTIONS = 2;
	private boolean isActive;
	private String url = "jdbc:mysql://localhost:3306/db_coupons";
	private String user = "root";
	private String password = "1234";

	private static ConnectionPool instance;
	
	static {
		try {
			instance = new ConnectionPool();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

	private ConnectionPool() throws SQLException {
		for (int i = 0; i < MAX_CONNECTIONS; i++) {
			this.connections.add(DriverManager.getConnection(url, user, password));
		}
		isActive = true;
		System.out.println("connection pool up");
	}

	public static ConnectionPool getInstance() throws CouponSystemException {
		return instance;
	}

	public synchronized Connection getConnection() throws CouponSystemException {
		if (!isActive) {
			throw new CouponSystemException("getConnection failed - connection pool not active");
		}
		while (this.connections.isEmpty()) {
			try {
				System.out.println("=====> " + Thread.currentThread().getName() + " is witing");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		Iterator<Connection> it = this.connections.iterator();
		Connection con = it.next();
		it.remove();
		return con;
	}

	public synchronized void returnCOnnection(Connection con) {
		this.connections.add(con);
		notify();
	}

	public synchronized void closeAllConnections() throws CouponSystemException {
		this.isActive = false;
		while (this.connections.size() < MAX_CONNECTIONS) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (Connection connection : connections) {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new CouponSystemException("closeAllConnections failure", e);
			}
		}
		System.out.println("connection pool down");
	}
	
	

}
