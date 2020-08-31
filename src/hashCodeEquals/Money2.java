package hashCodeEquals;

public class Money2 {
	int amount;
	String currencyCode;

	public Money2(int amount, String currencyCode) {
		super();
		this.amount = amount;
		this.currencyCode = currencyCode;
	}

	
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
