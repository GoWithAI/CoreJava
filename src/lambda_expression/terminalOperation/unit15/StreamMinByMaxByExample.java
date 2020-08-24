package lambda_expression.terminalOperation.unit15;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class StreamMinByMaxByExample {


	public static Optional<Student> minByExample(){
		return StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
	}

	public static Optional<Student> maxByExample(){
		return StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
	}
	
	public static void main(String[] args) {

		System.out.println(minByExample());
		
		System.out.println(maxByExample());
	}

}
