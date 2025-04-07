package chapter5;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamCalculationExample {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(10, 20, 30, 40, 50, 20, 10, 30);
		List<Integer> uniqueSortedNumbers = numbers.stream().distinct()// remove duplicates
				.filter(num -> num > 20)// filter number greater than 20
				.sorted()// sort in ascending order
				.collect(Collectors.toList());
		System.out.println("Unique and sorted numbers greater than 20: " + uniqueSortedNumbers);

		// count
		long count = numbers.stream().count();
		System.out.println("Total count of numbers: " + count);

		// min and max
		Optional<Integer> min = numbers.stream().min(Comparator.naturalOrder());
		Optional<Integer> max = numbers.stream().max(Comparator.naturalOrder());
		System.out.println("Minimum number: " + min.orElse(-1));
		System.out.println("Maximum number: " + max.orElse(-1));

		// sum
		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of all numbers: " + sum);

		// Average
		double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println("Average of numbers: " + average);

		// reduce for custom calculation(Product of all numbers)
		Optional<Integer> product = numbers.stream().reduce((a, b) -> a * b);
		System.out.println("Product of all numbers: " + product.orElse(1));

		// Use reduce to concatenate elements into a string
		String concatenated = numbers.stream().map(String::valueOf)// convert numbers to strings
				.reduce((a, b) -> a + "," + b)// concatenate with commas
				.orElse("");
		System.out.println("Concatenated numbers: " + concatenated);

	}

}
