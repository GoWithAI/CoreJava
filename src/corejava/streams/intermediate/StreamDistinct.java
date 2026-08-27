package corejava.streams.intermediate;

import java.util.List;

import corejava.shared.sampledata.Student;
import corejava.shared.sampledata.StudentDataBase;
import static java.util.stream.Collectors.toList;

public class StreamDistinct {

	public static void main(String[] args) {

		System.out.println(printStudentActivities());

		System.out.println(getStudentActivityCount());
		
		System.out.println(getStudentActivitySorted());
	}

	private static long getStudentActivityCount() {

		long count =StudentDataBase.getAllStudents().stream()
		.map(Student::getActivities)
		.flatMap(List::stream)
		.distinct()
		.count();
		
		return count;

	}
	
	private static List<String> getStudentActivitySorted() {

		List<String> studentSortedAcitivities=StudentDataBase.getAllStudents().stream()
		.map(Student::getActivities)// Stream<List<String>>
		.flatMap(List::stream) // Stream - string, string, string 
		.distinct()
		.sorted()
		.collect(toList());
		
		return studentSortedAcitivities;

	}

	private static List<String> printStudentActivities() {
		List<String> studentActivity = StudentDataBase.getAllStudents().stream() // Stream<Student>
				.map(Student::getActivities) // Stream<List<String>>
				.flatMap(List::stream) // Stream<String>
				.distinct().collect(toList());
		return studentActivity;
	}

}
