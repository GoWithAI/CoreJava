package ocajp.composition;

public class Company {

	// Composition
	private MainOffice mainOffice;

	public Company(MainOffice mainOffice) {
		this.mainOffice = mainOffice;
	}

	public String mainAddress() {
		return mainOffice.getAddress();
	}

}
