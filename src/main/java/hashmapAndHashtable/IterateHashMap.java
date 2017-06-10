package hashmapAndHashtable;

import java.util.HashMap;
import java.util.Map;

public class IterateHashMap {

	// Java 7
	public static void interfaceWay(Map<String, String> map) {
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
	}

	// Java 8
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

	}

}
