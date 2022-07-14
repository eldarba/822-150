package b;

public class Test {

	public static void main(String[] args) {

		Point pt1 = new Point(3, 8);
		Point pt2 = new Point(5);
		Point pt3 = new Point();

		Pixel px1 = new Pixel(2, 9, "green");
		Pixel px2 = new Pixel(5, "yellow");
		Pixel px3 = new Pixel("red");
		Pixel px4 = new Pixel();
		
		String str = pt1.toString();
		System.out.println(str);
		
		System.out.println(pt2);

	}

}
