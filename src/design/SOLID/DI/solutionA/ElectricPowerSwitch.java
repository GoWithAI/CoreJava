package design.SOLID.DI.solutionA;

/**
 * DI The principle states:
 * 
 * “A. High-level modules should not depend on low-level modules. Both should
 * depend on abstractions. B. Abstractions should not depend on details. Details
 * should depend on abstractions.”
 */

// Problem - If you have other switch type - Remote Control Switch ? writing new class, modify existing class

// We Tried dirty to modify existing Class - Very Insulting Crap
public class ElectricPowerSwitch {
	public Switchable switchable;

	//dirty code started
	public boolean electricPowerSwitch = true;
	public boolean isRemoteControl = false;

	public boolean on;

	public ElectricPowerSwitch(Switchable switchable) {
		this.switchable = switchable;
		this.on = false;
	}

	public boolean isOn() {
		return this.on;
	}

	//dirty code started
	public void setRemoteControle() {
		this.isRemoteControl = true;
		this.electricPowerSwitch = false;
	}

	// again fragile clean code
	// bad code keep on going like monster 
	public void press() {
		boolean checkOn = isOn();

		if (electricPowerSwitch) {
			//some business about electric swtich
			if (checkOn) {
				switchable.turnOff();
				this.on = false;
			} else {
				switchable.turnOn();
				this.on = true;
			}
		}

		if (isRemoteControl) {
			//some business about remote switch
			if (checkOn) {
				switchable.turnOff();
				this.on = false;
			} else {
				switchable.turnOn();
				this.on = true;
			}
		}

	}

	// Client Calling externally
	public static void main(String[] args) {
		ElectricPowerSwitch light = new ElectricPowerSwitch(new LightBulb());
		light.press();
		light.press();

		ElectricPowerSwitch fan = new ElectricPowerSwitch(new Fan());
		fan.setRemoteControle();
		fan.press();
		fan.press();

	}
}