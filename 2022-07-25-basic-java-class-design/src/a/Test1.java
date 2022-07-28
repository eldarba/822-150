package a;

public class Test1 {

	public static void main(String[] args) {

		Client client1 = new Client(101, "Avi", 25);
		Client client2 = new Client(102, "Lea", 27);

		System.out.println(client1);
		System.out.println(client2);

		System.out.println(client1.equals(client2));
	}

}
