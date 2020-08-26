package passByObjectRef;

public class PassByRef {

	public static void main(String[] args) {
		Emp e = new Emp();
		e.setName("Deepak");

		PassByRef pr=new PassByRef();
		
		pr.setNameInObjectRef(e);
		System.out.println(e.getName());
	}
	
	public void setNameInObjectRef(Emp e) {
		e.setName("Deep");
		setNameInObjectRef2(e);
	}
	
	public void setNameInObjectRef2(Emp e) {
		e.setName("Deep2");
	}

}
