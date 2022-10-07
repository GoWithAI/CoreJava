package design.SOLID.Liskov.problem;

import designPrinciple.openClose.Engine;

class TrasportationDevice {
	String name;

	String getName() {
		return "";
	}

	void setName(String n) {
	}

	double speed;

	double getSpeed() {
		return 1.2d;
	}

	void setSpeed(double d) {
	}

	Engine engine;

	Engine getEngine() {
		return null;
	}

	void setEngine(Engine e) {
	}

	void startEngine() {
	}
}