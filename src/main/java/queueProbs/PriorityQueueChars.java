package queueProbs;

import java.util.PriorityQueue;

public class PriorityQueueChars {

	public static void main(String... args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("C");
		pq.add("B");
		pq.add("D");
		pq.add("A");

		System.out.println("After Using add method.");
		for (String s : pq) {
			System.out.println(s);
		}

		System.out.println("\nAfter Using poll method.");
		pq.poll();
		for (String s : pq) {
			System.out.println(s);
		}

		System.out.println("\nAfter Using remove method.");
		pq.remove("D");
		for (String s : pq) {
			System.out.println(s);
		}
	}

}
