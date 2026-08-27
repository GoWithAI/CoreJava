package corejava.streams.terminal;

import java.util.stream.Collectors;

import corejava.shared.sampledata.Student;
import corejava.shared.sampledata.StudentDataBase;

public class StreamsJoiningExample {
	
	public static String joining_1() {
		
		return StudentDataBase.getAllStudents()
		.stream()
		.map(Student::getName)
		.collect(Collectors.joining());
		
	}
	
	public static String joining_2() {
		return StudentDataBase.getAllStudents()
				.stream()
				.map(Student::getName)
				.collect(Collectors.joining("-"));
	}
	
	public static String joining_3() {
		return StudentDataBase.getAllStudents()
				.stream()
				.map(Student::getName)
				.collect(Collectors.joining("-", "(", ")"));
	}

	public static void main(String[] args) {

		System.out.println("joining name :" + joining_1());
		System.out.println("joining name :" + joining_2());
		System.out.println("joining name :" + joining_3());

	}

}
