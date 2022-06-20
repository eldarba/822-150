package lab10;

import java.util.Arrays;

public class TestTar02 {

	public static void main(String[] args) {
		
		int[] arr = { 2, 5, 7, 2, 3, 5, 9, 2, 0, 10 };
		System.out.println(Arrays.toString(arr));
		
		arr = Tar02Method.eliminateDuplicates(arr);
		System.out.println(Arrays.toString(arr));

	}

}
