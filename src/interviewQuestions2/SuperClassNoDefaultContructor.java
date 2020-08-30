package interviewQuestions2;

/* CASE :
 * If Super Class have defined parameterized constructor and do not have Default constructor 
 *  Then its mandatory subclass should call superclass Constructor from subclass constructor      
 * */

public class SuperClassNoDefaultContructor extends NoDefaultContructor {

	/**
	 * Mandatory
	 */
	public SuperClassNoDefaultContructor(int i) {
		super(i);
	}

}
