package chapter3.collectiondemo;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeExample2 {

	public static void main(String[] args) {
		Queue<String> deQueue = new ArrayDeque<>();

		deQueue.offer("A");
		deQueue.offer("B");
		deQueue.offer("C");

		while (!deQueue.isEmpty()) {
			System.out.println("polled: " + deQueue.poll());
		}

	}

}
