package hashCodeEquals;

/***
 * Composition instead of Inheritance. Voucher class with a Money property
 * 
 */

public class Voucher {

	// Object Composition
	private Money2 money2;

	private String store;

	public Voucher(int amount, String currencyCode, String store) {
		this.money2 = new Money2(amount, currencyCode);
		this.store = store;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null)
			return true;

		if (!(obj instanceof Voucher))
			return false;

		Voucher voucher = (Voucher) obj;

		boolean isMoneyEqual = (this.money2 == null && voucher.money2 == null)
				|| (this.money2 != null && this.money2.equals(voucher.money2));

		boolean isStoreEquals = (this.store == null && voucher.money2 == null)
				|| (this.store != null && this.store.equals(voucher.store));
		return isMoneyEqual && isStoreEquals;
	}
}
