package chapter4;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class BinaryFunctionInteraceDemo {

    public static void main(String[] args) {
        BiFunction<String, String, String> concatenate = (str1, str2) -> str1 + " " + str2;
        String result = concatenate.apply("Hello", "World");
        System.out.println("BiFunction result: " + result); //BiFunction result: Hello World

        BiConsumer<Integer, Integer> printSum = (num1, num2) ->
                System.out.println("Result is: " + (num1 + num2));
        printSum.accept(10, 20); //Result is: 30

        BinaryOperator<Integer> maxFinder = Integer::max;
        int max = maxFinder.apply(15, 25);
        System.out.println("Max number is: " + max); //Max number is: 25

        BiPredicate<Integer, Integer> isGreaterThanThreshold = (num1, num2) -> (num1 + num2) > 50;
        boolean isGreater = isGreaterThanThreshold.test(30, 15);
        System.out.println("Result is: " + isGreater); //Result is: false


    }
}
