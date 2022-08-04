package d.sorting;


/**
 * represents a person. natural order is id.
 *
 */
public class Person implements Comparable<Person> {

	private int id;
	private String name;
	private int age;

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person other) {
		if (this.id < other.id) {
			return -1;
		} else if (this.id == other.id) {
			return 0;
		}
		return 1;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	

}
