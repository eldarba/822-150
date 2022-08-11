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

}
