package chapter4;

import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo1 {
    public static void main(String[] args) {
        Predicate<String> isNotEmpty = s -> s != null && !s.isEmpty();
        System.out.println(isNotEmpty.test("Hello")); //true
        System.out.println(isNotEmpty.test(""));//false

        // How to filter a List using Predicate<T>
        List<Integer> numbers = List.of(10, 15, 20, 25, 30);
        Predicate<Integer> isEven = n -> n % 2 == 0;
        numbers.stream()
                .filter(isEven) //.filter(n -> n % 2 == 0)
                .forEach(System.out::println);
        /*   10
             20
             30*/

        System.out.println("=========");
        //odds
        numbers.stream()
                .filter(n -> n % 2 != 0)
                .forEach(System.out::println);
    }
}
