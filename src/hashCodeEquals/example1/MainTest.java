package hashCodeEquals.example1;

import hashCodeEquals.Money2;

public class MainTest {

	public static void main(String[] args) {
		Money3 income2 = new Money3(55, "USD");
		Money3 expenses2 = new Money3(55, "USD2");
		// Equals Method only Consider Object(income/expenses) identity
		// Object.java class equals methods compare object -> return (this == obj);
		boolean isObjectContainEqualValue = income2.equals(expenses2);
		System.out.println("income : " + income2);
		System.out.println("expenses : " + expenses2);
		System.out.println("with Default Equals Method :" + isObjectContainEqualValue);
	}

}
