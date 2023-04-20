package a;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo5 {

	public static void main(String[] args) {
		Thread t = new Thread(() -> {
			System.out.println("Hi");
		});
		
		
		t.start();
		
		// System.out.println(t.target);
		
		Class<Thread> threadClass = Thread.class;
		try {
			Field targetField = threadClass.getDeclaredField("target");
			targetField.setAccessible(true);
			System.out.println(targetField);
			
			Runnable r =  (Runnable) targetField.get(t);
			System.out.println(r);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}

}
