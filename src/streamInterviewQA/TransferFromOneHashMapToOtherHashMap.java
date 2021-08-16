package streamInterviewQA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

import test.ex.Employee;

public class TransferFromOneHashMapToOtherHashMap {

	public static void main(String[] args) {

		Map<String, List<Employee>> companyEmployee = new HashMap<String, List<Employee>>();

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "Deepak"));
		empList.add(new Employee(2, "praveen"));

		companyEmployee.put("nice", empList);

		List<Employee> empList2 = new ArrayList<Employee>();
		empList2.add(new Employee(1, "paven"));
		empList2.add(new Employee(2, "ram"));

		companyEmployee.put("xyz", empList2);

		extracted(companyEmployee);
		extracted2(companyEmployee);

	}

	private static void extracted2(Map<String, List<Employee>> companyEmployee) {
		
		Function<Map.Entry<String, List<Employee>>, String> keyMapper = Map.Entry<String, List<Employee>>::getKey;
		Function<Map.Entry<String, List<Employee>>, List<Integer>> valueMapper = (l) ->{
			List<Employee> value = l.getValue();
			return value.stream().map(Employee::getId).collect(Collectors.toList());
		};
		
		Map<String, List<Integer>> mapValues = companyEmployee.entrySet().stream().collect(Collectors.toMap(keyMapper, valueMapper));
		System.out.println(mapValues);
		
	}

	private static void extracted(Map<String, List<Employee>> companyEmployee) {
		Map<String, List<Integer>> companyToEmployeeIdMap = new HashMap<>();

		for (Entry<String, List<Employee>> entry : companyEmployee.entrySet()) {
			String key = entry.getKey();
			List<Employee> value = entry.getValue();

			List<Integer> listOfEmpIds = value.stream().map(Employee::getId).collect(Collectors.toList());
			companyToEmployeeIdMap.put(key, listOfEmpIds);
		}

		for (Entry<String, List<Integer>> entry : companyToEmployeeIdMap.entrySet()) {
			String companyName = entry.getKey();
			List<Integer> empIds = entry.getValue();
			System.out.println("key :" + companyName + " value :" + empIds);
		}
	}

}
