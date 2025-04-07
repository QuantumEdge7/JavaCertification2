package chapter3.streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferenceDemo1 {
    public static void main(String[] args) {
//        //1.Reference to a static method
//        BiFunction<Integer, Integer, Integer> adder = Math::addExact;
//        System.out.println("Sum: " + adder.apply(10, 30));
//        //Sum: 40

//        2.Reference to an Instance Method of a particular Object
//        String message = "Hello, World";
//        Function<String, String> concatStr = message::concat;
//        System.out.println(concatStr.apply(" How are you?"));
//        //Hello, World How are you?
//
//        //3.Reference to an Instance Method of an Arbitrary Object of a particular type
//        List<String> names = List.of("Alice", "Bob", "Charlie");
//        names.forEach(System.out::println);
//
        //Reference to a constructor
//        Function<String, User> userCreate = User::new;// calling constructor
//        User user = userCreate.apply("John Doe");
//        System.out.println(user); //User{name='John Doe'}
//
        //sorting
//        List<String> fruits = new ArrayList<>(List.of("Banana", "Apple", "Cherry"));
//        fruits.sort(String::compareToIgnoreCase);
//        fruits.forEach(System.out::println);
//
//        BiFunction<Integer, Integer, Integer> multiplier = Calculator::multiply;
//        System.out.println("Multiplication is: " + multiplier.apply(2, 8));
//        //Multiplication is: 16
//
//        //chained
        Function<String, String> getCertificationName =
                CertificationHelper::getCertificationName;
        String result = getCertificationName.apply("demo");
        System.out.println(result); //DEMO

        Function<String, String> getFullCertificationName =
                CertificationHelper::addSuffix;

        System.out.println(getFullCertificationName.apply("Java 8"));//Java 8 Certification


    }
}
