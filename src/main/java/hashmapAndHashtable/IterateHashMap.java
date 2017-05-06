package hashmapAndHashtable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashMap {

	public static void interfaceWay(Map<String, String> map) {
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}

	}

	public static void lambdaWay(Map<String, String> map) {
		map.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));
	}

	public static void main(String s[]) {
		Map<String, String> map = new HashMap<>();
		map.put("1", "John");
		map.put("2", "Adam");

		lambdaWay(map);
		System.out.println();
		interfaceWay(map);
		System.out.println();
		printMap(map);
	}

	@SuppressWarnings("unchecked")
	public static void printMap(Map<String, String> map) {
		Iterator<?> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> pair = (Map.Entry<String, String>) it.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
			it.remove(); // avoids a ConcurrentModificationException
		}
	}

}
