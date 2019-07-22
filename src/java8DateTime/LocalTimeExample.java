package java8DateTime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class LocalTimeExample {

	public static void main(String[] args) {
		
		LocalTime localTime=LocalTime.now();
		System.out.println("now time :"+localTime);
		
		LocalTime localTime2=LocalTime.of(4, 18);
		System.out.println("HH:MM ="+localTime2);
		
		LocalTime localTime3=LocalTime.of(13, 59, 55, 10);
		System.out.println("HH:MM:SS ="+localTime3);
		
		/***Get value from Local Time***/
		System.out.println("getHour:"+localTime.getHour());
		System.out.println("getMinute:"+localTime.getMinute());
		System.out.println("getNano:"+localTime.getNano());
		System.out.println("toSecondOfDay:"+localTime.toSecondOfDay());
		System.out.println(""+localTime.get(ChronoField.HOUR_OF_DAY));
		System.out.println(""+localTime.get(ChronoField.MINUTE_OF_DAY));
		
		/**
         * Modifying the values in Local Time
         */
		
		System.out.println("minusHours :"+localTime.minusHours(10));
		System.out.println("ChronoUnit.HOURS :"+localTime.minus(2,ChronoUnit.HOURS));
		System.out.println("with ChronoField.HOUR_OF_DAY :"+localTime.with(ChronoField.HOUR_OF_DAY, 7));
		System.out.println("MIDNIGHT :"+localTime.with(LocalTime.MIDNIGHT));
		System.out.println("NOON :"+localTime.with(LocalTime.NOON));
		System.out.println("plus SECONDS:"+localTime.plus(15,ChronoUnit.SECONDS));
		System.out.println("withHour : "+localTime.withHour(23));
	}

}
