package a;

public class Test {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 100);
		int b = (int) (Math.random() * 100);
		int sum = a + b;
		double avg = sum / 2D;

		System.out.println("a=" + a + ", b=" + b);
		System.out.println("sum: " + sum);
		System.out.println("average: " + avg);
		System.out.println("right digit of " + a + " is " + a % 10);
		System.out.println("right digit of " + b + " is " + b % 10);

	}

}
