package streamInterviewQA.numeric;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import data.Student;
import data.StudentDataBase;

public class StreamReduceExample {

	public static int performMultiplication(List<Integer> integerList) {
		
	return 	integerList.stream()
			//1
			//3
			//5
			//7
			// a=1, b=1(b from stream) => result 1 is returned
			// a=1, b=3(b from stream) => result 3 is returned
			// a=3, b=5(b from stream) => result 15 is returned in a
			// a=15, b=7(b from stream) => result 105 is returned from .reduce(...);
			.reduce(2, (a,b) -> a*b);
	
	}
	
	public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList) {
		
		return 	integerList.stream()
				//1
				//3
				//5
				//7
				// a=1, b=1(b from stream) => result 1 is returned
				// a=1, b=3(b from stream) => result 3 is returned
				// a=3, b=5(b from stream) => result 15 is returned in a
				// a=15, b=7(b from stream) => result 105 is returned from .reduce(...);
				.reduce((a,b)-> a*b);
		
		}
	
	public static Optional<Student> getHighestGPAStudent(){
		/*return StudentDataBase.getAllStudents().stream().reduce((s1,s2) ->{
			//students one by one
		if(s1.getGpa() > s2.getGpa()) {
			return s1;
		}else {
			return s2;
		}
		});*/
		
		return StudentDataBase.getAllStudents().stream().reduce((s1,s2) -> (s1.getGpa() > s2.getGpa()) ? s1:s2);
	}
	
	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1,3,5,7);
		
		System.out.println("performMultiplication :"+performMultiplication(integers));
		
		Optional<Integer> performMultiplicationWithoutIdentity = performMultiplicationWithoutIdentity(integers);
		
		if(performMultiplicationWithoutIdentity.isPresent()) {
			System.out.println(performMultiplicationWithoutIdentity.get());	
		}
		
		
		Optional<Student> highestGPAStudent = getHighestGPAStudent();
		if(highestGPAStudent.isPresent()) {
			System.out.println(highestGPAStudent.get());
		}
		
		
	}

}
