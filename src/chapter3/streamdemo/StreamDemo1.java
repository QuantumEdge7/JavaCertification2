package chapter3.streamdemo;

import java.util.List;
import java.util.stream.Stream;


//Intermediate Operations
public class StreamDemo1 {

	public static void main(String[] args) {
//		Stream.of("banana", "orange", "apple", "guava", "papaya", "kiwi", "avocado")
//		.map(str -> str.length())
//		.filter(i -> i > 5 )
//		.limit(3)
//		.forEach(System.out::println);

		List<String> names = List.of("John", "Jack", "Tom");
		names.stream().filter(name -> name.startsWith("J")).forEach(System.out::println);

		System.out.println("======");

		names.stream().map(String::toUpperCase).forEach(System.out::println);

		System.out.println("==========");
		List<Integer> numbers1 = List.of(4, 2, 5, 9, 1);
		numbers1.stream().sorted().forEach(System.out::println);
		
		System.out.println("==========");
		List<Integer> numbers2 = List.of(4, 2, 4, 2, 1);
		numbers2.stream().distinct().forEach(System.out::println);
		
		System.out.println("==========");
		Stream<Integer> stream = Stream.of(1,2,3,4,5);
		//stream.limit(3).forEach(System.out::println);
		
		System.out.println("==========");
		stream.skip(2).forEach(System.out::println);

	}

}
