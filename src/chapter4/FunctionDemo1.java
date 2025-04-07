package chapter4;

import java.util.List;
import java.util.function.Function;

public class FunctionDemo1 {
    public static void main(String[] args) {
        // converting int to String
        Function<Integer, String> intToString = Object::toString;
//        System.out.println(intToString.apply(123)); //123

        //How to use Function<T,R> on List
        List<String> names = List.of("Alice", "Bob", "Charlie");
        Function<String, Integer> stringLength = String::length;
        List<Integer> lengths = names.stream()
                .map(stringLength)
                .toList();
        System.out.println(lengths); //[5,3,7]
    }
}
