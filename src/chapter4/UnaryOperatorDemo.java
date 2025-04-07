package chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

    public static void main(String[] args) {
        UnaryOperator<Integer> doubleValue = x -> x * 2;
        int result = doubleValue.apply(4);
        System.out.println("Doubled value is: " + result); //Doubled value is: 8

        UnaryOperator<String> toUpperCase = String::toUpperCase;
        System.out.println("Uppercase is: " + toUpperCase.apply("helloo"));
        //Uppercase is: HELLOO

        UnaryOperator<Integer> increment = x -> x + 1;
        System.out.println("Incremented number is: " + increment.apply(10));
        //Incremented number is: 11

        UnaryOperator<String> reverseString = str -> new StringBuilder(str).reverse().toString();
        System.out.println("reversed string is: " + reverseString.apply("Good Morning"));
        //reversed string is: gninroM dooG

        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        UnaryOperator<Integer> doubled = x -> x * 2;
        numbers.replaceAll(doubled);
        System.out.println("Doubled list: " + numbers);
        //Doubled list: [2, 4, 6, 8, 10]

    }
}
