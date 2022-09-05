package a;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo7StatementReadLoop {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/db2";
		String user = "root";
		String password = "1234";
		String sql = "select * from book";
		
		try(Connection con = DriverManager.getConnection(url, user, password);) {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println(sql);
			
			while(rs.next()) {
				int isbn = rs.getInt(1);
				String author = rs.getString(2);
				String title = rs.getString(3);
				double price = rs.getDouble(4);
				Date publication = rs.getDate(5);
				System.out.println(isbn + ", " + author + ", " + title + ", " + price + ", " + publication);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println(sql);
		}

	}

}
