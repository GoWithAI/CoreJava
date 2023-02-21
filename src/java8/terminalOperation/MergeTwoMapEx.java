package java8.terminalOperation;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoMapEx {

	public static void main(String[] args) {
		Map<String, Employee2> map1 = new HashMap<>();
		Map<String, Employee2> map2 = new HashMap<>();
		
		Employee2 employee1 = new Employee2(1L, "Deepak");
		map1.put(employee1.getName(), employee1);
		Employee2 employee2 = new Employee2(22L, "DH");
		map1.put(employee2.getName(), employee2);
		Employee2 employee3 = new Employee2(8L, "Joy");
		map1.put(employee3.getName(), employee3);

		Employee2 employee4 = new Employee2(2L, "GEM");
		map2.put(employee4.getName(), employee4);
		Employee2 employee5 = new Employee2(3L, "Deepak");
		map2.put(employee5.getName(), employee5);
		
		System.out.println(map1);
		System.out.println(map2);
		Map<String, Employee2> map3 = new HashMap<>(map1);
		System.out.println(map3);
		
		map2.forEach(( key, value) -> {
			map3.merge(key, value, (v1, v2) -> new Employee2(v1.getId() + v2.getId(), v2.getName() + "-Merge") ); // v1 and v2 are 2 object while merging
		});
		
		System.out.println(map3.get("Deepak").getId() +"   "+ map3.get("Deepak").getName());
		
	}

}
