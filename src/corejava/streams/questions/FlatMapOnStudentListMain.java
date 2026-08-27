package corejava.streams.questions;

import java.util.List;
import java.util.stream.Collectors;

import corejava.shared.sampledata.Student;
import corejava.shared.sampledata.StudentDataBase;

/*
 * User Case : I want all students Unique Activities list
 * 
 * */
public class FlatMapOnStudentListMain {

	public static void main(String[] args) {

		List<Student> allStudents = StudentDataBase.getAllStudents();

		List<String> collect = allStudents.stream().map(s -> s.getActivities()).flatMap(x -> x.stream()).distinct()
				.collect(Collectors.toList());
		System.out.println(collect);
	}

}
