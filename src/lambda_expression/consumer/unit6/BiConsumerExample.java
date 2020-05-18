package lambda_expression.consumer.unit6;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import data.Student;
import data.StudentDataBase;

public class BiConsumerExample {

	public static void displayNameAndActivities() {

		BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out
				.println(name + " : " + activities);

		List<Student> allStudents = StudentDataBase.getAllStudents();

		Consumer<Student> c1 = student -> biConsumer.accept(student.getName(), student.getActivities());

		allStudents.forEach(c1);

		System.out.println("***********************************");
		allStudents.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
	}

	public static void main(String[] args) {

		BiConsumer<String, String> displayValue = (a, b) -> {
			System.out.println(a + "  :  " + b);
		};

		displayValue.accept("5", "7");

		BiConsumer<Integer, Integer> multiplication = (a, b) -> {
			System.out.println("multiplication : " + a * b);
		};

		BiConsumer<Integer, Integer> sub = (a, b) -> {
			System.out.println("multiplication : " + a / b);
		};

		multiplication.andThen(sub).accept(10, 2);

		displayNameAndActivities();
	}

}
