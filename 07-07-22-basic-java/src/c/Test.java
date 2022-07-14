package c;

public class Test {

	public static void main(String[] args) {
		
		Line ln1 = new Line(3);
		ln1.print();
		
		System.out.println("================");
		Line ln2 = new Line(20);
		ln2.print();
		
		System.out.println("================");
		WLine wl1 = new WLine(10, 3);
		wl1.print();

	}

}
