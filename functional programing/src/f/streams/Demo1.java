package f.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo1 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");

		// 1. turn the list of String to stream of String
		Stream<String> stream = list.stream();

		// 2. call an intermediate operation to process an element on the stream and get
		// a new stream
		stream = stream.map(element -> element.toUpperCase());

		// 3. call a terminal operation to start the stream
		stream.forEach(System.out::println);

	}

}
