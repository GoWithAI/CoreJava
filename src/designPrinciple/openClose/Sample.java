package designPrinciple.openClose;

public class Sample {

	public static void main(String[] args) {
		//Car car1 = new Car(2019, new Engine()); // 1.was Engine only 
		//Car car1 = new Car(2019, new TurboEngine()); // 2.now Turbo Engine
		Car car1 = new Car(2019, new PistolEngine());
		System.out.println(car1);
		
		Car car2 = new Car(car1);
		System.out.println(car2);
	}

}
