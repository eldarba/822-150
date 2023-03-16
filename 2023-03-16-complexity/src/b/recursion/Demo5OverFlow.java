package b.recursion;

import java.math.BigInteger;

public class Demo5OverFlow {

	/**
	 * return the factorial of n
	 * 
	 * @param n must not be negative
	 * @return
	 */
	static BigInteger factorial(int n) {
		if (n <= 1) { // base case
			// return 1;
			return new BigInteger("1");
		} else {
			// return n * factorial(n - 1);
			return new BigInteger(String.valueOf(n)).multiply(factorial(n - 1));
		}
	}

	public static void main(String[] args) {
		System.out.println("0! = " + factorial(0));
		System.out.println("1! = " + factorial(1));
		System.out.println("2! = " + factorial(2));
		System.out.println("3! = " + factorial(3));
		System.out.println("4! = " + factorial(4));
		System.out.println("5! = " + factorial(5));
		System.out.println("6! = " + factorial(6));
		System.out.println("100! = " + factorial(100));

	}

}
