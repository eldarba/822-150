package e.functional.interfaces;

import java.util.function.Consumer;

import d.method.reference.Person;

public class Demo4Consumer {

	public static void main(String[] args) {

		Consumer<Person> personFields = p -> System.out.println(p.getId() + ", " + p.getName() + ", " + p.getAge());

		Person moshe = new Person(101, "Moshe", 25);
		Person dina = new Person(102, "Dina", 23);

		personFields.accept(moshe);
		personFields.accept(dina);

	}

}
