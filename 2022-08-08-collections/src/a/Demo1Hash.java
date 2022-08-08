package a;

import java.util.HashSet;
import java.util.Set;

public class Demo1Hash {

	public static void main(String[] args) {
		
		Person p1 = new Person(101, "aaa");
		Person p2 = new Person(102, "aaa");
		Person p3 = new Person(101, "bbb");
		
		Set<Person> set = new HashSet<>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		
		System.out.println(set.size());
		System.out.println(set);

	}

}
