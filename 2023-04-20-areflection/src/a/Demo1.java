package a;

import java.util.Date;

public class Demo1 {

	public static void main(String[] args) {
		// 3 way to get a reference to Class instance
		
		// 1. directly from the class itself
		Class<String> stringClass = String.class;
		System.out.println(stringClass);

		// 2. from object reference
		Object obj = new Date();
		Class<?> clazz = obj.getClass(); 
		System.out.println(clazz);

		// 3. from the class name
		try {
			String className = "java.util.Scanner";
			Class<?> clazz2 = Class.forName(className);
			System.out.println(clazz2);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
