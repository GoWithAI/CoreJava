package corejava.design.principles.dependencyinversion.solutionb;

public class OperateSwitch {
	 Switch light;

	public OperateSwitch(Switch light) {
		this.light = light;
	}

	public Switch getLight() {
		return light;
	}
}
