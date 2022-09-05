package a;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo8MetaData {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/db2";
		String user = "root";
		String password = "1234";
		String sql = "select * from book";
		
		try(Connection con = DriverManager.getConnection(url, user, password);) {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData rsMeta = rs.getMetaData();
			int columns = rsMeta.getColumnCount(); // get the number of columns
			System.out.println(sql);
			
			while(rs.next()) {
				for (int col = 1; col <= columns; col++) {
					System.out.print(rsMeta.getColumnName(col) + "=" + rs.getObject(col) + ", ");
				}
				System.out.println();
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println(sql);
		}

	}

}
