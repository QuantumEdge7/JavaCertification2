package chapter3.collectiondemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
		Set<Integer> st = new HashSet<>();
		st.add(10);
		st.add(20);
		st.add(30);
		System.out.println(st);
	}

}
