package lambda_expression.unit9.streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import data.Student;
import data.StudentDataBase;

public class StreamFilter {

	public static void main(String[] args) {

		Predicate<Student> studentGradeLevel = g -> g.getGradeLevel() >= 3;
		Predicate<Student> studentGender = g -> g.getGender().equals("male");

		Map<String, List<String>> collectMap = StudentDataBase.getAllStudents().stream()
				.filter(studentGradeLevel)
				.filter(studentGender)
				.collect(Collectors.toMap(Student::getName, Student::getActivities));

		System.out.println(collectMap);
		
		 List<Student> collectList = StudentDataBase.getAllStudents().stream()
			.filter(studentGradeLevel)
			.filter(studentGender)
			.collect(Collectors.toList());
		System.out.println(collectList);
		
		Set<Student> collectSet = StudentDataBase.getAllStudents().stream()
				.filter(studentGradeLevel)
				.filter(studentGender)
				.collect(Collectors.toSet());
			System.out.println(collectSet);
		
			
			//NOTE **Stream Pipeline**
			//Stream
			 Stream<Student> stream1 = StudentDataBase.getAllStudents().stream();
			//Intermediate Operation
			 Stream<Student> stream2 = stream1.filter(studentGradeLevel);
			 Stream<Student> stream3 = stream2.filter(studentGender);
			 //Terminal Operation - collect(..) method starts pipeline
			 // Stream are lazy , no intermediate operation executed
			 Set<Student> collectSet2 = stream3.collect(Collectors.toSet());
			 
			 System.out.println(collectSet2);
	}

}
