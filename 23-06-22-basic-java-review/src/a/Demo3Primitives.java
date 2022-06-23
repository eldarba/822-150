package a;

public class Demo3Primitives {

	public static void main(String[] args) {
		// integer numerals
		byte n1 = 5;
		short n2 = 10;
		int n3 = 15;
		long n4 = 20L;
		// decimal numerals
		float f1 = 5.23F;
		double f2 = 6.32D;
		
		// logical
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = 10 == 10;
		
		// character
		char c1 = 'A';
		char c2 = '1';
		char c3 = '.';
		char c4 = ' ';
		char c5 = '\n'; // new line character
		char c6 = '\t'; // tab character
		char c7 = '\\'; // backslash character
		char c8 = '\"'; // quote character
		System.out.println("aaa\nbbb");
		System.out.println("aaa\tbbb");
		System.out.println("aaa\\bbb");
		System.out.println("and he said \"good bye\" and left");
		
		// String is not a primitive
		String message = "this is a string object";
		System.out.println(message);
		
		
		

	}

}
