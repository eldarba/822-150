package e.functional.interfaces;

import java.util.function.Predicate;

public class Demo2Predicate {

	public static void main(String[] args) {

		Predicate<String> isStringUpTo10Characters = str -> str.length() <= 10;
		Predicate<String> isStartingWithA = str -> str.startsWith("a") || str.startsWith("A");

		// composition
		Predicate<String> startsWithAAndUpTo10Cars = isStartingWithA.and(isStringUpTo10Characters);

		System.out.println(isStringUpTo10Characters.test("aaa"));
		System.out.println(isStringUpTo10Characters.test("aaavvvvvvvvvvvvvvvvvvvvvvvvvv"));

		System.out.println(isStartingWithA.test("bob"));
		System.out.println(isStartingWithA.test("arik"));

		System.out.println(startsWithAAndUpTo10Cars.test("aaa"));
		System.out.println(startsWithAAndUpTo10Cars.test("Aaa"));
		System.out.println(startsWithAAndUpTo10Cars.test("Aaaccccccccccccccccccccccccc"));

	}

}
