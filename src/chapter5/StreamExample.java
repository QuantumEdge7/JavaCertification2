package chapter5;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		List<Person> peoples = List.of(new Person("Alice", 25, 5.5), new Person("Bob", 30, 6.0),
				new Person("Charlie", 35, 5.9));

		System.out.println("Extracting names using peek and map: ");
		List<String> names = peoples.stream()
				.peek(person -> System.out.println("Before mapping: " + person))
				.map(Person::getName)
				.peek(name -> System.out.println("After mapping: " + name))
				.collect(Collectors.toList());
		System.out.println("Names: " + names);
		
		System.out.println("Calculate age: ");
		int totalAge = peoples.stream()
				.mapToInt(Person::getAge)
				.peek(age -> System.out.println("Age: "+age))
				.sum();
		System.out.println("Total age: " + totalAge);
		
		
		System.out.println("Calculate average heights: ");
		double averagHeight = peoples.stream()
				.mapToDouble(Person::getHeight)
				.peek(height -> System.out.println("Height: "+height))
				.average()
				.orElse(0.0);
		System.out.println("Average height: " + averagHeight);

	}

}
