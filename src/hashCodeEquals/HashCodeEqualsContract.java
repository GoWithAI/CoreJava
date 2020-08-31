package hashCodeEquals;

/**
 *  if we override the equals() method, we also have to override hashCode().
 * 
 * **/

/***
 * doesn't consider only object identity but also the value of the
 * amount,currencyCode properties:
 **/

/**
 ***equals() Contract***
 * equals() method must fulfill below Criteria
 * 
 * 1. reflexive: an object must equal itself
 * 2. symmetric: x.equals(y) must return the same result as y.equals(x)
 * 3. transitive: if x.equals(y) and y.equals(z) then also x.equals(z)
 * 4. consistent: the value of equals() should change only if a property that is contained in equals() changes (no randomness allowed)
 * 5. For any non-null reference value x, x.equals(null) should return false.
 * */

public class HashCodeEqualsContract {

	public static void main(String[] args) {
		Money income = new Money(55, "USD");
		Money expenses = new Money(55, "USD");
		// Equals Method only Consider Object(income/expenses) identity
		// Object.java class equals methods compare object -> return (this == obj);
		boolean balanced = income.equals(expenses);
		System.out.println("income : " + income);
		System.out.println("expenses : " + expenses);
		System.out.println("with Default Equals Method :" + balanced);

		System.out.println("***************Overriden Equals Case********************");
		Money2 income2 = new Money2(55, "USD");
		Money2 expenses2 = new Money2(55, "USD");
		// Equals Method only Consider Object(income/expenses) identity
		// Object.java class equals methods compare object -> return (this == obj);
		boolean balanced2 = income2.equals(expenses2);
		System.out.println("income : " + income2);
		System.out.println("expenses : " + expenses2);
		System.out.println("with Default Equals Method :" + balanced2);

		// **********Violating equals() Symmetry With Inheritance*********
		System.out.println("*************Violating equals() Symmetry With Inheritance***********");
		Money2 cash = new Money2(42, "USD");
		WrongVoucher voucher = new WrongVoucher(42, "USD", "Amazon");
		System.out.println("Correct Result :" + voucher.equals(cash));
		System.out.println("Wrong Result :" + cash.equals(voucher));

		//***********Fixing equals() Symmetry With Composition*************
		System.out.println("*************Violating equals() Symmetry With Inheritance***********");
		Money2 cash2 = new Money2(42, "USD");
		Voucher voucher2 = new Voucher(42, "USD", "Amazon");
		System.out.println("Correct Result :" + voucher2.equals(cash2));
		System.out.println("Correct Result :" + cash2.equals(voucher2));
		
	}

}
