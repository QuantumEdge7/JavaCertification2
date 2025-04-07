package chapter3.collectiondemo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<Integer> al1 = new LinkedList<>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		System.out.println(al1);
		al1.add(1, 15);
		System.out.println(al1);
		al1.remove(2);
		System.out.println(al1);
		al1.set(2, 25);
		System.out.println(al1);
		System.out.println(al1.size());
//		al.clear();
		System.out.println(al1);
		System.out.println(al1.isEmpty());
		System.out.println(al1.indexOf(15));
		System.out.println(al1.contains(20));
		System.out.println(al1.get(1));

		System.out.println("============");

		List<Integer> al2 = new LinkedList<>();
		al2.add(50);
		System.out.println(al2);
		// al2.addAll(al1);
		al2.addAll(0, al1);
		System.out.println(al2);
		// al2.removeAll(al1);
		// al2.retainAll(al1);
		System.out.println(al2);
		al2.replaceAll(n -> n + 2);
		System.out.println(al2);

	}

}
