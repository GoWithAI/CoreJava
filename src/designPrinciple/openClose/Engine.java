package designPrinciple.openClose;

public class Engine {

	public Engine() {
	}

	public Engine(Engine engine) {
	}

	@Override
	public String toString() {
		return getClass().toString() + ":" + hashCode();
	}

}
