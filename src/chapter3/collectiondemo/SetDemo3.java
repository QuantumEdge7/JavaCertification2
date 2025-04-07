package chapter3.collectiondemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo3 {

	public static void main(String[] args) {
		Set<Integer> st = new HashSet<>();
		st.add(40);
		st.add(20);
		st.add(30);
		st.add(40);

		for (int s : st) {
			System.out.println(s);
		}

		System.out.println("==================");
		Iterator<Integer> it = st.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
