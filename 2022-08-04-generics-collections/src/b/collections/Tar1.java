package b.collections;

import java.util.ArrayList;
import java.util.List;

public class Tar1 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			int x = (int) (Math.random() * 10);
			System.out.println(x);
			list.add(x);
		}
		System.out.println(list);
		

	}

}
