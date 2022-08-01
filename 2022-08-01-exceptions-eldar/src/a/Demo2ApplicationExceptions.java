package a;

public class Demo2ApplicationExceptions {

	public static void main(String[] args)  {
		
		try {
			Class.forName("a.StamA");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
