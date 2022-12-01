package f.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo7 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(2, 100, 5, 4, 5, 100, 8, 2, 5, 2));

		// here we see a method reference

		// referring to a dynamic method of an arbitrary object of this type
		int max1 = list.stream().max(Integer::compareTo).get();

		// referring to a static method of a given type
		int max2 = list.stream().max(Integer::compare).get();

		System.out.println(max1);
		System.out.println(max2);

	}

}
