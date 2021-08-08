package test.ex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Java8Code {

	public static void main(String[] args) {

		 Object[] asList = Arrays.asList(1, 2, 2, 33, 33, 33, 44, 44, 44, 58, 87, 87).toArray();

		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for (int i = 0; i < asList.length; i++) {
			
				String keyMap = String.valueOf(asList[i]);
				
				if(map.containsKey(keyMap)) {
					Integer integer = map.get(keyMap);
					map.put(keyMap, integer + 1);
				}else {
					map.put(keyMap, 1);	
				}
				
			}
		
		findListRepetated(map);

	}

	private static void findListRepetated(Map<String, Integer> map) {

		int oldValue = 2;
		
		for(Entry<String, Integer> mapE: map.entrySet()) {
			
			Integer newValues = mapE.getValue();
			
			if((newValues < oldValue) && newValues < 2) {
				oldValue = newValues;
			}
			
		}
		
		System.out.println(map.get(oldValue));

		
	}

}
