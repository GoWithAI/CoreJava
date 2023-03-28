package whatIsOutPutExamples;

import java.util.ArrayList;
import java.util.List;

public class IntegerTest {
	static int _q = 5;
	static int $=5;
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("A");
		list.add("C");
		list.add("E");
		list.add("D");

		list.add(5, "B");
		list.set(4, "F");
		
		System.out.println(list);
	}
}
