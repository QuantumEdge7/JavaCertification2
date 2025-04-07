package chapter6;

import java.io.IOException;

public class ThrowTestCase1 {

    public static void main(String[] args) {
        //the code will be executed fine
        //whether exception during program or not i.e. we handled the exception
        M  obj = new M();
        obj.method();
        System.out.println("===");
    }
}
