package corejava.io.serialization;

import java.io.Serializable;

class House implements Serializable {

	public House(int number) {
		super();
		this.number = number;
	}

	Wall wall;
	int number;
}