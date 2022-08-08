package drill.part1;

import java.util.HashSet;
import java.util.Set;

public class Tar1 {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();

		while (set.size() < 100) {
			set.add((int) (Math.random() * 1001));
		}

		System.out.println(set);

	}

}
