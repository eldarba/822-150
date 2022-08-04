package app.core;

public class Logger {
	
	String driverName;

	public Logger(String driverName) {
		super();
		this.driverName = driverName;
	}
	
	public static void log(Log log) {
		System.out.println(log.toString());
	}

}
