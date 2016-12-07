package arrays;

import java.util.ArrayList;
import java.util.List;

/*
Write a function that takes two lists of strings and return a list of 
Strings with all of the intersections of the strings ex:

List1 = {"a","a","a", "b", "d"}
List2 = {"a", "a", "c", "d"}
expectedReturn={"a","a","d"}
 */
public class Intersection {

	public static void main(String[] args) {

		String[] list1 = { "a", "a", "a", "b", "d" };
		String[] list2 = { "a", "a", "c", "d" };

		System.out.println(intersection(list1, list2));

	}

	public static List<String> intersection(String[] list1, String[] list2) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < list1.length; i++) {

			for (int j = 0; j < list2.length; j++) {
				if (list1[i] == list2[j]) {
					list2[j] = null;
					list.add(list1[i]);
				}

			}
		}
		return list;
	}

}
