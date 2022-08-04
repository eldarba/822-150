package c;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Tar2 {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("ddd");
		set.add("eee");
		
		System.out.println(set);
		
		Iterator<String> it = set.iterator();
		it.next();
		it.next();
		System.out.println(it.next());
		it.remove(); // remove the current element

		System.out.println(set);
	}

}
