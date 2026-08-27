package corejava.streams.basics;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import corejava.shared.sampledata.Student;
import corejava.shared.sampledata.StudentDataBase;

public class StreamsExample {

	public static void main(String[] args) {

		Function<Student, String> studentName = Student::getName;
		Function<Student, List<String>> studentActivity = Student::getActivities;
		
		Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.toMap(studentName, studentActivity));
		System.out.println(studentMap);
		
		Map<String, List<String>> studentMap2 = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		
		System.out.println(studentMap2);
		
		
		
		
	}

}
