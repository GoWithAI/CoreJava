package corejava.functional.builtins.function;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import corejava.shared.sampledata.Student;
import corejava.shared.sampledata.StudentDataBase;
import corejava.functional.builtins.predicate.PredicateStudentEx;

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
