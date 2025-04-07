package chapter3.streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationsDemo {

	public static void main(String[] args) {
		//1. from a collection
		List<Integer> list = List.of(10,20,30);
		Stream<Integer> stream = list.stream();
		Stream<Integer> pStream = list.parallelStream();
		
		//2. From arrays
		String [] array = {"a", "v", "d"};
		Stream<String> str = Arrays.stream(array);
		
		//3.Using Stream.of()
		Stream<Integer> strm = Stream.of(1,2,3,4);
		
		//4.from a generator or an iterator
		Stream<Double> randomNumber = Stream.generate(Math::random).limit(10);
		Stream<Integer> oddNumbers = Stream.iterate(1, n-> n+2);
		
		//5.Empty stream
		Stream<String> emptyStream = Stream.empty();

	}

}
