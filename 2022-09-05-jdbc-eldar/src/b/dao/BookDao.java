package b.dao;

/**
 * a Book DAO (Data Access Object) for CRUD (Create, Read, Update, Delete) actions
 *
 */
public interface BookDao {

	int create(Book book);

	Book read(int isbn);

	void update(Book book);

	void delete(int isbn);
}
