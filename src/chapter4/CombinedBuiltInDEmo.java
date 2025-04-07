package chapter4;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class CombinedBuiltInDEmo {

    public static void main(String[] args) {
        List<String> words = List.of("Java", "Functional", "Lambda", "Stream");

        //Filter words whose length is greater than 5 characters
        Predicate<String> lengthGreaterThan5 = word -> word.length() > 5;
        //Convert those words toUpperCase
        Function<String, String> toUpperCase = String::toUpperCase;
        //Print those words
        Consumer<String> printWord = System.out::println;
        words.stream()
                .filter(lengthGreaterThan5)
                .map(toUpperCase)
                .forEach(printWord);
        /*
            FUNCTIONAL
            LAMBDA
            STREAM
        */
    }
}
