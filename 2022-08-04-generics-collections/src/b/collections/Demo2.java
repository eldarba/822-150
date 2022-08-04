package b.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		
		// Create a set of String
		Set<String> set = new HashSet<>();
		// Add elements
		set.add("English");
		set.add("English");
		set.add("Math");
		set.add("Java");
		set.add("Java");
		// print the list size
		System.out.println(set.size());
		// print the list (all elements)
		System.out.println(set);
		
		

	}

}
