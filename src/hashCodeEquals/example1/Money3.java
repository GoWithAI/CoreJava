package hashCodeEquals.example1;


public class Money3 {
	private int amount;
	private String currencyCode;

	public Money3(int amount, String currencyCode) {
		super();
		this.amount = amount;
		this.currencyCode = currencyCode;
	}
	
	@Override
	public boolean equals(Object obj) {
		//super.equals(obj);
		boolean isAmountEqual = this.amount == ((Money3) obj).getAmount();
		boolean isCodeEqual = this.currencyCode.equals(((Money3) obj).getCurrencyCode());
		
		return isAmountEqual && isCodeEqual;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
}
