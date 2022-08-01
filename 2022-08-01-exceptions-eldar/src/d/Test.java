package d;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("this is standrd output");
		System.err.println("this is error output");
		
		try {
			Point p1 = new Point();
			System.out.println(p1);
			
//			p1 = null;
			p1.setX(150);
			System.out.println(p1);
			
		} catch (PointXYException e) {
			e.printStackTrace(); // print to error output
			e.printStackTrace(System.out); // print to standard output
			System.out.println("point error: " + e.getMessage());
		}catch (Exception e) {
			System.out.println("some other error: " + e.getMessage());
		}


	}

}
