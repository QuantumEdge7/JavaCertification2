package chapter3.collectiondemo;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

		priorityQueue.offer(100);
		priorityQueue.offer(20);
		priorityQueue.offer(30);
		priorityQueue.offer(10);

		System.out.println("Priority queu is: " + priorityQueue);
		
		System.out.println("Head of queue: "+priorityQueue.peek());
		
		while(!priorityQueue.isEmpty()) {
			System.out.println("removed: "+priorityQueue.poll());
		}
	}

}
