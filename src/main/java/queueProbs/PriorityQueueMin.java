package queueProbs;

import java.util.PriorityQueue;

public class PriorityQueueMin {

	public static void getMins() {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		queue.add(5);
		queue.add(9);
		queue.add(4);
		queue.add(2);
		queue.add(1);

		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
	}

	public static void main(String[] s) {
		getMins();
	}

}
