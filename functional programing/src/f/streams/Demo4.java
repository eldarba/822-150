package f.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo4 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(2, 5, 8, 4, 3, 9, 8, 7, 5, 1));
		System.out.println(list);

		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

		long evens = list.stream().filter(n -> n % 2 == 0).count();

		System.out.println("number of even numbers: " + evens);

		System.out.println(list);

	}

}
