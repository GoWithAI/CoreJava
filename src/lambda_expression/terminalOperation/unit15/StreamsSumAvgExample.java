package lambda_expression.terminalOperation.unit15;

import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class StreamsSumAvgExample {

	public static int sum() {
		return StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.summingInt(Student::getNoteBooks));
	}
	
	public static double average() {
		return StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.averagingInt(Student::getNoteBooks));
	}
	
	
	public static void main(String[] args) {

		System.out.println(sum());
		
		System.out.println(average());
		
	}

}
