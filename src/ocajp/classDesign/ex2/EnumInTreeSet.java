package ocajp.classDesign.ex2;

import java.util.TreeSet;

public class EnumInTreeSet {

	enum Days {
		MONDAY(4), TUESDAY(2), SUNDAY(3);

		Days(int d) {
			this.d = d;
			System.out.println("CONSTRUCTOR");
		}

		int d;
	}

	public static void main(String[] args) {

		TreeSet<Days> s = new TreeSet<Days>();
		s.add(Days.MONDAY);
		s.add(Days.TUESDAY);
		s.add(Days.SUNDAY);

		System.out.println(s);
	}
}
