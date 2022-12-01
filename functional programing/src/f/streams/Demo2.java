package f.streams;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");

		list.stream().map(element -> element.toUpperCase()).forEach(System.out::println);

	}

}
