// package declaration:
package b;

// class declaration:
public class Person {

	// class variable - static
	private static int counter;
	// constant (static + final)
	public static final int MAX_AGE = 120;
	
	 // class initializer - runs on class load
	static {
		System.out.println("class loaded");
	}

	// instance variables
	public final int id; // final attribute
	private String name;
	private int age;

	{ // instance initializer - runs before CTOR
		counter++;
		System.out.println("instance created");
	}

	// CTOR 1
	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		setAge(age);
	}

	// CTOR 2
	public Person(int id) {
		this.id = id;
	}

	// class method - static
	public static int getCounter() {
		return counter;
	}

	// instance methods
	public void setAge(int age) {
		if (age <= MAX_AGE) {
			this.age = age;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

}
