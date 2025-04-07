package chapter3.streamdemo;

import java.util.List;
import java.util.Scanner;

public class StreamDemo4 {

	public static void main(String[] args) {
		List<Integer> numbers1 = List.of(4, 2, 5, 9, 1);
		numbers1.parallelStream().map(n -> n*n).forEach(System.out::println);

	}

}
