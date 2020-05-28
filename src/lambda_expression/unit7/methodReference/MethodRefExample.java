package lambda_expression.unit7.methodReference;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import data.Student;
import data.StudentDataBase;

public class MethodRefExample {

	static Function<String, String> toUpperCase= (s) -> s.toUpperCase();
	
	static Function<String, String> toUpperCaseMethodRef= String::toUpperCase;
	
	static Consumer<Student> student= System.out::println;
	
	static Consumer<Student> studentActivities = Student::printListOfActivities;
	
	static Predicate<Student> studentPredicate= (s) -> s.getGradeLevel() == 3;
	
	static Predicate<Student> studentPredicateRefactoredToMethodRef= MethodRefExample::greaterThanGradeLevel; ;
	
	public static boolean greaterThanGradeLevel(Student s) {
		return s.getGradeLevel() == 3;
	}
	
	public static void main(String[] args) {
		// ClassName::instace-methodName
		// ClassName::static methodName
		// instance :: methodName
		System.out.println(toUpperCase.apply("java8"));
		System.out.println(toUpperCaseMethodRef.apply("java8"));
		
		StudentDataBase.getAllStudents().forEach(student);
		StudentDataBase.getAllStudents().forEach(studentActivities);
		
		System.out.println(studentPredicate.test(StudentDataBase.studentSupplier.get()));
		System.out.println(studentPredicateRefactoredToMethodRef.test(StudentDataBase.studentSupplier.get()));
	}

}
