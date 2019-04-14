package queueProbs;

import java.util.*;

/*
   Algorithm: O(n)

   1. Push all elements from s1 to s2 for dequeue
   2. Push all elements from s2 to s1 for enqueue

 */
public class QueueUsingStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void enqueue(int x) {
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        s1.push(x);
    }

    public int dequeue() {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        if (s2.isEmpty()) {
            throw new IllegalArgumentException("Queue is Empty");
        }
        return s2.pop();
    }

    public static void main(String[] s) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }

}
