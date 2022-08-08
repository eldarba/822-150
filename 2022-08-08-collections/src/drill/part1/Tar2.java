package drill.part1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tar2 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		while (list.size() < 100) {
			list.add((int) (Math.random() * 1001));
		}

		System.out.println(list);
		
		Set<Integer> set = new HashSet<>(list);
		System.out.println(set);

	}

}
