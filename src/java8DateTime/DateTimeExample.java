package java8DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeExample {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();

		System.out.println(localDate);

		LocalTime localTime = LocalTime.now();

		System.out.println(localTime);
		
		LocalDateTime localDateTime = LocalDateTime.now();

		System.out.println(localDateTime);

	}

}
