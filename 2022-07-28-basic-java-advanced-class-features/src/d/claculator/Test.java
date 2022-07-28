package d.claculator;

public class Test {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		// handling 2 - try-catch
		try {
			System.out.println(calc.divide(10, 2));
			System.out.println(calc.divide(10, 0));
		} catch (Exception e) {
			// handler code
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.println("END");

	}

}
