package java8.terminalOperation;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
	private String name;
	private String department;
	private int salary;

	public Employee(String name, String department, int salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public int getSalary() {
		return salary;
	}

	public Employee merge(Employee other) {
		if (!name.equals(other.name)) {
			throw new IllegalArgumentException("Cannot merge different employees: " + name + ", " + other.name);
		}
		if (!department.equals(other.department)) {
			throw new IllegalArgumentException("Cannot merge employees from different departments: " + name);
		}
		return new Employee(name, department, salary + other.salary);
	}

	@Override
	public String toString() {
		return "Employee{" + "name='" + name + '\'' + ", department='" + department + '\'' + ", salary=" + salary + '}';
	}
}