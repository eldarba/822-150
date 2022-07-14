package d.objectMethods;

public class TestPoint {

	public static void main(String[] args) {
		
		
		Point p1 = new Point(1, 1);
		Point p2 = new Point(1, 2);
		Point p3 = new Point(2, 1);
		Point p4 = new Point(1, 1);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p4));

	}

}
