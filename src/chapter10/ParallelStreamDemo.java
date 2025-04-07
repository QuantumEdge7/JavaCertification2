package chapter10;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //reduction
        int sum = numbers.parallelStream()
                .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        //decomposition
        List<String> names = List.of("John", "Jack", "Jane", "Jill", "Joe", "James");
        List<String> upperNames = names.parallelStream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(upperNames);

        //Merging
        Set<Integer> evenNumbers = numbers.parallelStream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println("Even numbers: " + evenNumbers);


        //Pipeline
        List<String> fruitNames = List.of("apple", "banana", "cherry", "date", "mango", "kiwi");
        List<String> result = fruitNames.parallelStream()
                .filter(fName -> fName.length() > 5)
                .map(String::toUpperCase)
                .sorted()
                .toList();
        System.out.println(result);
    }
}
