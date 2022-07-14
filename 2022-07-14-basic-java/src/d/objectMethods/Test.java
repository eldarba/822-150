package d.objectMethods;

public class Test {

	public static void main(String[] args) {
		
		Person p1 = new Person(101, "Dan", 25);
		Person p2 = new Person(102, "Lea", 32);
		
		// Person[id=..., name=..., age=...]
		String str = p1.toString();
		System.out.println(str);
		System.out.println(p2);
		
		// number that is dependent on state (id)
		int hc1 = p1.hashCode();
		int hc2 = p2.hashCode();
		System.out.println(hc1);
		System.out.println(hc2);
		
		// logical comparison (by id)
		boolean b = p1.equals(p2);
		System.out.println(b);
		

	}

}
