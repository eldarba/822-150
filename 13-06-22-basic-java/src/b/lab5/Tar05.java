package b.lab5;

public class Tar05 {

	/*
	 * Create a class that defines a random number with value between 0-10,000 and
	 * print the following details with clear messages:
	 * 
	 * 1. number of digits
	 * 
	 * 2. the first left digit
	 * 
	 * 3. sum of the number’s digits
	 * 
	 * 4. opposite order of the number’s digits
	 */
	public static void main(String[] args) {
		int r = (int) (Math.random() * 10_001); // 0 - 10,000
		// r = Math.abs(r);
		System.out.println("r = " + r);

		int numberOfDigits = 1;
		int sum = 0;
		int rev = 0;

		while (r >= 10) {
			numberOfDigits++;
			sum += r % 10;
			rev *= 10;
			rev += r % 10;
			r /= 10;
		}

		sum += r;
		rev *= 10;
		rev += r % 10;

		System.out.println("numberof digits is " + numberOfDigits);
		System.out.println("left digit is " + r);
		System.out.println("sum of digits is " + sum);
		System.out.println("reveresed number is " + rev);

	}

}
