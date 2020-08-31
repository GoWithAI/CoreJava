package hashCodeEquals;

/**
 * Inheritance :
 * 
 * 
 * **/

public class WrongVoucher extends Money2 {

	private String store;

	public WrongVoucher(int amount, String currencyCode) {
		super(amount, currencyCode);
	}

	public WrongVoucher(int amount, String currencyCode, String store) {
		super(amount, currencyCode);
		this.store = store;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null)
			return true;

		if (!(obj instanceof WrongVoucher))
			return false;

		WrongVoucher wrongVoucher = (WrongVoucher) obj;

		boolean isCurrencyCodeEqual = (this.currencyCode == null && wrongVoucher.currencyCode == null)
				|| (this.currencyCode != null && this.currencyCode.equals(wrongVoucher.currencyCode));

		boolean isStoreEqual = (this.store == null && wrongVoucher.store == null)
				|| (this.store != null && this.store.equals(wrongVoucher.store));

		return this.amount == wrongVoucher.amount && isCurrencyCodeEqual && isStoreEqual;
	}

}
