package corejava.functional.builtins.function;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

import corejava.shared.sampledata.Student;
import corejava.shared.sampledata.StudentDataBase;
import corejava.functional.builtins.predicate.PredicateStudentEx;

public class FunctionStudentEx {

	static Function<List<Student>, Map<String, Double>> studentAndGPAMapfunction = (students) -> {

		Map<String, Double> nameGpaMap = new HashMap<>();

		students.forEach(s -> {
			if (s.getGpa() >= 3.9 && PredicateStudentEx.gradeLevelPredicate.test(s)) {
				nameGpaMap.put(s.getName(), s.getGpa());
			}
		});
		return nameGpaMap;
	};

	public static void main(String[] args) {
		
		System.out.println(studentAndGPAMapfunction.apply(StudentDataBase.getAllStudents()));
 
	}

}
