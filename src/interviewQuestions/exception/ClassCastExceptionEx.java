package interviewQuestions.exception;

public class ClassCastExceptionEx {

	public static void main(String[] args) {
		Integer intVal = Integer.valueOf(42);
		//Cannot cast from Integer to String
		// attempted to cast and object to subclass( which not instance)
		//String s = (String)intVal;
	}

}
