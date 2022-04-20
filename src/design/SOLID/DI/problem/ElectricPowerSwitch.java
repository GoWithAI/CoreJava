package design.SOLID.DI.problem;

/**
 * DI The principle states:
 * 
 * “A. High-level modules should not depend on low-level modules. Both should
 * depend on abstractions. B. Abstractions should not depend on details. Details
 * should depend on abstractions.”
 */

public class ElectricPowerSwitch {
	public LightBulb lightBulb;
	public Fan fan; // added for fan
	public TV tv;
	public boolean on;

	public ElectricPowerSwitch(LightBulb lightBulb) {
		this.lightBulb = lightBulb;
		this.on = false;
	}

	public ElectricPowerSwitch(Fan fan) {
		this.fan = fan;
		this.on = false;
	}

	public ElectricPowerSwitch(TV tv) {
		this.tv = tv;
		this.on = false;
	}

	public boolean isOn() {
		return this.on;
	}

	// fragile code
	public void press() {
		boolean checkOn = isOn();

		// or SWITCH
		if (fan != null) {
			if (checkOn) {
				fan.turnOff();
				this.on = false;
			} else {
				fan.turnOn();
				this.on = true;
			}
		} else if (lightBulb != null) {
			if (checkOn) {
				lightBulb.turnOff();
				this.on = false;
			} else {
				lightBulb.turnOn();
				this.on = true;
			}
		} else if (tv != null) {
			if (checkOn) {
				tv.turnOff();
				this.on = false;
			} else {
				tv.turnOn();
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
		fan.press();
		fan.press();

		ElectricPowerSwitch tv = new ElectricPowerSwitch(new TV());
		tv.press();
		tv.press();

	}
}