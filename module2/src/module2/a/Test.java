package module2.a;

import java.lang.reflect.Field;

import module1.a.Hello;
import module1.b.Car;
// import module1.c.Util; // not accessible

public class Test {

	public static void main(String[] args) {
		// using module2.a package
		Hello hello = new Hello();
		System.out.println(hello.greet("Dan"));
		// using module2.b package
		Car car = new Car();
		car.drive(80);
		// try using module2.c package
		// Util u;
		
		try {
			Field speedField = Car.class.getDeclaredField("speed");
			System.out.println(speedField);
			speedField.setAccessible(true);
			System.out.println(speedField.getInt(car));
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
