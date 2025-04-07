package chapter6;

import java.io.IOException;

public class ThrowTest1 {

    void m() throws IOException {
        System.out.println("inside m");
    }

    void n () throws Exception {
        m();
    }

    void p (){
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handles");
        }
    }

    public static void main(String[] args) {
        ThrowTest1 obj = new ThrowTest1();
        obj.p();
        System.out.println("program end");
    }
}
