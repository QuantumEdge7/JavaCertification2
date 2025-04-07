package chapter4;

import java.util.function.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PrimitiveFunctionInterfaceDemo {

    public static void main(String[] args) {
        //IntConsumer: accepts an int and performs an operation
//        IntConsumer intConsumer = value -> System.out.println("IntConsumer received: " + value);
//        intConsumer.accept(22); //IntConsumer received: 22

//        IntPredicate isEven = value -> value % 2 == 0;
//        System.out.println("Is 22 even? " + isEven.test(22));
//        //Is 22 even? true
//
//        IntFunction<String> intToString = value -> "The number is: " + value;
//        System.out.println(intToString.apply(22)); //The number is: 22
//
//        IntUnaryOperator square = value -> value * value;
//        System.out.println("Square of 22 is: " + square.applyAsInt(22));
//        //Square of 22 is: 484
//
//        IntBinaryOperator add = (a, b) -> a + b;
//        System.out.println("Sum of 20 and 24 is: " + add.applyAsInt(20, 24));
//        //Sum of 20 and 24 is: 44
//
//        LongSupplier currentTimeInMillis = System::currentTimeMillis;
//        System.out.println("Current time in millis: " + currentTimeInMillis.getAsLong());
//        //Current time in millis: 1738079437726
//
//        DoubleConsumer doubleConsumer = value -> System.out.println("DoubleConsumer received: " + value);
//        doubleConsumer.accept(3.1459);
//        //DoubleConsumer received: 3.1459
//
//        DoubleUnaryOperator half = value -> value / 2;
//        System.out.println("Half of 3.159: " + half.applyAsDouble(3.1459));
//        //Half of 3.159: 1.57295
//
//        IntStream.range(1, 5).forEach(System.out::println);
//
//
//        IntPredicate isPrime = n -> n > 1 && IntStream.range(2, n).noneMatch(i -> n % i == 0);
//        IntStream.range(1, 11)
//                .filter(isPrime)
//                .forEach(System.out::println);
//
//        LongUnaryOperator factorial = n -> {
//            long result = 1;
//            for (long i = 1; i <= n; i++) {
//                result *= i;
//            }
//            return result;
//        };
//        long number = 5;
//        System.out.println("Factorial of " + number + " is: " + factorial.applyAsLong(number));
//
//        DoubleFunction<Double> calculateArea = radius -> Math.PI * radius * radius;
//        double radius = 7.5;
//        System.out.println("Area of circle with radius " + radius + " is: " + calculateArea.apply(radius));
//        //Area of circle with radius 7.5 is: 176.71458676442586
//
//        IntBinaryOperator sum = Integer::sum;
//        int a = 15;
//        int b = 25;
//        System.out.println("Sum of " + a + " and " + b + " is: " + sum.applyAsInt(a, b));
//       // Sum of 15 and 25 is: 40
//
//        IntConsumer printSquare = n -> System.out.println("Square of " + n + " is: " + (n * n));
//        System.out.println("Squares of number from 1 to 5: ");
//        for (int i = 1; i <= 5; i++) {
//            printSquare.accept(i);
//        }
//
//        DoubleToIntFunction doubleToIntFunction = value -> (int) Math.round(value);
//        System.out.println("Rounded value is: " + doubleToIntFunction.applyAsInt(12.34));
//        //Rounded value is: 12

//
//        IntFunction<String> numberToString = n -> "Number: " + n;
//        IntStream.range(1, 6)
//                .mapToObj(numberToString)
//                .forEach(System.out::println);
//
        DoublePredicate isGreaterThanTwo = d -> d > 2.0;
        DoubleStream.of(1.5,2.0,2.5,3.0)
                .filter(isGreaterThanTwo)
                .forEach(System.out::println);
//
//        LongToDoubleFunction kilometerToMiles = km -> km * 0.621371;
//        System.out.println("Distance in miles: "+ kilometerToMiles.applyAsDouble(100));
//        //Distance in miles: 62.137100000000004

        String str = "Java is a programming language";
        ToIntFunction<String> indexVal = str:: indexOf;// line n1
        int x = indexVal.applyAsInt("Java"); //line n2
        System.out.println(x); //0
    }
}


