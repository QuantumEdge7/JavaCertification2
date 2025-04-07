package chapter8;

import java.util.Scanner;

public class ConsoleInputOutputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Name is: " + name);//Name is: Faiza
        System.out.println("Age is: " + age);//Age is: 29
    }
}
