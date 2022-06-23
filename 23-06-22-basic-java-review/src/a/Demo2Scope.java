package a;

public class Demo2Scope {

	public static void main(String[] args) {

		int a = 5;
		System.out.println("this is the main method");

		{
			int b = 5;
			System.out.println(a);
			System.out.println(b);
		}
		System.out.println(a);
		// System.out.println(b); out of scope

	}

}
