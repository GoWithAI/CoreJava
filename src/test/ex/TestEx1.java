package test.ex;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class TestEx1 {

	public static void main(String[] args) {
	
		List<Student> allStudents = StudentDataBase.getAllStudents();
		
		// uppercase
		Function<Student, String> upperCase= s -> {
			
			String upperCase2 = s.getName().toUpperCase();
			return upperCase2;
		};
		
		// start char x
		Predicate<Student> predicate = s -> s.getName().subSequence(0, 1).equals("J"); 
		// sorted
		
		
		//allStudents.stream().filter(predicate).map(upperCase).collect(Collectors.)
		
	}

}
