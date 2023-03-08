package interviewQuestions.inheritance;

class Super{
	protected void method() {
		System.out.println("Sup");
	}
}


public class ParentMemberMethodVisibilityInChild extends Super{
	//1. Cannot reduce the visibility of the inherited method from Super - ex. here default, private
	//void method() {}
	
	//2. Corrected override
	public final void method() {}
	
	//3. 
	private void method(int i) {}

}
