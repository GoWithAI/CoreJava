package corejava.design.principles.openclosed;

public class TurboEngine extends Engine {

	public TurboEngine() {
	}
	
	public TurboEngine(Engine other) {
		super(other);
	}
	
}
