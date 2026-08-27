package corejava.design.principles.dependencyinversion.solutionb;

//abstraction
// abstraction does not depend on Details
public interface Switchable {
	public void turnOn();
	public void turnOff();
}
