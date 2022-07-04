package e.tests;

import e.Employee;
import e.Manager;

public class Test {

	public static void main(String[] args) {

		Employee e = new Employee();
//		e.name = "Moshe";
//		e.salary = 150.12;

		Manager m = new Manager();
//		m.name = "Dan";
//		m.salary = 200.32;
//		m.department = "Sales";

		System.out.println(e.getDetails());
		System.out.println(m.getDetails());

	}

}
