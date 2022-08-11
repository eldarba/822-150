package c;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ForEachDemo {

	public static void main(String[] args) {

		Integer[] arr = { 1, 2, 3, 4, 5 };
		List<Integer> list = Arrays.asList(arr);
		Set<Integer> set = new HashSet<>(list);

		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		System.out.println(set);

		System.out.println("===========");
		for (Integer x : arr) {
			System.out.println(x);
		}
		System.out.println("===========");
		for (Integer x : list) {
			System.out.println(x);
		}
		System.out.println("===========");
		for (Integer x : set) {
			System.out.println(x);
		}

	}

}
