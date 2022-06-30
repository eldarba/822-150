package b;

public class App {

	public static void main(String[] args) {

		// create Point using CTOR 1
		Point p1 = new Point();
		// create Point using CTOR 2
		Point p2 = new Point(6000, 8);

		System.out.println(p1.display());
		System.out.println(p2.display());

		p1.setX(3);
		p1.setY(7);

		System.out.println(p1.display());

	}

}
