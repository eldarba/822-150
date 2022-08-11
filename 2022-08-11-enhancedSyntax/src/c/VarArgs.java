package c;

import java.util.Arrays;
import java.util.List;

public class VarArgs {

	public static void main(String... args) {

		System.out.println(sum(3, 6));
		System.out.println(sum(3, 6, 9));
		System.out.println(sum(3, 6, 9, 1, 1, 1, 1));
		System.out.println(sum(3, 6, 9, 4, 2));

		System.out.println(sumWithName("Yosi", 1, 2, 3));

		List<String> list1 = Arrays.asList("aaa", "bbb", "ccc");
		List<Integer> list2 = Arrays.asList(1, 2, 3);
	}

	// varargs must be last parameter (hence only 1 varargs parameter)
	public static int sumWithName(String name, int... val) {
		int sum = 0;
		System.out.println("hello " + name);
		for (int n : val) {
			sum += n;
		}
		return sum;
	}

	public static int sum(int... val) {
		int sum = 0;
		System.out.println("number of arguments: " + val.length);
		for (int n : val) {
			sum += n;
		}
		return sum;
	}

}
