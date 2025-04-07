package chapter4;

import java.util.List;
import java.util.function.Function;

public class FunctionDemo2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Function<Integer, Integer> square = num -> num * num;

        //Converting Integer to Integer (collecting squares)
        List<Integer> squares = numbers.stream()
                .map(square)
                .toList();
        System.out.println("Squared numbers: " + squares);

        //Squared numbers: [1, 4, 9, 16, 25]
    }
}
