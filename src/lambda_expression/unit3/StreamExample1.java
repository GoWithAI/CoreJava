package lambda_expression.unit3;

import java.util.Arrays;
import java.util.List;

import lambda_expression.unit1.Person;

public class StreamExample1 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));

		people.stream()
		.filter(p-> p.getLastName().startsWith("C"))
		.forEach(p -> System.out.println(p.getFirstName()));
		
		long count = people.stream()
		.filter(p-> p.getLastName().startsWith("D"))
		.count();
		System.out.println(count);
	}

}
