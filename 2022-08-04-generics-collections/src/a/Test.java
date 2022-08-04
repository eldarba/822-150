package a;

public class Test {

	public static void main(String[] args) {

		// type argument - given on object creation
		Box<String> box = new Box<>(); // content is null

		box.setContent("Hello"); // content now is a String

		System.out.println(box.getContent());

		// type argument - given on object creation
		Box<Integer> boxOfInt = new Box<>();

		boxOfInt.setContent(5); // content now is a Integer

		System.out.println(boxOfInt.getContent());

	}

}
