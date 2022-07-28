package b.constants;

import javax.swing.JOptionPane;

public class Test2 {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("enter color");
		
		JOptionPane.showMessageDialog(null, "you chose: " + input);
		
		// convert the input to Color and create a car with that color
		
		Car4 car = new Car4(Car4.Color.valueOf(input));
		System.out.println(car.getColor());
		
		
	}
 
		

}
