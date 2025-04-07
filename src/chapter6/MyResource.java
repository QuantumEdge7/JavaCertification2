package chapter6;

public class MyResource implements AutoCloseable {

    //constructor
    public MyResource() {
        System.out.println("Resource created.");
    }

    //child's own method
    public void userResource(){
        System.out.println("using resource.");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Resource closed.");
    }
}
