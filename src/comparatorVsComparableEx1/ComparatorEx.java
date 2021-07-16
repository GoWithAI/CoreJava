package comparatorVsComparableEx1;

import java.util.Comparator;

public class ComparatorEx {

	public static void main(String[] args) {

		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};

		System.out.println("Compare :" + comparator.compare(3, 2));

		Comparator<Integer> comparator2 = (i, i2) -> i.compare(i, i2);

		System.out.println("lambada compare :" + comparator2.compare(3, 2));
	}

}