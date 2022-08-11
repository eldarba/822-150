package a.inhritace;

import java.util.Iterator;

public class Demo1 {

	public static void main(String[] args) {
		
		Food[] foods = new Food[5];
		foods[0] = new Food();
		foods[1] = new Fruit();
		foods[2] = new Apple();
		
		printFoods(foods);
		System.out.println("===============");
		
		Fruit[] fruits = new Fruit[3];
		fruits[0] = new Apple();
		fruits[1] = new Apple();
		
		printFoods(fruits);
		

	}
	
	public static void printFoods(Food[] foods) {
		for (Food food : foods) {
			System.out.println(food);
		}
		// foods[0] = new Falafel();
	}

}
