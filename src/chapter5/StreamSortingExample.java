package chapter5;

import java.util.Comparator;
import java.util.List;

public class StreamSortingExample {

    public static void main(String[] args) {
//        List<Integer> numbers = List.of(50, 10, 40, 30, 20);
//        System.out.println("Original list is: " + numbers);
//        List<Integer> sortAsc = numbers.stream()
//                .sorted()
//                .toList();
//        System.out.println("Sorted in ascending order: " + sortAsc);
//
//        List<Integer> sortDesc = numbers.stream()
//                .sorted(Comparator.reverseOrder())
//                .toList();
//        System.out.println("Sorted in descending order: " + sortDesc);

        List<Person> people = List.of(
                new Person("Alice", 25, 6.3),
                new Person("Bob", 20, 5.3),
                new Person("Charlie", 30, 5.5)
        );
//        System.out.println("original list of people: " + people);

//        //sort people by age(ascending)
//        List<Person> sortedByAgeDesc = people.stream()
//                .sorted(Comparator.comparing(Person::getAge))
//                .toList();
//        System.out.println("Sorted by Age(Ascending): " + sortedByAgeDesc);

        //sort people by name(descending)
        List<Person> sortedByNameDesc = people.stream()
                .sorted(Comparator.comparing(Person::getName).reversed())
                .toList();
        System.out.println("Sorted by name(descending): " + sortedByNameDesc);

    }
}
