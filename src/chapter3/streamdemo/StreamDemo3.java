package chapter3.streamdemo;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo3 {

	public static void main(String[] args) {
		Map<Integer, String> map = Map.of(1, "A", 2, "B", 3, "C");
		
		map.entrySet().stream().filter(entry -> entry.getKey() > 1)
		.forEach(entry -> System.out.println(entry.getValue()));
		
		System.out.println("============");
		Map<Integer, String> filteredMap = map.entrySet().stream()
				.filter(entry -> entry.getKey() > 1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(filteredMap);

	}

}
