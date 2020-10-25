package defaultStaticMethodJava8.defaults;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import data.Student;
import data.StudentDataBase;

public class DefaultMethodEx2 {

	static Consumer<Student> printStudent = s -> System.out.println(s);
	static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
	static Comparator<Student> gpaComparator = Comparator.comparing(Student::getGpa);

	public static void sortByName(List<Student> studentList) {
		studentList.sort(nameComparator); // first check for any overridden default method
		studentList.forEach(printStudent);
	}

	public static void sortByGpa(List<Student> studentList) {
		studentList.sort(gpaComparator); // first check for any overridden default method
		studentList.forEach(printStudent);
	}

	public static void comparatorChaining(List<Student> studentList) {
		studentList.sort(nameComparator.thenComparing(gpaComparator));
		// studentList.sort(gpaComparator.thenComparing(nameComparator));
		studentList.forEach(printStudent);
	}

	public static void sortWithNullValue(List<Student> studentList) {
		Comparator<Student> nullsFirst = Comparator.nullsFirst(nameComparator);
		studentList.sort(nullsFirst);
		studentList.forEach(printStudent);
	}

	public static void main(String[] args) {

		List<Student> allStudents = StudentDataBase.getAllStudents();
		//sortByName(allStudents);
		System.out.println("****************************");
		//sortByGpa(allStudents);
		System.out.println("*************Comparator Chaining***************");
		//comparatorChaining(allStudents);
		
		sortWithNullValue(allStudents);
	}

}
