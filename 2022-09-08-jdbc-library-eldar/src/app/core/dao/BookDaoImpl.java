package app.core.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import app.core.exceptions.LibraryException;


public class BookDaoImpl implements BookDao {
	
//	private String url = "jdbc:mysql://localhost:3306/db2?createDatabaseIfNotExist=true";
	private String url = "jdbc:mysql://localhost:3306/db2";
	private String user = "root";
	private String password = "1234";

	@Override
	public int create(Book book) {
		String sql = "insert into book values(0, ?, ?, ?, ?)";
		try(Connection con = DriverManager.getConnection(url, user, password);) {
			//	PreparedStatement.RETURN_GENERATED_KEYS - signals the PreparedStatement to retrieve the generated key (isbn)
			PreparedStatement pstmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS); // prepared statement get SQL String with '?'
			// initialize with actual values
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getAuthor());
			pstmt.setDouble(3, book.getPrice());
			pstmt.setDate(4, book.getPublication());
			// execute the query
			pstmt.executeUpdate(); // executeUpdate in PreparedStatement do not get an SQL String
			// retrieve the generated key (isbn)
			ResultSet rsIsbn = pstmt.getGeneratedKeys();
			rsIsbn.next();
			int dbGeneratedIsbn = rsIsbn.getInt(1);
			return dbGeneratedIsbn;
		} catch (SQLException e) {
			// translate the SQLException to our system exception
			throw new LibraryException("create a new book failed", e);
		}
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
