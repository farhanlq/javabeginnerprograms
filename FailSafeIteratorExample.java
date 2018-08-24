package beginnersprogram;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeIteratorExample {

	public static void main(String[] args) {
		// FailSafeIterator 
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("four", 4);
		map.put("five", 5);
		Iterator<String> itr = map.keySet().iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			System.out.println(key + " : " + map.get(key));
			map.put("six", 6);
		}
		
	}

}
