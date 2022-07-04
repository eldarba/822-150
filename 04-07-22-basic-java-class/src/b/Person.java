package b;

public class Person {

	// class variable - static
	private static int counter;
	// constant
	public static final int MAX_AGE = 120;

	public void setAge(int age) {
		if(age <= MAX_AGE) {
			this.age = age;
		}
	}
	
	// class method - static
	public static int getCounter() {
		return counter;
	}

	// instance variables
	public final int id; // final attribute
	private String name;
	private int age;

	{ // initializer - runs before CTOR
		counter++;
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
