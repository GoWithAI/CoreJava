package cache;

import java.util.HashMap;
import java.util.Map;

//Immutable
public class ApplicationCache<K, V> {

	private Map<K, V> map = new HashMap<K, V>();//key can be locked

	public void add(K k, V v) {
		
		
		synchronized (map) {
			map.put(k, v);	
		}
		
				
	}

	public void delete(K k) {
		map.remove(k);
	}

	public V get(K k) {
		return map.get(k);
	}
	
	public static void main(String[] args) {
		try {
			ApplicationCache<String, Integer> int1= new ApplicationCache<String, Integer>();	
		}catch (Error e) {

		}
		
		
		
	}
}
