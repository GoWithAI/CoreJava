package test.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EvenNumberTest {

	
	
	public static void main(String[] args) {
		
		Predicate<Integer> evenPredicate = (e) -> (e%2) == 1;
		
		
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(5);
		l.add(2);
		l.add(4);
		l.add(3);
		
		List<Integer> even= l.stream().filter(evenPredicate).collect(Collectors.toList());
		System.out.println(even);
		
		
	}

}
