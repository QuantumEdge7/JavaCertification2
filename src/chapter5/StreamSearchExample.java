package chapter5;

import java.util.List;
import java.util.Optional;

public class StreamSearchExample {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(10, 15, 20, 25, 30, 35);
		System.out.println("Numbers: " + numbers);

		// Find the first element in the stream
		Optional<Integer> firstElement = numbers.stream().findFirst();
		System.out.println("First element: " + firstElement.orElse(-1));

		// find any element in the stream
		Optional<Integer> anyElement = numbers.stream().findAny();
		System.out.println("Any element: " + anyElement.orElse(-1));

		// check if any number is greater than 20
		boolean anyGreaterThan20 = numbers.stream().anyMatch(num -> num > 20);
		System.out.println("Any numbers greater than 20: " + anyGreaterThan20);

		// check if all numbers are even
		boolean allEven = numbers.stream().allMatch(num -> num % 2 == 0);
		System.out.println("Are all numbers even? " + allEven);

		// check if no number is negative
		boolean noneNegative = numbers.stream().noneMatch(num -> num < 0);
		System.out.println("Are no numbers negative? " + noneNegative);

	}
}
