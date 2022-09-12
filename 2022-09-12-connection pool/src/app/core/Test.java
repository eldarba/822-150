package app.core;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class Test {

	public static void main(String[] args) {
		
		try {
			Connection con = ConnectionPool.getInstance().getConnection();
			System.out.println(con);
			
			try(Statement stmt = con.createStatement()){
				System.out.println("statment created");
				System.out.println("database operations");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("statment closed");
			
			ConnectionPool.getInstance().returnCOnnection(con);
			System.out.println("connection returned");
			
		} catch (CouponSystemException e) {
			e.printStackTrace();
		}finally {
			try {
				ConnectionPool.getInstance().closeAllConnections();
				System.out.println("all connections closed");
			} catch (CouponSystemException e) {
				e.printStackTrace();
			}
		}

	}

}
