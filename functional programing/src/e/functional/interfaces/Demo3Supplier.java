package e.functional.interfaces;

import java.util.function.Supplier;

public class Demo3Supplier {

	private static String[] names = { "Ron", "Dan", "Yosi", "Dafna", "Mira" };

	public static void main(String[] args) {

		Supplier<Integer> rndomizer = () -> (int) (Math.random() * 101);
		Supplier<String> nameSupplier = () -> names[(int) (Math.random() * names.length)];

		int a = rndomizer.get();
		int b = rndomizer.get();
		int c = rndomizer.get();

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		for (int i = 0; i < 10; i++) {
			System.out.println(nameSupplier.get());
		}

	}

}
