package lambda_expression.terminalOperation.unit15;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class StreamGroupByExample {

	public static void groupStudentByGender() {
	
		Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
		.stream()
		.collect(Collectors.groupingBy(Student::getGender));
		
		System.out.println(studentMap);
	}
	
	public static void customizedGroupBy() {
		
		Function<Student, String> fun = student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE" ; 
		
		Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.groupingBy(fun));
				
				System.out.println(studentMap);
	}
	
	public static void main(String[] args) {
		
		groupStudentByGender();
		customizedGroupBy();

	}

}
