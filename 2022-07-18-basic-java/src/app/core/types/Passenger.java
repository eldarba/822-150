package app.core.types;

import java.util.Objects;

public class Passenger {
	
	private static int c;
	
	private final int id = ++c;
	private String name;
	
	public Passenger(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Pasenger [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Passenger)) {
			return false;
		}
		Passenger other = (Passenger) obj;
		return id == other.id;
	}
	
	
	
	

}
