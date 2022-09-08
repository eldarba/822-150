package app.core.dao;

import java.util.List;

/**
 * a Book DAO (Data Access Object) for CRUD (Create, Read, Update, Delete)
 * actions
 *
 */
public interface BookDao {

	int create(Book book);

	Book read(int isbn);

	List<Book> read(String author);

	void update(Book book);

	void delete(int isbn);
}
