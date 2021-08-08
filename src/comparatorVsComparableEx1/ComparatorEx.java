package comparatorVsComparableEx1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

//we can use multiple comparison
// Here we can sort by using multiple Instance Variable - but Only One Instance Variable we can sort 
public class ComparatorEx {

	static Consumer<Movie2> display = m -> System.out.println(m.getName() + " " + m.getYear() + " " + m.getRating());

	public static void main(String[] args) {

		ArrayList<Movie2> list = new ArrayList<Movie2>();
		list.add(new Movie2("Force Awakens", 8.3, 2015));
		list.add(new Movie2("Star Wars", 8.7, 1977));
		list.add(new Movie2("Empire Strikes Back", 8.8, 1980));
		list.add(new Movie2("Return of the Jedi", 8.4, 1983));

		System.out.println("**Sort By Year**");
		Collections.sort(list);
		list.forEach(display);

		System.out.println("**Sort By Rating**");
		Collections.sort(list, new RatingCompare());
		list.forEach(display);

		System.out.println("**Sort By Name**");
		Collections.sort(list, new NameCompare());
		list.forEach(display);

	}

	private void test() {

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