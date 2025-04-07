package chapter3.collectiondemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo3 {

	public static void main(String[] args) {
		Map<Integer, String> hMap = new HashMap<>();
		hMap.put(504, "Saina");
		hMap.put(108, "John");
		hMap.put(101, "Sarita");
		hMap.put(104, "Eliza");
		hMap.put(102, "Faiza");
		hMap.put(100, "Jack");
		hMap.put(105, "Ramesh");
		System.out.println("hash map is: " + hMap);
		
		Map<Integer, String> lhMap = new LinkedHashMap<>();
		lhMap.put(504, "Saina");
		lhMap.put(108, "John");
		lhMap.put(101, "Sarita");
		lhMap.put(104, "Eliza");
		lhMap.put(102, "Faiza");
		lhMap.put(100, "Jack");
		lhMap.put(105, "Ramesh");
		System.out.println("linked hash map is: " + lhMap);
		
		Map<Integer, String> tMap = new TreeMap<>();
		tMap.put(504, "Saina");
		tMap.put(108, "John");
		tMap.put(101, "Sarita");
		tMap.put(101, "Sarita");
		tMap.put(104, "Eliza");
		tMap.put(102, "Faiza");
		tMap.put(100, "Jack");
		tMap.put(105, "Ramesh");
		System.out.println("tree map is: " + tMap);

	}

}
