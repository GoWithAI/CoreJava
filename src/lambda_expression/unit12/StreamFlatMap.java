package lambda_expression.unit12;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

import data.Student;
import data.StudentDataBase;

public class StreamFlatMap {

	public static List<String> printStudentActivites() {

		List<List<String>> studentActivities = StudentDataBase.getAllStudents().stream() // Stream<Student>
				.map(Student::getActivities) // Stream<List<String>>
				.collect(toList());

		System.out.println(studentActivities);

		Function<List<String>, Stream<String>> activitiesFun = f -> {
			f.forEach(s -> {
				if (s.equals("swimming")) {
					s = s.toUpperCase();
					System.out.println(s);

				}
			});

			for (String s : f) {
				if (s.equals("swimming")) {
					s=null;
				}
			}
			
			// we can do it in this Case
			for(int i=0; i<f.size();i++) {
				String string = f.get(i);
				if (string.equals("swimming")) {
					f.set(i, string.toUpperCase());
				}
			}

			return f.stream();
		};

		List<String> studentActivitiesFlaten = StudentDataBase.getAllStudents().stream() // Stream<Student>
				.map(Student::getActivities) // Stream<List<String>>
				.flatMap(activitiesFun) // Stream<String>
				.collect(toList());

		System.out.println(studentActivitiesFlaten);
		
		List<String> studentActivitiesFlaten2 = StudentDataBase.getAllStudents().stream() // Stream<Student>
				.map(Student::getActivities) // Stream<List<String>>
				.flatMap(List::stream) // Stream<String>
				.collect(toList());

		System.out.println(studentActivitiesFlaten2);
		
		System.out.println(studentActivitiesFlaten2);

		return null;

	}

	public static void main(String[] args) {
		printStudentActivites();
	}

}
