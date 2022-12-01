package b;

public class Demo1 {

	public static void main(String[] args) {

		Runnable r = () -> {
			for (int i = 1; i <= 3; i++) {
				System.out.println(i);
			}
		};

		Thread t = new Thread(r);
		t.start();

		new Thread(() -> System.out.println("hi")).start();

		MyFunctionalInterface x = (n1, n2) -> n1 + n2;
		System.out.println(x.add(100, 300));

	}

}
