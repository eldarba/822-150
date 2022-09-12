package app.core;

import java.sql.Connection;

public class Test3 {

	public static void main(String[] args) throws CouponSystemException {
		Connection c1 = ConnectionPool.getInstance().getConnection();
		System.out.println("---");
		Connection c2 = ConnectionPool.getInstance().getConnection();
		System.out.println("---");
		Connection c3 = ConnectionPool.getInstance().getConnection();
		System.out.println("---");
		Connection c4 = ConnectionPool.getInstance().getConnection();
		System.out.println("---");

	}

}
