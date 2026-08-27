package corejava.streams.intermediate;

import java.util.List;
import java.util.stream.Collectors;

import corejava.shared.sampledata.Student;
import corejava.shared.sampledata.StudentDataBase;

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
