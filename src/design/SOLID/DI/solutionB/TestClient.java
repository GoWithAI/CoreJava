package design.SOLID.DI.solutionB;

public class TestClient {

	Switch switch2;

	public TestClient() {

	}

	public TestClient(Switch electricPowerSwitch) {
		switch2 = electricPowerSwitch;
	}

	public void genericSwitch() {
		switch2.press();
		switch2.press();
	}

	public void genericSwitchOperation(Switch switch2) {
		switch2.press();
		switch2.press();
	}

	public static void main(String[] args) {

		// firstClientCall();
		// secondClientCall();
		thirdClientCall();

	}

	private static void thirdClientCall() {

		TestClient t = new TestClient(new RemoteControlSwitch(new Fan()));
		t.genericSwitch();

	}

	private void secondClientCall() {

		TestClient t = new TestClient();

		// Switch abstraction
		switch2 = new ElectricPowerSwitch(new LightBulb());
		genericSwitchOperation(switch2);

		switch2 = new ElectricPowerSwitch(new Fan());
		genericSwitchOperation(switch2);

		// Test for ElectricPowerSwitch
		switch2 = new RemoteControlSwitch(new LightBulb());
		genericSwitchOperation(switch2);

		switch2 = new RemoteControlSwitch(new Fan());
		genericSwitchOperation(switch2);

	}

	// Bad code - high level should depend on abstraction
	private static void firstClientCall() {
		// Test for ElectricPowerSwitch
		ElectricPowerSwitch light = new ElectricPowerSwitch(new LightBulb());
		light.press();
		light.press();

		ElectricPowerSwitch fan = new ElectricPowerSwitch(new Fan());
		fan.press();
		fan.press();

		// Test for ElectricPowerSwitch
		RemoteControlSwitch light2 = new RemoteControlSwitch(new LightBulb());
		light2.press();
		light2.press();

		RemoteControlSwitch fan2 = new RemoteControlSwitch(new Fan());
		fan2.press();
		fan2.press();

	}

}
