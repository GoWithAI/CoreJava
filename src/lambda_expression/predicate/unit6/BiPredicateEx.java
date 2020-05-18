package lambda_expression.predicate.unit6;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

import data.Student;
import data.StudentDataBase;

public class BiPredicateEx {

	static BiPredicate<Integer, Double> biPredicateGradeAndGPA = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;
	static BiPredicate<String, String> biPredicateNameAndGender = (name, gender) -> name.contains("Dave") || name.contains("Emily") && gender.contains("male");

	BiConsumer<String, List<String>> biConsumer = (name, activities) -> {
		System.out.println(name + "    " + activities);
	};

	Consumer<Student> sConsumer = (student) -> {
		if (biPredicateGradeAndGPA.test(student.getGradeLevel(), student.getGpa())) {
			biConsumer.accept(student.getName(), student.getActivities());
		}
	};

	public void printNameAndActivities(List<Student> students) {
		students.forEach(sConsumer);
	}

	public static void main(String[] args) {
		List<Student> allStudents = StudentDataBase.getAllStudents();

		new PredicateAndConsumerEx().printNameAndActivities(allStudents);
	}
}
