package lambda_expression.unit12;

import java.util.List;
import java.util.Optional;

import data.Student;
import data.StudentDataBase;

/**
 * Stream API Short Circuit Functions
 * 
 * limit(), findFirst(), findAny(), anyMatch(), allMatch(), NoneMatch()
 * 
 * firstBoolean && secondBoolean, if firstBoolean is false then the remaining
 * part of the expression is ignored (the operation is short-circuited) because
 * the remaining evaluation will be redundant. Similarly in firstBoolean ||
 * secondBoolean, if firstBoolean is true the remaining part is short-circuited
 * 
 */
public class StreamMatchExampleAndFindAnyFirst {

	// if any one match condition then return True 
	public static boolean anyMatch(List<Student> studentList) {
		return studentList.stream().anyMatch(s -> s.getGpa() >=4.0);
	}

	public static boolean allMatch(List<Student> studentList) {
		return studentList.stream().allMatch(s -> s.getGpa() >=4.0);
	}

	public static boolean noneMatch(List<Student> studentList) {
		return studentList.stream().noneMatch(s -> s.getGpa() >=4.1);
	}

	//short-circuiting terminal operation.
	//nondeterministic; it is free to select any element in the stream
	public static Optional<Student> findAny(List<Student> studentList) {
		return studentList.stream().filter(s -> s.getGpa() >=3.9).findAny();
	}

	//short-circuiting terminal operation.
	public static  Optional<Student> findFirst(List<Student> studentList) {
		return studentList.stream().filter(s -> s.getGpa() >=3.9).findFirst();
	}

	public static void main(String[] args) {

		List<Student> allStudents = StudentDataBase.getAllStudents();
		
		System.out.println("anyMatch: " + anyMatch(allStudents));
		System.out.println("allMatch: " + allMatch(allStudents));
		System.out.println("noneMatch: " + noneMatch(allStudents));
		
		System.out.println("findAny: " + findAny(allStudents));
		System.out.println("findFirst: " + findFirst(allStudents));
		
		
	}

}
