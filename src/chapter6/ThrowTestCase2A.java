package chapter6;

import java.io.IOException;

public class ThrowTestCase2A {
    public static void main(String[] args) throws IOException {
        M m = new M();
        m.method();
        System.out.println("normal flow");
    }
}
