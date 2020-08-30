package hashCodeEquals;

public class HashCodeEqualsContract {

	public static void main(String[] args) {
		Money income = new Money(55, "USD");
		Money expenses = new Money(55, "USD");
		//Equals Method only Consider Object(income/expenses) identity
		//Object.java class equals methods compare object -> return (this == obj);
		boolean balanced = income.equals(expenses);
		System.out.println("income : " + income);
		System.out.println("expenses : " +expenses);
		
		System.out.println(balanced);


	}

} 
