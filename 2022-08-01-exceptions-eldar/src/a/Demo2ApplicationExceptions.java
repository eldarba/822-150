package a;

public class Demo2ApplicationExceptions {

	public static void main(String[] args)  {
		
		try {
			// the forName method throws a checked exception - must be handled
			Class referenceToClassObject = Class.forName("a.Stam");
			System.out.println(referenceToClassObject.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
