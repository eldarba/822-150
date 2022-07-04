package b;

public class Test1 {

	public static void main(String[] args) {

		Person p1 = new Person(101, "Avi", 25);
		Person p2 = new Person(102, "Dan", 17);
		Person p3 = new Person(103, "Lea", 18);
		System.out.println(p1.id);

//		p1.id = 201; // error

		System.out.println(Person.getCounter());
		
		// Person.counter = 10000;
		System.out.println(Person.getCounter());

	}

}
