package lambda_expression.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit2ex {

	public static void main(String[] args) {
		List<Person> people=Arrays.asList(
				new Person("Charles","Dickens",60),
				new Person("Lewis","Carroll",42),
				new Person("Thomas","Carlyle",51),
				new Person("charlotte","Bronte",45),
				new Person("Matthew","Arnold",39)
				);
		
		//Steps 1: Sort list by last name
		Collections.sort(people,new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {				
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		//Steps 2: Create a method that prints all elements in the list
		System.out.println("Printing all persons");
		printAll(people);
		//Steps 3: Create a method that prints all people that have last name beginning with c
		System.out.println("Printing all persons with first name beginning with C");
		printConditionally(people,new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("C");
		 	}
		});
		
		System.out.println("Printing all persons with last name beginning with C");
		printConditionally(people,new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
		});
		
		
	}

	private static void printConditionally(List<Person> people,Condition condtion) {
		for(Person p : people){
			/*if(p.getLastName().startsWith("C")){
				System.out.println(p);
			}*/
			if(condtion.test(p)){
				System.out.println(p);
			}
		}
		
	}

	private static void printAll(List<Person> people) {
		for(Person p: people){
			System.out.println(p);
		}
	}

}

interface Condition{
	boolean test(Person p);
}
