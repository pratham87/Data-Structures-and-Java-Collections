package queuePriorityQueueExample.comparable;

import java.util.PriorityQueue;

public class Driver {

	public static void main(String[] args) {
		// PriorityBlockingQueue<Airplane> queue = new
		// PriorityBlockingQueue<Airplane>();

		PriorityQueue<Airplane> queue = new PriorityQueue<>();

		queue.add(new Airplane(1, true));
		queue.add(new Airplane(2, false));
		queue.add(new Airplane(3, true));
		queue.add(new Airplane(4, false));

		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}

}
