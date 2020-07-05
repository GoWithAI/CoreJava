package lambda_expression.unit9.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class DebugStream {

	public static void main(String[] args) {
		
		
		Predicate<Student> studentGradeLevel = g -> g.getGradeLevel() >= 3;
		Predicate<Student> studentGender = g -> g.getGender().equals("male");
		
		Map<String, List<String>> collectMap = StudentDataBase.getAllStudents().stream()
				.peek(s ->{
				System.out.println("After Stream :" +s);	
				})
				.filter(studentGradeLevel)
				.peek(s ->{
					System.out.println("After 1st Filter :" +s);	
					})
				.filter(studentGender)
				.peek(s ->{
					System.out.println("After 2nd Filter :" +s);	
					})
				.collect(Collectors.toMap(Student::getName, Student::getActivities));


	}

}
