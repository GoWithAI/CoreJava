package hashCodeEquals;

public class Money2 {
	int amount;
	String currencyCode;

	public Money2(int amount, String currencyCode) {
		super();
		this.amount = amount;
		this.currencyCode = currencyCode;
	}

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
	@Override
	public boolean equals(Object obj) {
		if (obj == this) // same object is passed
			return true;

		if (!(obj instanceof Money2))
			return false;

		Money2 otherObj = (Money2) obj;

		boolean isCurrenyCodeEqual = (this.currencyCode == null && otherObj.currencyCode == null)
				|| (this.currencyCode.equals(otherObj.currencyCode));

		return this.amount == otherObj.amount && isCurrenyCodeEqual;
	}
}
