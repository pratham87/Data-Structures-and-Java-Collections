package hashmapAndHashtable.MapSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortEntryObjects {

	// Java 8
	public static void sortEntryObjectsJava8(Map<String, Long> map) {
		map.entrySet().stream()
				.sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
				.collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
	}

	// Java 7
	public static void sortEntryObjectsJava7(Map<String, Long> map) {
		List<Map.Entry<String, Long>> list = new ArrayList<>(map.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<String, Long>>() {

			@Override
			public int compare(Entry<String, Long> e1, Entry<String, Long> e2) {
				return e1.getValue().compareTo(e2.getValue());
			}
		});
	}

	public static void main(String s[]) {

		Map<String, Long> map2 = new HashMap<>();
		map2.put("adam", 21L);
		map2.put("john", 3L);
		map2.put("kay", 200L);

		sortEntryObjectsJava8(map2);
	}

}
