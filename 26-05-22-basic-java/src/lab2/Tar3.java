package lab2;

public class Tar3 {

	/*
	 * Create a new class named “SalaryRaiser”
	 * 
	 * o define a random number named ‘salary’ with a value between 5000-6000.
	 * 
	 * o print the current salary
	 * 
	 * o Now, raise the salary:
	 * 
	 * By 10% - only if the result is not greater than 6000 (which is the maximum
	 * salary allowed)
	 * 
	 * Otherwise the salary is 6000
	 * 
	 * o print the updated salary
	 */

	public static void main(String[] args) {
		double salary = (int) (Math.random() * 1001) + 5000;
		System.out.println("salary is " + salary);

		if (salary * 1.1 <= 6000) {
			salary *= 1.1;
			System.out.println("10%");
		} else if (salary * 1.05 <= 6000) {
			salary *= 1.05;
			System.out.println("5%");
		} else {
			salary = 6000;
			System.out.println("other");
		}

		System.out.println("updated salary is " + salary);
	}

}
