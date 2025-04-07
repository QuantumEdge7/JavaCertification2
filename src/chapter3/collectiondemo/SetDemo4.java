package chapter3.collectiondemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo4 {

	public static void main(String[] args) {
		Set<Integer> hst = new HashSet<>();
		hst.add(40);
		hst.add(20);
		hst.add(10);
		hst.add(30);
		hst.add(40);

		System.out.println("hash set is: "+hst);
		
		Set<Integer> lhs = new LinkedHashSet<>();
		lhs.add(40);
		lhs.add(20);
		lhs.add(10);
		lhs.add(30);
		lhs.add(40);

		System.out.println("linked hash set is: "+lhs);
		
		Set<Integer> ts = new TreeSet<>();
		ts.add(40);
		ts.add(20);
		ts.add(10);
		ts.add(30);
		ts.add(40);

		System.out.println("tree hash set is: "+ts);

	}

}
