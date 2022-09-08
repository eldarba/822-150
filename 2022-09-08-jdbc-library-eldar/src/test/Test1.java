package test;

import java.time.LocalDate;
import java.util.List;

import app.core.dao.Book;
import app.core.dao.BookDao;
import app.core.dao.BookDaoImpl;

public class Test1 {

	public static void main(String[] args) {

		BookDao dao = new BookDaoImpl();

		// create
//		Book book = new Book(0, "aaa", "aaa", 100, LocalDate.of(2021, 3, 18));
//		int isbn = dao.create(book);
//		System.out.println(isbn);
		
		// read
//		Book book = dao.read(10);
//		System.out.println(book);
		
		// update
//		Book book = new Book(2, "jdbc", "Dan", 152, LocalDate.of(2020, 1, 1));
//		dao.update(book);
//		System.out.println("updated");
		
		// delete
//		dao.delete(2);
//		System.out.println("deleted");
		
//		String[] authors = {"aaa", "bbb", "ccc", "ddd"};
//		
//		for (int i = 0; i < 25; i++) {
//			int index = (int) (Math.random()*authors.length);
//			double price = (int)(Math.random()*200);
//			Book book = new Book(0, "book" + i, authors[index], price, LocalDate.now());
//			dao.create(book);
//		}
//		System.out.println("done");
		
		List<Book> list = dao.read("bbb");
		System.out.println(list);
		for (Book book : list) {
			System.out.println(book);
		}
		
		

	}

}
