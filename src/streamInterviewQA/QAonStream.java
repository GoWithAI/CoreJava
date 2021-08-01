package streamInterviewQA;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

/**
 * 1. start "J" 2. upperCase 3. sort
 */
public class QAonStream {

	static Predicate<Student> startWith = s -> s.getName().startsWith("J");

	static Function<Student, String> mapperToUpperCaseReturnString = (s) -> {
		return s.getName().toUpperCase();
	};

	static Function<Student, Student> mapperToUpperCaseReturnStudent = (student) -> {
		String upperCaseName = student.getName().toUpperCase();
		student.setName(upperCaseName);
		return student;
		
	};

	static Comparator<String> sortCompString = Comparator.naturalOrder();
	
	static Comparator<Student> sortCompStudent = Comparator.comparing(Student::getName);

	public static void main(String[] args) {

		onString();
		onStudentObject();
	}

	private static void onStudentObject() {

		List<Student> collect = StudentDataBase.getAllStudents().stream()
				.filter(Objects::nonNull).filter(startWith).map(mapperToUpperCaseReturnStudent)
				.sorted(sortCompStudent).collect(Collectors.toList());
		System.out.println(collect);
	}

	public static void onString() {
		List<String> collect = StudentDataBase.getAllStudents().stream().filter(Objects::nonNull).filter(startWith)
				.map(mapperToUpperCaseReturnString).sorted(sortCompString).collect(Collectors.toList());

		System.out.println(collect);
	}

}
