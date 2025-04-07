package chapter6;

import java.util.Scanner;

//try-catch-finally
public class ExceptionDemo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = input.nextInt();
        System.out.println("Enter b: ");
        int b = input.nextInt();
        try {
            System.out.println("inside try start");
            int div = divide(a, b);
            System.out.println("division is: " + div);
            System.out.println("inside try end");
        } catch (ArithmeticException ae) {
            System.out.println("inside catch block");
        } finally {
            //finally block always executes
            System.out.println("inside finally block");
            input.close();
        }

        System.out.println("End");
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
