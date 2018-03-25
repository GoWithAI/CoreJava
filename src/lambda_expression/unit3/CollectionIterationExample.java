package lambda_expression.unit3;

import java.util.Arrays;
import java.util.List;

import lambda_expression.unit1.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));

		System.out.println("For loop");
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}

		System.out.println("For Each/in Loop");
		for (Person p : people) {
			System.out.println(p);
		}

		System.out.println("Lambda forEach");
		people.forEach(p -> System.out.println(p));//

		System.out.println("Lambda forEach other Expression");
		people.forEach(System.out::println);// Make thread easier to run in multiple threads ex. first 2 object by
											// thread 1 and other 3 object by thread 2

	}

}
