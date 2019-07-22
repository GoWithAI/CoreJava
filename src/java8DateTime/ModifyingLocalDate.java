package java8DateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalAmount;

public class ModifyingLocalDate {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();

		/*********** Modifying Local Date **********/
		System.out.println(localDate);
		System.out.println("plusDays="+localDate.plusDays(10));
		System.out.println("plusMonths="+localDate.plusMonths(2));
		System.out.println("ALIGNED_WEEK_OF_MONTH="+localDate.get(ChronoField.ALIGNED_WEEK_OF_MONTH));
		System.out.println("plusWeeks="+localDate.plusWeeks(1));
		System.out.println("plusYears="+localDate.plusYears(3));
	
		System.out.println("minusDays="+localDate.minusDays(1));
		/**Temporal Adjusters**/
		System.out.println("firstDayOfMonth="+localDate.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println("firstDayOfNextMonth="+localDate.with(TemporalAdjusters.firstDayOfNextMonth()));
		System.out.println("firstDayOfYear="+localDate.with(TemporalAdjusters.firstDayOfYear()));
		System.out.println("lastDayOfMonth="+localDate.with(TemporalAdjusters.lastDayOfMonth()));
		System.out.println("firstDayOfNextYear="+localDate.with(TemporalAdjusters.firstDayOfNextYear()));
		/***Minus Date****/
		System.out.println("minusDays="+localDate.minusDays(1));
		System.out.println("CENTURIES behind="+localDate.minus(1, ChronoUnit.CENTURIES));
		System.out.println("DAYS behind="+localDate.minus(7, ChronoUnit.DAYS));
		System.out.println("MONTHS behind="+localDate.minus(1, ChronoUnit.MONTHS));
		System.out.println("DECADES behind="+localDate.minus(1, ChronoUnit.DECADES));
	
		
		System.out.println("withYear="+localDate.withYear(2020));
		System.out.println("withMonth="+localDate.withMonth(10));
		
		System.out.println("with YEAR="+localDate.with(ChronoField.YEAR, 2025));
		System.out.println("ALIGNED_DAY_OF_WEEK_IN_MONTH="+localDate.with(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH, 2));
		
		System.out.println("2nd week Monday Date will return ="+localDate.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.MONDAY)));
		System.out.println("Next Date of Week="+localDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY)));
		
		/*is Lead Year*/
		System.out.println("is Leap Year :"+localDate.isLeapYear());
		System.out.println("is Leap Year :"+LocalDate.ofYearDay(2020, 01).isLeapYear());
		
		/**Unsupported **/
		if(localDate.isSupported(ChronoUnit.SECONDS)) {
			System.out.println("Unsupproted Exception="+localDate.minus(7, ChronoUnit.SECONDS));	
		}
		System.out.println("isSupproted :"+localDate.isSupported(ChronoUnit.SECONDS));
		
		if(localDate.isSupported(ChronoUnit.DAYS)) {
			System.out.println("Supproted DAYS="+localDate.minus(7, ChronoUnit.DAYS));	
		}
		System.out.println("isSupproted :"+localDate.isSupported(ChronoUnit.DAYS));
		
		/*isEqual, isBefore, isAfter, */
		LocalDate date1 = LocalDate.of(2019, 07, 1);
		LocalDate date2 = LocalDate.of(2019, 07, 25);
		LocalDate date3 = LocalDate.of(2019, 07, 25);
		
		System.out.println("isBefore="+date1.isBefore(date2));
		System.out.println("isAfter="+date2.isAfter(date1));
		System.out.println("isAfter="+date1.isAfter(date2));
		System.out.println("isEqual="+date2.isEqual(date3));
		System.out.println("isEqual="+date1.isEqual(date3));
	}

}
