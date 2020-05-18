package lambda_expression.consumer.unit6;

import java.util.List;
import java.util.function.Consumer;

import data.Student;
import data.StudentDataBase;

public class ConsumerExample {

	static Consumer<Student> cStudent = (student) -> System.out.println(student);
	static Consumer<Student> cName = (student) -> System.out.println(student.getName());
	static Consumer<Student> cActivities = (student) -> System.out.println(student.getActivities());

	public static void printAllStudents() {

		List<Student> allStudents = StudentDataBase.getAllStudents();

		allStudents.forEach(cStudent);

	}

	public static void printNameAndActivites() {

		List<Student> allStudents = StudentDataBase.getAllStudents();

		allStudents.forEach(cName.andThen(cActivities)); // consumer Chaining

	}

	public static void printNameAndActivitiesUsingConditions() {

		List<Student> allStudents = StudentDataBase.getAllStudents();

		allStudents.forEach((student) -> {
			if (student.getGradeLevel() >= 3 && student.getGpa() == 4.0) {
				cName.andThen(cActivities).accept(student);
			}
		});
	}

	public static void main(String[] args) {

		Consumer<String> c = (s) -> System.out.println(s.toUpperCase());

		c.accept("java8");

		printAllStudents();
		System.out.println("********************************");
		printNameAndActivites();
		System.out.println("********************************");
		printNameAndActivitiesUsingConditions();

	}

}
