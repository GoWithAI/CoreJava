package hashCodeEquals;

class Team {

	String city;
	String department;

	public Team(String city, String department) {
		this.city = city;
		this.department = department;
	}

	@Override
	public final boolean equals(Object obj) {
		if (obj == this) // same object is passed
			return true;

		if (!(obj instanceof Object))
			return false;

		Team otherObj = (Team) obj;

		boolean isCurrenyCodeEqual = (this.city == null && otherObj.city == null) || (this.city.equals(otherObj.city));

		boolean isDepartmentEqual = (this.department == null && otherObj.department == null)
				|| (this.department.equals(otherObj.department));

		return isCurrenyCodeEqual && isDepartmentEqual;
	}
}