package b;

public class Test2 {

	public static void main(String[] args) {
		
		System.out.println(Person.getCounter());
		
		Person p1 = new Person(101);
		Person p2 = new Person(102);
		Person p3 = new Person(103);

		System.out.println(Person.getCounter());
	}

}
