package whatIsOutPutExamples;

import java.time.Period;

public class PeroidEx {

	public static void main(String[] args) {
		Period p1 = Period.ofYears(1);
		Period p2 = Period.of(0, 1, 1);

		Period p3 = p1.plus(p2);
		System.out.println(p3.getDays());
	}

}
