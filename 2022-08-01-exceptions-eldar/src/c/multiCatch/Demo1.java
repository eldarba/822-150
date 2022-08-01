package c.multiCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("enter array length: ");
			int x = sc.nextInt();
			int[] arr = new int[x];
			System.out.println(arr);
		} catch (InputMismatchException e) {
			System.out.println("this is not a number");
		}catch(NegativeArraySizeException e) {
			System.out.println("array size can't be negative");
		}catch(Exception e) {
			// some other error
			e.printStackTrace();
		}

	}

}
