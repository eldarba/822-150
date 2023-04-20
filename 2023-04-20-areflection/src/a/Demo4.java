package a;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import types.Superman;

public class Demo4 {

	public static void main(String[] args) {
		
		try {
			Constructor<Superman> ctor = Superman.class.getDeclaredConstructor();
			ctor.setAccessible(true);
			// create 2 instances
			Superman s1 = ctor.newInstance(); // create first instance
			Superman s2 = ctor.newInstance(); // create another instance
			// get a reference to the private altitude field
			Field alt = Superman.class.getDeclaredField("flyingAltitude");
			alt.setAccessible(true);
			// set altitudes
			alt.setInt(s1, 200);
			alt.setInt(s2, 300);
			// print the altitude 
			System.out.println(s1.getFlyingAltitude());
			System.out.println(s2.getFlyingAltitude());
			// print the altitude field directly using reflection 
			System.out.println(alt.get(s1));
			System.out.println(alt.get(s2));
			
			
			
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchFieldException e) {
			e.printStackTrace();
		}

	}

}
