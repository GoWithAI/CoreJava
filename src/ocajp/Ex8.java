package ocajp;

public interface Ex8 {

	String type = "A";
	
	void fly();
	
	default String getType() {
		return type;
	}
	
}
