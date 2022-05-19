package design.SOLID.DI.solutionB;

public class ElectricPowerSwitch implements Switch{
	public Switchable switchable;

	public boolean on;

	public ElectricPowerSwitch(Switchable switchable) {
		System.out.println("ElectricPowerSwitch");
		System.out.println();
		this.switchable = switchable;
		this.on = false;
	}

	public boolean isOn() {
		return this.on;
	}

	public void press() {
		boolean checkOn = isOn();

		// some business about remote switch
		if (checkOn) {
			switchable.turnOff();
			this.on = false;
		} else {
			switchable.turnOn();
			this.on = true;
		}

	}

	// Client Calling externally
	public static void main(String[] args) {
		ElectricPowerSwitch light = new ElectricPowerSwitch(new LightBulb());
		light.press();
		light.press();

		ElectricPowerSwitch fan = new ElectricPowerSwitch(new Fan());
		fan.press();
		fan.press();

	}
}