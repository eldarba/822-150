package demos;

import java.sql.Date;
import java.time.LocalDate;

public class DatesDemo {

	public static void main(String[] args) {
		// java.time.LocalDate
		LocalDate localDate = LocalDate.of(2020, 1, 25);

		// convert java.time.LocalDate to java.sql.Date
		Date sqlDate = Date.valueOf(localDate);

		// convert java.sql.Datejava.time.LocalDate to java.time.LocalDate
		LocalDate localDate2 = sqlDate.toLocalDate();

	}

}
