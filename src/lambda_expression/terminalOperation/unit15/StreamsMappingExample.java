package lambda_expression.terminalOperation.unit15;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Collectors.mapping;

import data.Student;
import data.StudentDataBase;

//Avoid additional map intermediate operation
public class StreamsMappingExample {

	public static void main(String[] args) {

		List<String> nameList = StudentDataBase.getAllStudents()
		.stream()
		.collect(Collectors.mapping(Student::getName, Collectors.toList()));
		
		System.out.println(nameList);
		
		Set<String> nameSet = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.mapping(Student::getName, Collectors.toSet()));
				
		System.out.println(" set :" + nameSet);
				
		//map :{female=[Emily, Jenny, Sophia], male=[Adam, Jbmes, James, Dave]}
		Map<String, Set<String>> studentGroupByGender = StudentDataBase.getAllStudents()
				.stream()
				.collect(groupingBy(Student::getGender,mapping(Student::getName, toSet())));

				
		System.out.println(" map :"+studentGroupByGender);
	}

}
