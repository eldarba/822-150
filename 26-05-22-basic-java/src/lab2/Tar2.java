package lab2;

public class Tar2 {

	/*
	 * Create a new class that defines a random number with a value between 0-100.
	 * 
	 * if the value is between 0-50 – print “Small!”
	 * 
	 * else – print “Big!”
	 * 
	 * in addition:
	 * 
	 * if the value is even (can be divided by 2) – print “Even”
	 * 
	 * else – print “Odd”
	 * 
	 */

	public static void main(String[] args) {

		int r = (int) (Math.random() * 101);
		System.out.print("the number " + r + " is ");

		if (r <= 50) {
			System.out.print("small");
		} else {
			System.out.print("big");
		}
		
		System.out.print(" and ");

		if (r % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

	}

}
