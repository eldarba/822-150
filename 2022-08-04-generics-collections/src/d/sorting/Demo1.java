package d.sorting;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) {
		
		{
			List<Integer> list = new ArrayList<>();
			list.add(2);
			list.add(4);
			list.add(8);
			list.add(6);
			list.add(1);
			System.out.println(list);
			
			Collections.sort(list);
			System.out.println(list);
		}
		{
			List<String> list = new ArrayList<>();
			list.add("Lior");
			list.add("Alon");
			list.add("Danna");
			list.add("Ben");
			list.add("Nisim");
			System.out.println(list);
			
			Collections.sort(list);
			System.out.println(list);
		}
		{
			List<LocalDate> list = new ArrayList<>();
			list.add(LocalDate.of(2000, 5, 13));
			list.add(LocalDate.of(2020, 5, 13));
			list.add(LocalDate.of(1980, 5, 13));
			System.out.println(list);
			
			Collections.sort(list);
			System.out.println(list);
		}
		{
			List<Person> list = new ArrayList<>();
			list.add(new Person(103, "bbb", 5));
			list.add(new Person(101, "ccc", 10));
			list.add(new Person(102, "ddd", 35));
			System.out.println(list);
			
			Collections.sort(list);
			System.out.println(list);

			PersonNameComparator nameComp = new PersonNameComparator();
			Collections.sort(list, nameComp);
			System.out.println(list);
		}

	}

}
