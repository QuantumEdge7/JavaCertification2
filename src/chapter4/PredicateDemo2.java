package chapter4;

import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo2 {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "Amanda");
        //find names that startsWith "A"
        Predicate<String> startsWithA = name -> name.startsWith("A");
        List<String> filteredNames = names.stream()
                .filter(startsWithA)
                .toList();
        System.out.println("Names starts with A: " + filteredNames);

        //Names starts with A: [Alice, Amanda]
}}
