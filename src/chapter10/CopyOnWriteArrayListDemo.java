package chapter10;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();

        Thread writer1 = new Thread(new ListWriter(list, "Java"));
        Thread writer2 = new Thread(new ListWriter(list, "Concurrency"));
        Thread reader = new Thread(new ListReader(list));

        writer1.start();
        writer2.start();

        try {
            writer1.join();
            writer2.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        reader.start();
    }
}
