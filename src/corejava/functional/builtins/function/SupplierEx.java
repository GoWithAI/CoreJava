package corejava.functional.builtins.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import corejava.shared.sampledata.Student;
import corejava.shared.sampledata.StudentDataBase;

public class SupplierEx {

	public static void main(String[] args) {

		Supplier<Student> studentSupplier =  () -> {
			return new Student("Adam", 2, 3.6, "male", 10, Arrays.asList("swimming", "basketball", "volleyball"));
		};
		System.out.println("Supplier : " + studentSupplier.get());

		Supplier<List<Student>> studentsListSupplier = () -> StudentDataBase.getAllStudents();
		System.out.println("Student List : " + studentsListSupplier.get());
	}

}
