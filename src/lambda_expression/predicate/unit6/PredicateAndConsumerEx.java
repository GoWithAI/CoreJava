package lambda_expression.predicate.unit6;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import data.Student;
import data.StudentDataBase;

public class PredicateAndConsumerEx {
	static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
	static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

	BiConsumer<String, List<String>> biConsumer = (name, activities) -> {
		System.out.println(name + "    " + activities);
	};

	Consumer<Student> sConsumer = (student) -> {
		if (p1.and(p2).test(student)) {
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
