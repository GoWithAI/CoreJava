package lambda_expression.function.unit6;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import data.Student;
import data.StudentDataBase;

public class SupplierEx {

	public static void main(String[] args) {

		Supplier<Student> studentSupplier = () -> {
			return new Student("Adam", 2, 3.6, "male", 10, Arrays.asList("swimming", "basketball", "volleyball"));
		};
		System.out.println("Supplier : " + studentSupplier.get());

		Supplier<List<Student>> studentsListSupplier = () -> StudentDataBase.getAllStudents();
		System.out.println("Student List : " + studentsListSupplier.get());
	}

}
