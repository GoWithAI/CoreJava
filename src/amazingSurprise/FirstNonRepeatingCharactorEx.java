package amazingSurprise;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.IntStream;

public class FirstNonRepeatingCharactorEx {

	public static void main(String[] args) {
		String input = "Helo World";

		HashMap<Integer, String> divisorMap = new HashMap<Integer, String>(){
	            {
	            put(3, "Fizz");
	            put(5, "Buzz");
	            }
	        };
		
	        for(Map.Entry<Integer, String> e: divisorMap.entrySet()) {
	        	Integer key = e.getKey();
	        }
	        
	        int firstUniqChar = firstUniqChar("leetcode");
	        System.out.println("firstUniqChar :" + firstUniqChar);
		java8repetingChar(input);
		javaRepetingChar(input);
	}

	private static void javaRepetingChar(String input) {
		int[] charFrequencies = new int[256];

		for (char c : input.toCharArray()) {
			charFrequencies[c]++;
			if (charFrequencies[c] == 2) {
				System.out.println("Repeating first charactor :" + c);
				break;
			}
		}

	}

	private static void java8repetingChar(String input) {
		Set<Character> seen = new LinkedHashSet<>();
		Optional<Character> findFirst = IntStream.range(0, input.length()).mapToObj(input::charAt)
				.filter(c -> !seen.add(c)).findFirst();
		System.out.println(findFirst.get().charValue());
	}
	
	public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int strLength = s.length();

        for(int i = 0; i < strLength; i++){
            char c = s.charAt(i);
            int value = map.get(c) == null ? 0 : map.get(c);
            map.put(c, value + 1);
        }
        System.out.println(map);
        for(int i = 0 ; i < strLength; i++){
            if(map.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
}

}
