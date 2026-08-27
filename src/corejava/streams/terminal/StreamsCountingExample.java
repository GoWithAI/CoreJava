package corejava.streams.terminal;

import java.util.stream.Collectors;

import corejava.shared.sampledata.StudentDataBase;

public class StreamsCountingExample {

	public static long count() {
		return StudentDataBase.getAllStudents()
		.stream()
		.filter(student -> student.getGpa() >= 3.8)
		.collect(Collectors.counting());
	}
	
	public static void main(String[] args) {

		System.out.println(count());

	}

}
