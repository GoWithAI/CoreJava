package lambda_expression.unit10;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.List;
import java.util.Set;

import data.Student;
import data.StudentDataBase;

public class StreamMap {

	public static void main(String[] args) {

		// map() transform one type into other type
		List<String> studentList = StudentDataBase.getAllStudents().stream()
				.map(Student::getName)
				.map(String::toUpperCase).collect(toList());
		
		System.out.println("List :"+studentList);
		
		
		Set<String> studentSet = StudentDataBase.getAllStudents().stream()
				.map(Student::getName)
				.map(String::toUpperCase).collect(toSet());
		
		System.out.println("Set :"+studentSet);
		
		List<Student> allStudents = StudentDataBase.getAllStudents();
		List<String> studentList2 = allStudents.stream()
				.map(Student::getName)
				.map(String::toUpperCase).collect(toList());
		
		System.out.println("List :"+allStudents);
		System.out.println("List :"+studentList2);
		
		//Check After
		/*
		StudentDataBase.getAllStudents().stream()
				.map(Student::getGpa)
				.map(String::toUpperCase).collect(toList());
		*/
	}

}
