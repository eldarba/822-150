package c;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Tar3 {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		set.add("aaa");
		set.add("bbbbbb");
		set.add("ccc");
		set.add("dddd");
		set.add("eee");

		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			String curr = it.next();
			System.out.println(curr);
			if (curr.length() > 3) {
				it.remove();
			}
		}
		
		System.out.println("==============");

		it = set.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
