package lambda_expression.unit10;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class StreamsComparator {

	public static List<Student> sortStudentByName(){
		return StudentDataBase.getAllStudents().stream()
		.sorted(Comparator.comparing(Student::getName))
		.collect(Collectors.toList());
	}
	
	public static List<Student> sortStudentByGpa(){
		return StudentDataBase.getAllStudents().stream()
		.sorted(Comparator.comparing(Student::getGpa))
		.collect(Collectors.toList());
	}
	
	public static List<Student> sortReverseStudentByGpa(){
		return StudentDataBase.getAllStudents().stream()
		.sorted(Comparator.comparing(Student::getGpa).reversed())
		.collect(Collectors.toList());
	}
	
	
	public static void main(String[] args) {

		System.out.println(sortStudentByName());
		System.out.println(sortStudentByGpa());
		System.out.println(sortReverseStudentByGpa());
		
		
		sortStudentByName().forEach(System.out::println);
		sortStudentByGpa().forEach(System.out::println);
		sortReverseStudentByGpa().forEach(System.out::println);

	}

}
