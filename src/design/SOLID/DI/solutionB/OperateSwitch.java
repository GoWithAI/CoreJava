package design.SOLID.DI.solutionB;

public class OperateSwitch {
	 Switch light;

	public OperateSwitch(Switch light) {
		this.light = light;
	}

	public Switch getLight() {
		return light;
	}
}
