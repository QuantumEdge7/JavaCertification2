package chapter4;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo1 {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;
        print.accept("Hello World!!!");

        //How to use Consumer<T> on List
        List<String> names = List.of("Alice", "Bob", "Charlie");
//        Consumer<String> printName = name -> System.out.println("Name: "+name);
//        names.forEach(printName);
    }
}
