package chapter3.collectiondemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {

	public static void main(String[] args) {
		Map<Integer, String> studentMap =  new HashMap<>();
		studentMap.put(100, "Faiza");
		studentMap.put(101, "Sarita");
		studentMap.put(105, "Ramesh");
		studentMap.put(108, "John");
		System.out.println(studentMap);
		studentMap.put(101, "Raju");
		studentMap.put(null, "Raju");
		System.out.println(studentMap);
		System.out.println(studentMap.get(105));
		System.out.println(studentMap.get(104));
		System.out.println(studentMap.get(109));
		System.out.println(studentMap.containsKey(102));
		System.out.println(studentMap.containsValue("Raju"));
		System.out.println(studentMap.size());
		studentMap.clear();
		System.out.println(studentMap);
		System.out.println(studentMap.isEmpty());
	}

}
