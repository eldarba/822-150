package a;

public class Test {

	public static void main(String[] args) {
		
		PersonDao dao = new PersonDaoImpl();
		
		Person p1 = new Person(0, "aaa", 10);
		Person p2 = new Person(0, "bbb", 20);
		
		dao.create(p1);
		dao.create(p2);

	}

}
