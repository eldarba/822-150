package a;

public class Test {

	public static void main(String[] args) {
		
		Person person = new Person(101, "Alon", "alon@mail", null);
		Address address = new Address(1, "Israel", "Tel Aviv", "Begin", 112, null);
		person.setAddress(address);
		address.setPerson(person);
		
		System.out.println(person.getAddress());
		System.out.println(address.getPerson());
		//System.out.println(person.getAddress());

	}

}
