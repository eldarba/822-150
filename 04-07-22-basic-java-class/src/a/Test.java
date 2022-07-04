package a;

public class Test {

	public static void main(String[] args) {
		
		Point p = new Point();
		
		// we cannot access private members
//		p.x = 9; // error
		
		// we can access 'description' because it is public
		p.description = "this is a point instance";
		System.out.println(p.description);
		
		// move the point
		int xVal = p.moveRight(5);
		System.out.println(xVal);
		xVal = p.moveLeft(10);
		System.out.println(xVal);
		
		// print a string description of the point
		String pointDescription = "point(x=" + p.getX() + ", y=" + p.getY() + ")";
		System.out.println(pointDescription);
		
		pointDescription = p.getDetails();
		System.out.println(pointDescription);
	}

}
