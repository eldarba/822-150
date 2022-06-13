package d;

public class StackDemo {

	public static void main(String[] args) {
		System.out.println("start");
		int[] arr = new int[10];
		String str = null;
		f1();
		System.out.println("stop");
	}

	public static void f1() {
		int x = 5;
		int b = 6;
		f2();
		System.out.println("hello, " + x + ", " + b);
	}

	public static void f2() {
		int a = 100;
		int b = 200;
		System.out.println("hi, " + a + ", " + b);
	}

}
