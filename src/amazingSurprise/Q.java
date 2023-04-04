package amazingSurprise;

public class Q {
	public int count = 1;

	public synchronized void m1(String name) {
		
		System.out.println(name + "  == " + count);
		count++;
	}
}
