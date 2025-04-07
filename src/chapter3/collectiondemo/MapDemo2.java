package chapter3.collectiondemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {
		Map<Integer, String> studentMap =  new HashMap<>();
		studentMap.put(100, "Faiza");
		studentMap.put(101, "Sarita");
		studentMap.put(105, "Ramesh");
		studentMap.put(108, "John");
		System.out.println(studentMap);
		
		for(Map.Entry<Integer, String> students: studentMap.entrySet()) {
			System.out.println(students.getKey() +" "+students.getValue());
		}

	}

}
