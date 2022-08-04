package c;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("English");
		list.add("English");
		list.add("Math");
		list.add("Java");
		list.add("Java");
		
		System.out.println(list);
		list.remove("Java");
		System.out.println(list);
		
		System.out.println("contains Math? " + list.contains("Math"));
		
		// convert List to String
		Object[] arr1 = list.toArray();
		
		String[] arr2 = list.toArray(new String[list.size()]);
		
		System.out.println(list);
		list.add(0, "History");
		System.out.println(list);

		list.set(0, "Sport");
		System.out.println(list);
		
		
		
		

	}

}
