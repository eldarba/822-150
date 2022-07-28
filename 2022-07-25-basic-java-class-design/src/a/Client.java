package a;

import java.util.Objects;

public class Client {
	
	private int id;
	private String name;
	private int age;
	
	public Client(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// toString
	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	// hashCode - generates a number from the object
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	// equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Client)) {
			return false;
		}
		Client other = (Client) obj;
		return this.id == other.id;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(this + " is GCed");
	}

	
	
	
	
	
	
	
	
	


	
	

}
