package lab1;

import java.util.Random;

public class Test2 {

	/*
	 * Define a random number between 100 to 350 for time in minutes of a movie
	 * 
	 * Print the time in minutes
	 * 
	 * Print the time in terms of Hours and Minutes
	 */
	public static void main(String[] args) {
		int a = 100;
		int b = 350;

		int time = (int) (Math.random() * (b - a + 1)) + a;
		System.out.println("movie time in minutes: " + time);

		int hours, minutes;
		hours = time / 60;
		minutes = time % 60;
		
		if(minutes>=10) {
			System.out.println(hours + ":" + minutes);
		}else {
			System.out.println(hours + ":0" + minutes);
		}


	}

}
