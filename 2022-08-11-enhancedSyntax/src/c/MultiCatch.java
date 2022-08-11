package c;

import javax.swing.JOptionPane;

public class MultiCatch {

	public static void main(String[] args) {

		try {
			int x = Integer.parseInt(JOptionPane.showInputDialog("Enter Number"));
			int y = Integer.parseInt(JOptionPane.showInputDialog("Enter Number"));
			System.out.println(x / y);
		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println("Error");
		}

	}

}
