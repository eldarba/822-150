package d.method.reference;

public class ComparisonPrivider {

	// dynamic method
	public int compareByName(Person p1, Person p2) {
		return p1.getName().compareTo(p2.getName());
	}

}
