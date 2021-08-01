package stream9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
		
		String[] names = {"Sam", "Pamela", "Dave", "Pascal", "Erik"};
		List<String> l=new ArrayList<String>();
		l.add("1");
		l.add("2");
		l.add("3");
		l.add("4");
		l.add("5");
		l.add("6");
		IntStream.range(0, l.size()).forEach(index -> {
			System.out.println(index +"   "+ l.get(index));
		});
		
		
		
		
	}

}
