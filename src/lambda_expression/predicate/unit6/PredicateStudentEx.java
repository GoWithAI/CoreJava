package lambda_expression.predicate.unit6;

import java.util.List;
import java.util.function.Predicate;

import data.Student;
import data.StudentDataBase;

public class PredicateStudentEx {

	static public Predicate<Student> gradeLevelPredicate = (s) -> s.getGradeLevel() >= 3;
	static Predicate<Student> gpaPredicate = (s) -> s.getGpa() >= 3.9;

	public static void filterStudentByGradeLevel() {

		List<Student> allStudents = StudentDataBase.getAllStudents();
		allStudents.forEach(student -> {
			if(gradeLevelPredicate.test(student)) {
				System.out.println(student);
			}
			
		});
	}

	public static void filterStudentByGpa() {
		List<Student> allStudents = StudentDataBase.getAllStudents();
		allStudents.forEach(student -> {
			if(gpaPredicate.test(student)) {
				System.out.println(student);
			}
			
		});
	}

	public static void filterStudent() {
		List<Student> allStudents = StudentDataBase.getAllStudents();
		allStudents.forEach(student -> {
			if(gradeLevelPredicate.or(gpaPredicate).negate().test(student)) {
				System.out.println(student);
			}
			
		});
	}

	public static void main(String[] args) {
		System.out.println("filterStudentByGradeLevel");
		filterStudentByGradeLevel();
		System.out.println("filterStudentByGpa");
		filterStudentByGpa();
		System.out.println("filterStudents");
		filterStudent();
	}

}
