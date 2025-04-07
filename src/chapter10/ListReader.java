package chapter10;

import java.util.List;

public class ListReader implements Runnable {
    private List<String> list;

    public ListReader(List<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (String s : list) {
            System.out.println(Thread.currentThread().getName() + " read: " + s);
        }
    }
}
