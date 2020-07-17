package lambda_expression.unit10;

import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class StreamFilterExample {

	public static List<Student> filterStudents(){

		return StudentDataBase.getAllStudents().stream().filter(student -> student.getGender().equals("female"))
		.filter(student -> student.getGpa() >= 3.9)
		.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {

		filterStudents().forEach(System.out::println);

	}

}
