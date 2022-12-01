package f.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo6 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(2, 100, 5, 4, 5, 100, 8, 2, 5, 2));

		List<Integer> theNewList = list.stream().distinct().map(e -> e * 2).collect(Collectors.toList());

		System.out.println(list);
		System.out.println(theNewList);

	}

}
