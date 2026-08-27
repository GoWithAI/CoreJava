package corejava.streams.intermediate;

import java.util.function.BinaryOperator;

import corejava.shared.sampledata.Student;
import corejava.shared.sampledata.StudentDataBase;

public class StreamMapReduceExample {

	private static BinaryOperator<Integer> accumulator = (a, b) -> a + b;
	private static BinaryOperator<Integer> accumulator2 = Integer::sum;

	private static int noOfNoteBooks() {
		
		Integer reducedValue = StudentDataBase.getAllStudents().stream()
		.filter(student -> student.getGradeLevel() >=3)
		.filter(student -> student.getGender().equals("female"))
		.map(Student::getNoteBooks)
		//.reduce(0, accumulator);
		.reduce(0, accumulator2);
		return reducedValue;
	}

	// Find Total Number of book of students
	public static void main(String[] args) {
		System.out.println(noOfNoteBooks());
	}

}
