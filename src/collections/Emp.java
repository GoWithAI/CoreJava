package collections;

public class Emp {

	private String fname;
	private String lname;

	public Emp(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public boolean equals(Object obj) {
		Emp emp = (Emp) obj;
		return this.fname.equals(emp.getFname()) ;//&& this.lname.equals(emp.getLname());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fname.hashCode();
		//result = prime * result + ((lname == null) ? 0 : lname.hashCode());
		System.out.println("hashCode :" + result);
		return result;
	}
}
