package chapter6;

import java.io.IOException;

public class M {

    void method () {
        try {
            throw new IOException("device error");
        } catch (IOException e) {
            throw new RuntimeException(e); //??
        }

//        throw new IOException("device error");

        //if we "throw" a new exception inside a method, it must
        //be either declared in method signature using "throws" clause or
        //surrounded by try-catch block


        //case 2
//        System.out.println("device operation performed");
    }
}
