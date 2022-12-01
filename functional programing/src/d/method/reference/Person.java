package d.method.reference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

	private Integer id;
	private String name;
	private Integer age;

	// static method
	public static int compareByAge(Person p1, Person p2) {
		return p1.age.compareTo(p2.age);
	}

}
