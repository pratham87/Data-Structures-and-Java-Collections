package hashmapAndHashtable.MapSort;

import java.util.*;

/*
 Algorithm:
  
 Map ---> List<Map> ---> Collections.sort() --> List<Map> (Sorted) ---> LinkedHashMap 
 
 */

public class SortByValue {

	private static Map<String, Integer> sortByValue(Map<String, Integer> unsortedMap) {

		// 1. Convert Map to List of Map
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(unsortedMap.entrySet());

		// 2. Sort list with Collections.sort(), provide a custom Comparator.
		// Just switch o2 to o1 to reverse Order.
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}

		});

		// 3. Dump the sorted List in a LinkedHashMap
		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		return sortedMap;
	}

	public static <K, V> void printMap(Map<K, V> map) {
		for (Map.Entry<K, V> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("z", 7);
		map.put("b", 4);
		map.put("a", 6);
		map.put("c", 9);

		System.out.println("Unsorted Map");
		printMap(map);

		System.out.println("\nSorted Map by Value");
		Map<String, Integer> sortedMap = sortByValue(map);
		printMap(sortedMap);
	}

}
