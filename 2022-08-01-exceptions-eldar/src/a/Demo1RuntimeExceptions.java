package a;

import java.util.Date;

public class Demo1RuntimeExceptions {

	public static void main(String[] args) {

		Object obj = "aaa";
		obj = new Date();
		System.out.println(((String) obj).length());

//			String input = JOptionPane.showInputDialog("enter number");
//			int x = Integer.parseInt(input);
//			System.out.println(x);

		int[] arr1 = new int[10];
		System.out.println(arr1[100]);

		int[] arr = new int[-9];
		String str = "aaa";
		str = null;
		System.out.println(str.length());

		System.out.println(3 / 0);

		System.out.println("END");

	}

}
