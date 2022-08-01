package b;

public class FinalyDemo {

	public static void main(String[] args) {
		
		String str = "111";
		
		try {
			int x = Integer.parseInt(str);
			System.out.println("x = " + x);
		} catch (Exception e) {
			// handler block
			System.out.println("ERROR");
			return;
		}finally {
			// do it anyway block
			System.out.println("FINALLY");
		}
		
		
		
		System.out.println("=== END ===");
		
		

	}

}
