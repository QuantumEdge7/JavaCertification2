package chapter8;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamConsoleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lines of text(type exit to stop)");

        List<String> lines = scanner.tokens()
                .takeWhile(line -> !line.equalsIgnoreCase("exit"))
                .toList();
        System.out.println("\nyou entered: ");
        lines.forEach(System.out::println);
    }
}
