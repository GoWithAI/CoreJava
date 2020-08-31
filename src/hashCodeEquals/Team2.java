package hashCodeEquals;

class Team2 {

	String city;
	String department;

	public Team2(String city, String department) {
		this.city = city;
		this.department = department;
	}

	@Override
	public final boolean equals(Object obj) {
		if (obj == this) // same object is passed
			return true;

		if (!(obj instanceof Object))
			return false;

		Team2 otherObj = (Team2) obj;

		boolean isCurrenyCodeEqual = (this.city == null && otherObj.city == null) || (this.city.equals(otherObj.city));

		boolean isDepartmentEqual = (this.department == null && otherObj.department == null)
				|| (this.department.equals(otherObj.department));

		return isCurrenyCodeEqual && isDepartmentEqual;
	}

	@Override
	public int hashCode() {
		int result = 17;
		if (city != null) {
			result = 31 * result + city.hashCode();
		}
		if (department != null) {
			result = 31 * result + department.hashCode();
		}
		return result;
	}
}