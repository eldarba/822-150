package a;

public class Demo1 {

	public static void main(String[] args) {

		// primitives
		int a = 5;
		double b = 5.32;
		char c = 'A';
		boolean x = true;

		// objects
		Person p1 = new Person(); // object / instance of a class
		Person p2 = new Person();

		// set the instances sate
		p1.id = 101;
		p2.id = 102;

		p1.name = "Dani";
		p2.name = "Rina";

		p1.age = 25;
		p2.age = 30;

		System.out.println("id: " + p1.id + ", name: " + p1.name + ", age: " + p1.age);
		System.out.println("id: " + p2.id + ", name: " + p2.name + ", age: " + p2.age);
		
		p1.sayHello();
		p2.sayHello();
		
		
		
		
		
		
		
		
		
		
	} 

}
