package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo6StatementRead {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/db2";
		String user = "root";
		String password = "1234";
		String sql = "select * from book";
		
		try(Connection con = DriverManager.getConnection(url, user, password);) {
			// to run sql commands we need a Statement object - we get it from the connection
			Statement stmt = con.createStatement();
			// to perform select use executeQuery and get a ResultSet
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println(sql);
			
			// access ResultSet data
			rs.next(); // go to next line
			int isbn = rs.getInt("isbn");
			String title = rs.getString(2);
			System.out.println(isbn);
			System.out.println(title);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println(sql);
		}

	}

}
