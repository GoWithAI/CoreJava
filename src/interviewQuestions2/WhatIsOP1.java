package interviewQuestions2;

class ABC {
	public int x = 50;
	protected int y = 100;
	int z = 200;

	//public void pay();

}

class XYZ extends ABC {
}

public class WhatIsOP1 {
	public static void main(String[] args) {
		XYZ b = new XYZ();
		System.out.println(b.x);// 50
		System.out.println(b.y);// 100
		System.out.println(b.z);// 200
	}
}