package streamInterviewQA;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lambda_expression.optional.Student;
import lambda_expression.optional.StudentDataBase;

public class SortByMultipleParameter {

	static Comparator<Student> comparatorGpa = (s1, s2) -> {

		if (s1.getGpa() > s2.getGpa())
			return 1;
		else if (s1.getGpa() < s1.getGpa())
			return -1;
		else
			return s1.getName().compareTo(s2.getName());

	};

//static Comparator<Student> comparatorGpa2 = (s1, s2) -> Comparator<T>

	public static void main(String[] args) {

		List<Student> allStudents = StudentDataBase.getAllStudents();

		List<Student> collect = allStudents.stream().sorted(comparatorGpa).collect(Collectors.toList());

		System.out.println(collect);
	}

}
