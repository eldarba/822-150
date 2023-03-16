package b.recursion;

public class Demo1 {

	static void endless() {
		System.out.println("x");
		endless();
	}

	public static void main(String[] args) {
		endless();

	}

}
