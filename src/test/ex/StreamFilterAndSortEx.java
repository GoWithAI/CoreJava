package test.ex;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class StreamFilterAndSortEx {

	public static void main(String[] args) {

		List<Student> allStudents = StudentDataBase.getAllStudents();

		// uppercase
		Function<Student, String> upperCase = s -> s.getName().toUpperCase();
		// start char x
		Predicate<Student> predicate = s -> s.getName().subSequence(0, 1).equals("J");
		// sorted

		List<String> res = allStudents.stream().filter(predicate).map(upperCase).sorted().collect(Collectors.toList());
		System.out.println(res);
	}

}
