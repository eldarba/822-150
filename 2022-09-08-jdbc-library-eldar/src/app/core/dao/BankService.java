package app.core.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import app.core.exceptions.LibraryException;

public class BankService {
	
	private CustomerDao customerDao = new CustomerDaoImpl();
	
	private String url = "jdbc:mysql://localhost:3306/db2";
	private String user = "root";
	private String password = "1234";
	
	// transaction
	public void trasferMoney(int fromId, int toId, double amount) {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, password);
			con.setAutoCommit(false);
			customerDao.takeMoney(con, fromId, amount);
			customerDao.addMoney(con, toId, amount);
			con.commit(); // set the changes permanently
			System.out.println("commited");
		} catch (SQLException | LibraryException e) {
			try {
				con.rollback(); // cancel changes
				System.out.println("rolled back");
				throw new LibraryException(e);
			} catch (SQLException e1) {
				throw new LibraryException(e);
			}
		}finally {
			try {
				if(con!=null) {
					con.close();
				}
			} catch (SQLException e) {
				throw new LibraryException(e);
			}
		}
	}

	

}
