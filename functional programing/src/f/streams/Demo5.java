package f.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo5 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(2, 100, 5, 4, 5, 100, 8, 2, 5, 2));
		System.out.println(list);

		list.stream().distinct().forEach(System.out::println);

		boolean isThereAny100 = list.stream().anyMatch(e -> e == 100);
		System.out.println(isThereAny100);

		List<Integer> ages = new ArrayList<>(Arrays.asList(20, 30, 25, 35));

		if (ages.stream().allMatch(e -> e >= 18)) {
			System.out.println("All are over 18");
		} else {
			System.out.println("There are some minors");
		}

		if (ages.stream().noneMatch(e -> e == 25)) {
			System.out.println("no one is 25");
		} else {
			System.out.println("some are 25");
		}

	}

}
