package chapter3.collectiondemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo2 {

	public static void main(String[] args) {
		Set<Integer> st = new HashSet<>();
		st.add(40);
		st.add(20);
		st.add(30);
		st.add(40);
		
//		st.add(1, 50);
//		st.set(0, 23);
//		System.out.println(st.get(0));
//		
		
		System.out.println(st);
		
		System.out.println("===========");
		
		List<Integer> al = new ArrayList<>();
		al.add(40);
		al.add(20);
		al.add(30);
		al.add(40);

		System.out.println(al);
		al.add(1, 50);
		al.set(0, 23);
		System.out.println(al.get(0));
		
		System.out.println(al);

	}

}
