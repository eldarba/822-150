package a;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import types.Calculator;

public class Demo2 {

	public static void main(String[] args) {
		
		Class<Calculator> clazz = Calculator.class;
		
		// public fields including inherited fields
		Field[] fields = clazz.getFields();
		System.out.println("number of fields: " + fields.length);
		
		// all fields not including inherited fields
		fields = clazz.getDeclaredFields();
		System.out.println("number of fields: " + fields.length);
		
		System.out.println("====================");
		// public methods including inherited ones
		Method[] allPublicMethods = clazz.getMethods();
		for (Method method : allPublicMethods) {
			System.out.println(method);
		}

		System.out.println("====================");
		// all declared methods not including inherited ones
		Method[] declaredMethods = clazz.getDeclaredMethods();
		for (Method method : declaredMethods) {
			System.out.println(method);
		}

	}

}
