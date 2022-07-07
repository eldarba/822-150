package a.task.flow.control;

public class Fibonachi2 {

	public static void main(String[] args) {

		// input a number and print Fibonaci set from 1 to that input
		// input an index and print Fibonaci member at that index

		// print 10 first members in Fibonaci set

		int f1 = 1;
		int f2 = 1;

		System.out.print(f1 + ", " + f2 + ", ");

		for (int i = 3; i <= 10; i++) {
			int t = f2;
			f2 = f1 + f2;
			f1 = t;
			System.out.print(f2 + ", ");
		}

	}

}
