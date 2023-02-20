package java8.terminalOperation;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToMapMergerFunction {

	// Function.identity() as the valueMapper argument, which keeps the employee
	// object as the value in the map.

	public static void main(String[] args) {
		mergerFinction1();
		mergerFunction2();
		
		// HashMap<String, Employee> collect =
		// stream.collect(Collectors.toMap(Employee::getDepartment, Function.identity(),
		// Employee::merge, HashMap::new));
		System.out.println();

	
	}

	private static void mergerFunction2() {
		Map<String, Employee> employeesByNameAndDepartment2 = Stream.of(
		        new Employee("Alice", "Engineering", 10000),
		        new Employee("Bob", "Sales", 20000),
		        new Employee("Alice", "Engineering", 15000)
		).collect(Collectors.toMap(
		        e -> e.getName() + "|" + e.getDepartment(),
		        Function.identity(),
		        (e1, e2) -> new Employee(e1.getName(), e1.getDepartment(), e1.getSalary() + e2.getSalary()) // Key combination is same then it will be cosidered 
		));

		System.out.println(employeesByNameAndDepartment2);
	}

	private static void mergerFinction1() {
		Stream<Employee> stream = Stream.of(new Employee("Alice", "Engineering", 50000),
				new Employee("Bob", "Engineering", 60000), new Employee("Charlie", "Sales", 70000),
				new Employee("Alice", "Sales", 75000), new Employee("Bob", "Sales", 80000),
				new Employee("Charlie", "Engineering", 90000), new Employee("Alice", "Sales", 75000));

		Map<String, Employee> employeesByNameAndDepartment = stream
				.collect(Collectors.toMap(e -> e.getName() + "|" + e.getDepartment(), // keyMapper - map each employee
																						// to a unique key based on name
																						// and department
						Function.identity(), // valueMapper - keep the employee object as the value
						(e1, e2) -> new Employee(e1.getName(), e1.getDepartment(), e1.getSalary() + e2.getSalary()), // mergeFunction - merge employees with the same name and department
						HashMap::new // mapSupplier - create a new HashMap
				));

		employeesByNameAndDepartment.forEach((k, v) -> {
			System.out.println(k + "     " + v);
		});
	}
}
