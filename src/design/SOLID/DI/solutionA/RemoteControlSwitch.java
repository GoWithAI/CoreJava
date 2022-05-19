package design.SOLID.DI.solutionA;


// Each new type of Switch we need Introduce/create new Class
public class RemoteControlSwitch {
	public Switchable switchable;
	public boolean on;
	
	public RemoteControlSwitch(Switchable switchable) {
		this.switchable = switchable;
		this.on = false;
	}
	
	public boolean isOn() {
		return this.on;
	}

	public void press() {
		boolean checkOn = isOn();
			//some business about remote switch
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
		RemoteControlSwitch light = new RemoteControlSwitch(new LightBulb());
		light.press();
		light.press();

		RemoteControlSwitch fan = new RemoteControlSwitch(new Fan());
		fan.press();
		fan.press();

	}
}
