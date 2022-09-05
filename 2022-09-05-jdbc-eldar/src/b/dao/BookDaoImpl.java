package b.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BookDaoImpl implements BookDao {
	
	private String url = "jdbc:mysql://localhost:3306/db2";
	private String user = "root";
	private String password = "1234";

	@Override
	public int create(Book book) {
		String sql = "insert into book values(0,?,?,?,?)";
		try(Connection con = DriverManager.getConnection(url, user, password)){
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Book read(int isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int isbn) {
		// TODO Auto-generated method stub
		
	}

}
