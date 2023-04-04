package amazingSurprise;

public interface NestedInterfaceEx {

	int nested();//// only public allowed

	interface Int {// only public allowed
		void nested();
	}
}
