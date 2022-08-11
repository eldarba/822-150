package emps;

import java.util.Collection;

public class EmpsUtil {

	// this method will accept Collection<Employee>
	// this method will accept Collection<Manager>
	// this method will accept Collection<Direct>
	// all have salary
	public static double getAvgSalary(Collection<? extends Employee> emps) {
		double sum = 0;
		int c = 0;
		for (Employee e : emps) {
			if (e != null) {
				sum += e.salary;
				c++;
			}
		}
		double avg = sum / c;
		return avg;
	}

	// this method will accept Collection<Employee>
	// this method will accept Collection<Person>
	// this method will accept Collection<Object>
	public static void addEmployee(Collection<? super Employee> collection) {
		collection.add(new Employee());
		collection.add(new Manager());
		collection.add(new Director());
		// collection.add(new Person());
	}

	// a method that accepts any collection and prints the elements
	public void print(Collection<?> col) {
		for (Object element : col) {
			System.out.println(element);
		}
	}

}
