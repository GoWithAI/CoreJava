package java8DateTime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class DateTimeExample1 {

	public static void main(String[] args) {

		LocalDateTime localdateTime = LocalDateTime.now();

		System.out.println(localdateTime);

		LocalDateTime localDateTime2 = LocalDateTime.of(2019, 07, 29, 7, 48);

		System.out.println(localDateTime2);

		System.out.println("getDayOfMonth=" + localdateTime.getDayOfMonth());
		System.out.println("getDayOfMonth=" + localDateTime2.getDayOfMonth());

		System.out.println("getDayOfYear=" + localdateTime.getDayOfYear());
		System.out.println("getHour=" + localdateTime.getHour());
		System.out.println("getMinute=" + localdateTime.getMinute());
		System.out.println("getDayOfWeek=" + localdateTime.getDayOfWeek());

		System.out.println("getMinute=" + localdateTime.getMinute());
		System.out.println("getNano=" + localdateTime.getNano());
		System.out.println("getYear=" + localdateTime.getYear());
		System.out.println("getMonth=" + localdateTime.getMonth());
		System.out.println("toLocalDate=" + localdateTime.toLocalDate());
		System.out.println("getSecond=" + localdateTime.getSecond());
		System.out.println("plusSeconds=" + localdateTime.plusSeconds(120));
		
		
		/***********ChronoField**********/
		
		System.out.println(localdateTime.get(ChronoField.DAY_OF_MONTH));
		System.out.println("DAY_OF_WEEK="+localdateTime.get(ChronoField.DAY_OF_WEEK));
		System.out.println("ALIGNED_WEEK_OF_MONTH="+localdateTime.get(ChronoField.ALIGNED_WEEK_OF_MONTH));
		System.out.println(localdateTime.get(ChronoField.YEAR_OF_ERA));
		System.out.println(localdateTime.getLong(ChronoField.MICRO_OF_DAY));
		System.out.println(localdateTime.getLong(ChronoField.EPOCH_DAY));
		System.out.println(localDateTime2.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
		
	}

}
