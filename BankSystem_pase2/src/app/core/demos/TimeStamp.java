package app.core.demos;

import java.util.Date;

public class TimeStamp {

	public static void main(String[] args) {
		
		long ts1 = 0;
		// get timestamp of runtime
		long ts2 = System.currentTimeMillis();
		System.out.println(ts2);
		
		
		Date date = new Date(ts1);
		System.out.println(date);

	}

}
