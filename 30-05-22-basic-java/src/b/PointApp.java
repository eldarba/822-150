package b;

public class PointApp {

	public static void main(String[] args) {
		// create 3 instances of type Point 
		Point p1 = new Point();
		Point p2 = new Point();
		Point p3 = new Point();
		// set state
		p1.x = 2;
		p1.y = 5;
		p2.x = 10;
		p2.y = 20;
		p3.x = -2;
		p3.y = -5;
		// print state
		System.out.println("(" + p1.x + ", " + p1.y + ")");
		System.out.println("(" + p2.x + ", " + p2.y + ")");
		System.out.println("(" + p3.x + ", " + p3.y + ")");
		System.out.println("==========");
		System.out.println("(" + p1.x + ", " + p1.y + ")");
		p1.moveRight();
		p1.moveRight();
		p1.moveRight();
		System.out.println("(" + p1.x + ", " + p1.y + ")");
		
	}

}
