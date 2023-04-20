package a;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import types.Calculator;

public class Demo3 {

	public static void main(String[] args) {

		Class<Calculator> clazz = Calculator.class;

		try {
			// get a reference to CTOR 2
			Constructor<Calculator> ctor = clazz.getConstructor(double.class);
			// use the CTOR to create an instance of calculator
			Calculator calc = ctor.newInstance(9);

			// get a reference to a method
			Method getResultMethod = clazz.getMethod("getResult");
			// invoke the method
			double result = (double) getResultMethod.invoke(calc);
			System.out.println("result: " + result);

			// invoke a private method
			Method destroyMethod = clazz.getDeclaredMethod("destroy");
			// make the private method accessible
			destroyMethod.setAccessible(true);
			// invoke the private method
			destroyMethod.invoke(calc);

		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}

	}

}
