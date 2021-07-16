package designPrinciple.openClose;

public class TurboEngine extends Engine {

	public TurboEngine() {
	}
	
	public TurboEngine(Engine other) {
		super(other);
	}
	
}
