package functionalInterfaces.custom;

import java.util.ArrayList;
import java.util.List;

public class InstantiationOfFunctionalInterfaceEx {

	public static void main(String[] args) {

		Calculator cal = (n1, n2) -> n1 + n2;
		long calculator = cal.calculator(4, 7);
		System.out.println("> " + calculator);

		List<BasicCalulator> bc = new ArrayList<>();
		bc.add(new BasicCalulator(100, 20));
		bc.add(new BasicCalulator(150, 22));
		bc.add(new BasicCalulator(200, 60));
		bc.add(new BasicCalulator(170, 50));

		Calculator multiply = (n1, n2) -> n1 * n2;

		for (BasicCalulator basicCalulator : bc) {
			System.out.println(basicCalulator.proccess(multiply));
		}

		Calculator addCal = Utility::add;
		System.out.println(addCal.calculator(55, 60));

	}

	public void useCutomeFunctionalInterface() {
		CalculatorGeneric<Integer, Integer, String, Integer> customFun = (i, j, k) -> {
			if (k.equals("Deep"))
				return i + j;
			if (k.equals("other"))
				return i;
			return 0;
		};
		
		
		customFun.calculator(10, 20, "Deep");
		
	}

}
