package streamInterviewQA;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;


/**
 * Interview Questions : Group by Gender and show only highest GPA in each Group only
 * 
 * */

public class GroupByAndFindMaxValueObjectInGroup {

	public static void main(String[] args) {

		Map<String, Optional<Student>> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGender,Collectors.maxBy(Comparator.comparingDouble(Student::getGpa))));

		System.out.println(studentMap);
	}

}
