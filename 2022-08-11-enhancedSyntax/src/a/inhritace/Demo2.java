package a.inhritace;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo2 {
	public static void main(String[] args) {

		// compiler accept this
		Food[] arr = new Fruit[5];
		// compiler accept this - will crash in runtime
		arr[0] = new Falafel();

		// compiler accept this
		// List<Food> list = new ArrayList<Fruit>();

		// type argument ? is a wild card which means that type is unknown

		List<?> list = new ArrayList<Fruit>();

	}

	public static void printCollection(Collection<?> col) {
		for (Object element : col) {
			System.out.println(element);
		}
		// col.add(null); cannot add anything
	}

	public static void printFoods(Collection<? extends Food> col) {
		for (Food food : col) {
			System.out.println(food.taste);
		}
//		 col.add(null); cannot add anything
	}

	public static void addFood(Collection<? super Fruit> col) {
		// col.add(new Food());
		col.add(new Fruit());
		// col.add(new Falafel());
		col.add(new Apple());
	}

}
