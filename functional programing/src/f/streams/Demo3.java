package f.streams;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");

		list.stream()

				.peek(e -> System.out.println("== before: " + e))

				.map(element -> element.toUpperCase())

				.peek(e -> System.out.println("== after: " + e))

				.forEach(System.out::println);

	}

}
