package chapter3.collectiondemo;

import java.util.ArrayDeque;

public class ArrayDequeExample1 {

	public static void main(String[] args) {
		ArrayDeque<String> deque = new ArrayDeque<>();

		deque.addFirst("John");
		deque.addLast("Alice");
		deque.addFirst("Bob");
		deque.addLast("Eve");
		System.out.println("Deque is: " + deque);

		System.out.println("First element: " + deque.getFirst());
		System.out.println("Last element: " + deque.getLast());

		System.out.println("Remove first: " + deque.removeFirst());
		System.out.println("Remove last: " + deque.removeLast());

		//use as a stack(LIFO)
		deque.push("Charlie");
		System.out.println("After push: " + deque);
		System.out.println("Popped element: " + deque.pop());
		System.out.println("After pop: " + deque);
		
		
		//use as a queue(FIFO)
		deque.offer("David");
		System.out.println("After offer: "+deque);
		System.out.println("Popped element: " + deque.pop());
		System.out.println("After pop: " + deque);

	}

}
