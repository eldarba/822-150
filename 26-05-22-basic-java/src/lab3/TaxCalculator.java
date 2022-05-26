package lab3;

import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter salary: ");

		double salary = sc.nextDouble();
		sc.close();

		double tax = 0;

		if (salary >= 0) {
			System.out.println("calculating tax");
			if (salary <= 23_000) {
				tax = salary * 0.1;
			} else if (salary <= 50_000) {
				tax = salary * 0.2;
			} else if (salary <= 100_000) {
				tax = salary * 0.3;
			} else {
				tax = salary * 0.4;
			}
			
			System.out.println("salary before tax: " + salary);
			System.out.println("tax: " + tax);
			System.out.println("salary after tax: " + (salary - tax));
		} else {
			System.out.println("salary cannot be negative");
		}

	}

}
