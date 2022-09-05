package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) {
		
		// data source details
		String url = "jdbc:mysql://localhost:3306/db8?createDatabaseIfNotExist=true";
		String user = "root";
		String password = "1234";
		// sql queries
		String sqlTable = "create table person (id int primary key auto_increment, name varchar(25), age int)";
		String sqlInsert1 = "insert into person values(0, 'Alon', 18)";
		String sqlInsert2 = "insert into person values(0, 'Dafna', 23)";
		String sqlselect = "select * from person";
		
		try(Connection con = DriverManager.getConnection(url, user, password)){ // get a connection
			Statement stmt = con.createStatement();
			// for create, update delete use executeUpdate:
			stmt.executeUpdate(sqlTable);
			stmt.executeUpdate(sqlInsert1);
			stmt.executeUpdate(sqlInsert2);
			
			// for select use executeQuery and get a  ResultSet:
			ResultSet rs = stmt.executeQuery(sqlselect);
			while(rs.next()) { // next goes to next line
				// get column data of current row
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				System.out.println(id + ", " + name + ", " + age);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
