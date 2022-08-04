package b.collections;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		
		// Create a list of String
		List<String> list = new ArrayList<>();
		// Add elements
		list.add("English");
		list.add("English");
		list.add("Math");
		list.add("Java");
		list.add("Java");
		// print the list size
		System.out.println(list.size());
		// print the list (all elements)
		System.out.println(list);
		// Print element by index:
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		

	}

}
