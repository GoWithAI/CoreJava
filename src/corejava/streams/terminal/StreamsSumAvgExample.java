package corejava.streams.terminal;

import java.util.stream.Collectors;

import corejava.shared.sampledata.Student;
import corejava.shared.sampledata.StudentDataBase;

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
