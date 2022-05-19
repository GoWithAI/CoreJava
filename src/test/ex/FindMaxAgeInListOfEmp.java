package test.ex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMaxAgeInListOfEmp {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		list.add(new Employee(1, "Deep", 11));
		list.add(new Employee(14, "Dipa", 20));
		list.add(new Employee(20, "Ramu", 30));

		Optional<Employee> max = maxAgeEmployee(list);

		Employee employee;
		if (max.isPresent()) {
			employee = max.get();
		}

	}

	private static Optional<Employee> maxAgeEmployee(List<Employee> list) {
		return list.stream().max(Comparator.comparing(Employee::getAge));
	}

}
