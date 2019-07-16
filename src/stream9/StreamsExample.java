package stream9;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import streamsData.StudentDataBase;
import streamsData.Student;

public class StreamsExample {

	public static void main(String[] args) {

		Predicate<Student> gradePredicate = student -> student.getGradeLevel() >= 3;
		Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.9;

		Map<String, List<String>> studentInfo = StudentDataBase.getAllStudents().stream()
				.filter(gradePredicate)
				.filter(gpaPredicate)
				.collect(Collectors.toMap(Student::getName, Student::getActivities));

		System.out.println(studentInfo);
	}

}
