package chapter10;

import java.util.List;

public class ListWriter implements Runnable {
    private List<String> list;
    private String value;

    public ListWriter(List<String> list, String value) {
        this.list = list;
        this.value = value;
    }

    @Override
    public void run() {
        list.add(value);
        System.out.println(Thread.currentThread().getName() + " added: " + value);
    }
}
