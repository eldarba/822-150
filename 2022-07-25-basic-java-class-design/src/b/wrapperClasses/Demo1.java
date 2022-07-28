package b.wrapperClasses;

public class Demo1 {

	public static void main(String[] args) {
		
		int a = 10; // primitive
		Integer x = 10; // wrapper
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		// convert a String to int
		String str = "125";
		int b = Integer.parseInt(str);
		System.out.println(b);

	}

}
