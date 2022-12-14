package java11;

import java.util.List;
import java.util.stream.Collectors;

public class StringNewMwthods {

	public static void main(String[] args) {
		
		String multilineString = "Baeldung helps \n \n developers \n explore Java.";
		
		List<String> collect = multilineString.lines().filter( line -> !line.isBlank()).map(String::strip).collect(Collectors.toList());
		System.out.println(collect);
	}
	
}
