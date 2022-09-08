package app.core.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import app.core.exceptions.LibraryException;

public class BookDaoImpl implements BookDao {

//	private String url = "jdbc:mysql://localhost:3306/db2?createDatabaseIfNotExist=true";
	private String url = "jdbc:mysql://localhost:3306/db2";
	private String user = "root";
	private String password = "1234";

	@Override
	public int create(Book book) {
		String sql = "insert into book values(0, ?, ?, ?, ?)";
		try (Connection con = DriverManager.getConnection(url, user, password);) {
			// PreparedStatement.RETURN_GENERATED_KEYS - signals the PreparedStatement to
			// retrieve the generated key (isbn)
			// prepared statement get SQL String with '?'
			PreparedStatement pstmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			// initialize with actual values
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getAuthor());
			pstmt.setDouble(3, book.getPrice());
			pstmt.setDate(4, Date.valueOf(book.getPublication()));
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
		String sql = "select * from book where isbn = ?";
		try (Connection con = DriverManager.getConnection(url, user, password);) {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, isbn);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				Book book = new Book();
				book.setIsbn(isbn);
				book.setAuthor(rs.getString("author"));
				book.setTitle(rs.getString("title"));
				book.setPrice(rs.getDouble("price"));
				book.setPublication(rs.getDate("publication").toLocalDate());
				return book;
			} else {
				throw new LibraryException("finding book with isbn " + isbn + " failed - not found");
			}
		} catch (SQLException e) {
			throw new LibraryException("read book failed", e);
		}
	}

	@Override
	public List<Book> read(String author) {
		String sql = "select * from book where author = ?";
		try (Connection con = DriverManager.getConnection(url, user, password);) {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, author);
			ResultSet rs = pstmt.executeQuery();
			List<Book> books = new ArrayList<>();
			while (rs.next()) {
				Book book = new Book();
				book.setIsbn(rs.getInt("isbn"));
				book.setAuthor(rs.getString("author"));
				book.setTitle(rs.getString("title"));
				book.setPrice(rs.getDouble("price"));
				book.setPublication(rs.getDate("publication").toLocalDate());
				books.add(book);
			}
			return books;
		} catch (SQLException e) {
			throw new LibraryException("read books by author failed", e);
		}
	}

	@Override
	public void update(Book book) {
		String sql = "update book set title=?, author=?, price=?, publication=? where isbn=?";
		try (Connection con = DriverManager.getConnection(url, user, password)) {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getAuthor());
			pstmt.setDouble(3, book.getPrice());
			pstmt.setDate(4, Date.valueOf(book.getPublication()));
			pstmt.setInt(5, book.getIsbn());
			int rowCount = pstmt.executeUpdate();
			if (rowCount == 0) {
				throw new LibraryException("update book faild - not found. isbn: " + book.getIsbn());
			}
		} catch (SQLException e) {
			throw new LibraryException("update book faild", e);
		}
	}

	@Override
	public void delete(int isbn) {
		String sql = "delete from book where isbn = ?";
		try (Connection con = DriverManager.getConnection(url, user, password);) {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, isbn);
			int rowCount = pstmt.executeUpdate();
			if (rowCount == 0) {
				throw new LibraryException("delete book faild - not found. isbn: " + isbn);
			}
		} catch (SQLException e) {
			throw new LibraryException("delete book failed", e);
		}
	}

}
