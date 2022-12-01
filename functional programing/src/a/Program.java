package a;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Program {

	public static void main(String[] args) {

		JFrame fr = new JFrame("program");
		fr.setBounds(100, 100, 600, 300);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		fr.setLayout(null); // cancel the layout manager

		JButton button = new JButton("click");
		button.setBounds(100, 100, 150, 25);

		// option 1 - implementing class
//		MyListener myListener = new MyListener();
//		button.addActionListener(myListener); // registration

		// option 2 - implementing with anonymous class
//		button.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("clicked");
//
//			}
//
//		});

		// option 3 - implementing with lambda expression
		button.addActionListener(e -> System.out.println("clicked"));

		fr.add(button);

		fr.setVisible(true);

	}

}
