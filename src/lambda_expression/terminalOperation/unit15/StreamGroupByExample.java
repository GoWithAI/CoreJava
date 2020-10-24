package lambda_expression.terminalOperation.unit15;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class StreamGroupByExample {

	private static Function<Student, String> fun = student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE";

	public static void groupStudentByGender() {

		Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGender));

		System.out.println(studentMap);
	}

	public static void customizedGroupBy() {

		Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(fun));

		System.out.println(studentMap);
	}

	public static void twoLevelGrouping_1() {
		Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.groupingBy(fun)));
		System.out.println(studentMap);
	}

	public static void twoLevelGrouping_2() {
		Map<Integer, Integer> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.summingInt(Student::getNoteBooks)));
		System.out.println(studentMap);
	}

	public static void threeArgumentGroupBy() {
		LinkedHashMap<String, Set<Student>> studentLinkedHashMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new, Collectors.toSet()));
		
		System.out.println(studentLinkedHashMap);
	}

	public static void main(String[] args) {

		groupStudentByGender();
		customizedGroupBy();
		System.out.println("*******************************");
		twoLevelGrouping_1();
		twoLevelGrouping_2();
		threeArgumentGroupBy();

	}

}
