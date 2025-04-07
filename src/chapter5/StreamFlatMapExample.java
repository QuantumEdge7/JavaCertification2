package chapter5;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StreamFlatMapExample {
    public static void main(String[] args) {
        List<List<String>> listOfLists = List.of(
                List.of("Alice", "Bob"),
                List.of("Charlie", "David"),
                List.of("Eve")
        );

//        System.out.println("Original List of lists: " + listOfLists);

        List<String> flattenList = listOfLists.stream()
                .flatMap(Collection::stream)
                .toList();
//        System.out.println("Flattened list: " + flattenList);

        List<int[]> listOfArrays = List.of(
                new int[]{1, 2},
                new int[]{3, 4, 5},
                new int[]{6}
        );
//        System.out.println("original list of arrays: " + listOfArrays);

        List<Integer> flatenedArrayList = listOfArrays.stream()
                .flatMapToInt(Arrays::stream)
                .boxed()
                .toList();
//        System.out.println("Flattened array list: " + flatenedArrayList);

        List<PersonForFlatMap> people = List.of(
                new PersonForFlatMap("Alice", List.of("Reading", "Travelling")),
                new PersonForFlatMap("Bob", List.of("Sports", "Music")),
                new PersonForFlatMap("Charlie", List.of("Gaming", "Coding"))
        );
        System.out.println("Original list of people: " + people);

        List<String> hobbies = people.stream()
                .flatMap(person -> person.getHobbies().stream())
                .toList();
        System.out.println("Flattened hobbies: " + hobbies);
    }
}
