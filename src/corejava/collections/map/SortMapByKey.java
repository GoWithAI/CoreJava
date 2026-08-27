package corejava.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapByKey {
    static void main() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Mango", 2);
        map.put("Banana", 3);
        map.put("Apple", 1);

        Map<String, Integer> sortedMap = new TreeMap<>(map);

        sortedMap.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
