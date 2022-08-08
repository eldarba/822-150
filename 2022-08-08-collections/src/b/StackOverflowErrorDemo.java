package b;

public class StackOverflowErrorDemo {

	public static void main(String[] args) {
		method();
		

	}
	
	public static void method() {
		long x = (long) (Math.random()*900);
		method();
	}

}
