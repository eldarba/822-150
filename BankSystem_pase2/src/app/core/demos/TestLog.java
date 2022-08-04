package app.core.demos;

import app.core.Log;

public class TestLog {

	public static void main(String[] args) {
		
		Log log1 = new Log(0, 209, "deposit", 300);
		Log log2 = new Log(209, "deposit", 300);
		
		System.out.println(log1.toString());
		System.out.println(log2.toString());

	}

}
