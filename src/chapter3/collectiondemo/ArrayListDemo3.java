package chapter3.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al);
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		
		System.out.println("==========");
		
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("==========");
		for(int a: al) {
			System.out.println(a);
		}
		
		System.out.println("==========");
		Iterator<Integer>  it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("==========");
		ListIterator<Integer> lit = al.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}

		System.out.println();
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}

}
