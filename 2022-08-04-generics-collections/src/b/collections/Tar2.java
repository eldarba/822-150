package b.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Tar2 {

	public static void main(String[] args) {

		Set<Integer> set = new LinkedHashSet<>();

		while (set.size() < 10) {
			int x = (int) (Math.random() * 10);
			System.out.println(x);
			set.add(x);
		}

		System.out.println(set);

	}

}
