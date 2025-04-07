package chapter3.streamdemo;

import java.util.List;
import java.util.stream.Collectors;

//Terminal operations
public class StreamDemo2 {

	public static void main(String[] args) {
		List<Integer> numbers1 = List.of(4, 2, 5, 9, 8, 1);
		numbers1.stream().forEach(System.out::println);
		
		System.out.println("============");
		List<Integer> evenNumbers =numbers1.stream().filter(n -> n % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		System.out.println("============");
		int sum = numbers1.stream().reduce(0, Integer::sum);
		System.out.println(sum);
		
		System.out.println("============");
		long count = numbers1.stream().filter(n -> n>2).count();
		System.out.println(count);
		
		System.out.println("============");
		boolean r = numbers1.stream().anyMatch( n ->  n > 9);
		System.out.println(r);

	}

}
