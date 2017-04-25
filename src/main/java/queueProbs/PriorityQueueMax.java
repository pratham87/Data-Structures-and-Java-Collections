package queueProbs;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueMax {

	public static void getMax() {
		PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1 < o2){ return 1;}
				if(o1 > o2){ return -1;}
				return 0;
			}
		});
		
		// Method 1: Using lambda expression
		// PriorityQueue<Integer> pq = new PriorityQueue<>((x,y) -> y-x);
		
		//Method 2 
		//PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		
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
		getMax();
	}

}
