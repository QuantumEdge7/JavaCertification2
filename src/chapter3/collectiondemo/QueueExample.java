package chapter3.collectiondemo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
//		Queue<String> queue = new LinkedList<>();
//		queue.offer("Element1");
//		queue.offer("Element2");
//		queue.offer("Element3");
//
//		System.out.println("Queue is: " + queue);
//
//		System.out.println("head of the queue: " + queue.peek());
//		System.out.println("Removed using poll method: " + queue.poll());
//
//		System.out.println("Queue afte polling is: " + queue);
//
//		System.out.println("Removed using remove method: " + queue.remove());
//		System.out.println("Queue after removal is: " + queue);

		Deque<String> queue1 = new ArrayDeque<>();
		queue1.add("Susan");
		queue1.add("Allen");
		queue1.add("David");
		System.out.println(queue1.pop());
		System.out.println(queue1.remove());
		System.out.println(queue1);

	}

}
