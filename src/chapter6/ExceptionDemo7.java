package chapter6;

import java.util.InputMismatchException;
import java.util.Scanner;

//multiple catch
public class ExceptionDemo7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[1];

        try {
            System.out.println("Enter a: ");
            int a = input.nextInt();
            System.out.println("Enter b: ");
            int b = input.nextInt();
            arr[1] = divide(a, b);
            System.out.println("division is: " + arr[1]);
        } catch (ArithmeticException | InputMismatchException ae) {
            System.out.println(ae);
        }  catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("End");
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
