package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo5StatementDelete {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/db2";
		String user = "root";
		String password = "1234";
		String sql = "delete from book where isbn = 3";
		
		try(Connection con = DriverManager.getConnection(url, user, password);) {
			// to run sql commands we need a Statement object - we get it from the connection
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println(sql);
		}

	}

}
