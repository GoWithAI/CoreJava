package lambda_expression.function.unit6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import data.Student;
import data.StudentDataBase;
import lambda_expression.predicate.unit6.PredicateStudentEx;

public class BiFunctionEx {

	static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> studentNameAndGpaMap= (students, studentPredicate)->{
		
		Map<String, Double> nameGpaMap=new HashMap<>();
		
		students.forEach(student ->{
			if(studentPredicate.test(student)) {
				nameGpaMap.put(student.getName(), student.getGpa());
			}
		});
		
		return nameGpaMap;
	};
	
	public static void main(String[] args) {

		Map<String, Double> result = studentNameAndGpaMap.apply(StudentDataBase.getAllStudents(), PredicateStudentEx.gradeLevelPredicate);
		System.out.println(result);
	}

}
