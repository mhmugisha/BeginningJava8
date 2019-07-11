package dateTime;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZonedDateTime;

public class CurrentDateTime {

	public static void main(String[] args) {
		// Get current date, time and datetime
		LocalDate dateOnly = LocalDate.now();
		LocalTime timeOnly = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		ZonedDateTime dateTimeWithZone = ZonedDateTime.now();
		
		System.out.println("Current Date: " + dateOnly);
		System.out.println("Current Time: " + timeOnly);
		System.out.println("Current Date and Time: " + dateTime);
		System.out.println("Current Date, Time, and Zone: " + dateTimeWithZone);
		
		// Create a LocalDate January 12, 1968 using factory method of() 
		LocalDate myBirthDate = LocalDate.of(1969, Month.JUNE, 01);
		LocalTime myBirthTime = LocalTime.of(7, 30);
		System.out.println("My Birth Date: " + myBirthDate);
		System.out.println("My Birth Time: " + myBirthTime);
		
		Instant i = Instant.now();
		System.out.println();
		System.out.println(i);
		
		Instant i2 = Instant.ofEpochSecond(2000000000);
		System.out.println(i2);
		
		LocalDate id = LocalDate.of(2007, 6, 23);
		DayOfWeek dw = DayOfWeek.from(id);
		System.out.println();
		System.out.println(dw);
		
		
	}

}
