package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo3Statement {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/db2";
		String user = "root";
		String password = "1234";
		String sql = "insert into book values(0, 'Java-1', 'Eldar',30 ,'2020-01-18')";
		
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
