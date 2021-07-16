package designPrinciple.openClose;

class Car {
	private int year;
	private Engine engine;

	public Car(int newYear, Engine myEngine) {
		year = newYear;
		engine = myEngine;
	}

	public Car(Car otherCar) {
		year = otherCar.year;
		// engine = otherCar.engine; // ideally 1 cars will not share same engine
		// engine = new Engine(otherCar.engine); // Engine of type turbo or only engine
		// not sure

		// Violation of OCP
		if (otherCar.engine instanceof TurboEngine)
			engine = new TurboEngine((TurboEngine)otherCar.engine);
		else {
			if(otherCar.engine instanceof PistolEngine)
				engine = new PistolEngine((PistolEngine)otherCar.engine);
			else
				engine = new Engine(otherCar.engine);	
		}
			

	}

	@Override
	public String toString() {
		return "Car : " + year + " " + engine.toString();
	}
}