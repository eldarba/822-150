package test;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Dates {


	public static void main(String[] args) {
		
		// date and time - now
		LocalDateTime now = LocalDateTime.now();
		// date and time - specific
		LocalDateTime dateTime = LocalDateTime.of(2020, 5, 15, 0, 0);
		
		// date - now
		LocalDate date1 = LocalDate.now();
		// date - specific
		LocalDate date2 = LocalDate.of(1980, 8, 23);

		System.out.println(now);
		System.out.println(dateTime);
		System.out.println(date1);
		System.out.println(date2);
		
		System.out.println("=====================");
		// convert LocalDate to java.sql.Date - for JDBC
		Date sqlDate = Date.valueOf(date2);
		System.out.println(sqlDate);
		
		// convert java.sql.Date to LocalDate - for JDBC
		LocalDate ld = sqlDate.toLocalDate();
		
		
		
		

	}

}
