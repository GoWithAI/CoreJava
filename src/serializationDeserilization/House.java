package serializationDeserilization;

import java.io.Serializable;

class House implements Serializable {

	public House(int number) {
		super();
		this.number = number;
	}

	Wall wall;
	int number;
}