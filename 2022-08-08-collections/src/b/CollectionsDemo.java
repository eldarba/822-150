package b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsDemo {

	public static void main(String[] args) {
		// LIST
		// list is ordered and has duplications
		List<Integer> list = new ArrayList<>();
		list.add(6);
		list.add(8);
		list.add(4);
		list.add(4);
		list.add(4);
		System.out.println(list);
		
		List<Integer> list2 = Arrays.asList(2, 5, 7, 1, 9);
		System.out.println(list2);
		
		// SET
		// set is unordered and has NO duplications
		Set<Integer> set = new HashSet<>(list);
		System.out.println(set);
		
		// MAP
		
		

	}

}
