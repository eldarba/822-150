package c.singleton;

public class Test {

	public static void main(String[] args) {

		Superman superman1 = Superman.getInstance();
		Superman superman2 = Superman.getInstance();

		superman1.setSpeed(100);

		System.out.println(superman2.getSpeed());

	}

}
