package a;

public class Test3 {

	public static void main(String[] args) {
	
		// because we defined 3 ctors
		// we now have 3 ways of creating points
		Point p1 = new Point();
		Point p2 = new Point(15, 17);
		Point p3 = new Point(100);
		
		// print the points
		System.out.println(p1.getDetails());
		System.out.println(p2.getDetails());
		System.out.println(p3.getDetails());

	}

}
