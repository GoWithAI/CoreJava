package ocajp.encapsulation;

import ocajp.Inheritance.Sub;

public class MainApp {

	public static void main(String[] args) {

		Data data = new Data();
		data.setValue(-1);
		System.out.println(data.getValue());

		// String hash code will be same since string stored in String pool
		EncapsulationBreak s = new EncapsulationBreak();
		s.setData("Deepak");
		System.out.println(s.getData().hashCode());
		EncapsulationBreak s2 = new EncapsulationBreak();
		s2.setData("Deepak");
		System.out.println(s2.getData().hashCode());

		Sub sub = new Sub();
		// sub.print(sub.text); //outside of package protected can't be access
	}

}
