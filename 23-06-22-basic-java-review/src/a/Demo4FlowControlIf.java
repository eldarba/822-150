package a;

public class Demo4FlowControlIf {

	public static void main(String[] args) {

		{// if
			int x = (int) (Math.random() * 101);
			if (x > 50) {
				System.out.println("Big");
			}
		}

		{// if-else
			int x = (int) (Math.random() * 101);
			if (x > 50) {
				System.out.println("Big");
			} else {
				System.out.println("Small");
			}
		}

		{// if-else-if
			int x = (int) (Math.random() * 101);
			if (x == 10) {
				System.out.println("Ten");
			} else if (x == 20) {
				System.out.println("Twenty");
			} else if (x == 30) {
				System.out.println("Thirty");
			} else {
				System.out.println("something else");
			}
		}

		{ // nested if
			int x = (int) (Math.random() * 101);
			if (x % 2 == 0) {
				if (x > 50) {
					System.out.println("x is even and big");
				}
			}
		}

		{ // [AND &&] [OR ||] to create complex boolean expressions
			int x = (int) (Math.random() * 101);
			if (x % 2 == 0 && x > 50 || x == 1) {
				System.out.println("x is even and big or equals to one");
			}
		}

		{ // ternary operator:
			// [boolean]?[returned value if true]:[returned value if false]
			int x = (int) (Math.random() * 101);
			String message = x > 50 ? "x is big" : "x is small";
			System.out.println(message);
		}
		
		// switch
		// while loop
		// do-while loop
		// for loop

	}

}
