package a;

public class Test2 {

	public static void main(String[] args) {

		Client client1 = new Client(101, "Avi", 25);
		Client client2 = new Client(102, "Lea", 27);
		
		client2 = null;
		System.gc();
		
		System.out.println("END");
		System.out.println("END");
		System.out.println("END");
		
		

	}

}
