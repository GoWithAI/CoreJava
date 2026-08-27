package corejava.language.objects;

public class GarbageCollectionDemo {

	public static void main(String[] args) {
		GarbageCollectionDemo t1 = new GarbageCollectionDemo();
		GarbageCollectionDemo t2 = m1(t1);
		GarbageCollectionDemo t3 = new GarbageCollectionDemo();
		t2 = t3;
	}

	static GarbageCollectionDemo m1(GarbageCollectionDemo temp) {
		temp = new GarbageCollectionDemo();
		return temp;
	}

}
