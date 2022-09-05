package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonDaoImpl implements PersonDao {

	private String url = "jdbc:mysql://localhost:3306/db8?createDatabaseIfNotExist=true";
	private String user = "root";
	private String password = "1234";

	@Override
	public int create(Person person) {
		String sql = "insert into person values(0, '" + person.getName() + "', " + person.getAge() + ")";      
		System.out.println(sql);
		try(Connection con = DriverManager.getConnection(url, user, password)){
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
